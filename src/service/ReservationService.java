package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import dao.IDao;
import db.Connexion;
import entities.Chambre;
import entities.Client;
import entities.Reservation;

public class ReservationService implements IDao <Reservation>{
        CategorieService cs = new CategorieService();

	@Override
	public boolean create(Reservation o) {
            // TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            
            
            String req="INSERT INTO Reservation (clientId,chambreId,datedebut,datefin) VALUES (?,?,?,?)";
            try {
                PreparedStatement st = con.prepareStatement(req);

                st.setInt(1, o.getClient().getId());
                st.setInt(2, o.getChambre().getId());
                st.setDate(3, new Date(o.getDatedebut().getTime()));
                st.setDate(4, new Date(o.getDatefin().getTime()));
                st.executeUpdate();
                System.out.println("bien ajouter");
                return true;
            } catch (SQLException e) {
                    System.out.println("error");
                return false;
            }
	}
        
        public boolean verifierRes(Chambre chambre, java.util.Date dateDebut, java.util.Date dateFin){
            Connection con = Connexion.getCon();
            String req = "SELECT * from reservation WHERE chambreId = ? and ((? between dateDebut and dateFin) or (? between dateDebut and dateFin) or (? < dateDebut and ? > dateFin))";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, chambre.getId());
                ps.setDate(2, new Date(dateDebut.getTime()));
                ps.setDate(3, new Date(dateFin.getTime()));
                ps.setDate(4, new Date(dateDebut.getTime()));
                ps.setDate(5, new Date(dateFin.getTime()));
                ResultSet res = ps.executeQuery();
                if(res.next()){
                    return false;
                }
                //return true;
            } catch (SQLException e){
                System.out.println(e);
            }
            return true;
        }

	@Override
	public boolean update(Reservation o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "UPDATE Reservation SET clientId=?,chambreId=?,datedebut=?,datefin=? WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);

            ps.setInt(1, o.getClient().getId());
            ps.setInt(2, o.getChambre().getId());
            ps.setDate(3, new Date(o.getDatedebut().getTime()));
            ps.setDate(4, new Date(o.getDatefin().getTime()));
            
            ps.setInt(5, o.getId());
            ps.executeUpdate();
            System.out.println("bien modifier");
            return true;
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
	}

	@Override
	public boolean delete(Reservation o) {
		// TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req = "DELETE FROM Reservation WHERE id = ?";
            try{
                PreparedStatement ps = con.prepareStatement(req);

                ps.setInt(1, o.getId());
                ps.executeUpdate();
                System.out.println("bien supprimer");
                return true;
            } catch(SQLException e){
                System.out.println(e);
                return false;
            }
	}

	@Override
	public Reservation findById(int id) {
		// TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req = "SELECT * FROM Reservation WHERE id = ?";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, id);
                ResultSet res = ps.executeQuery();
                if(res.next()){
                    ChambreService ch = new ChambreService();
                    ClientService c = new ClientService();
                    return new Reservation(id, c.findById(res.getInt(2)), ch.findById(res.getInt(3)) ,res.getDate(4),res.getDate(5));
                }
                return null;
            } catch (SQLException e){
                System.out.println(e);
            }
            return null;
	}

	@Override
	public List<Reservation> findAll() {
            // TODO Auto-generated method stub
            List<Reservation> listReservations = new ArrayList<>();
            Connection con = Connexion.getCon();
            String req = "SELECT * FROM Reservation";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    ChambreService ch = new ChambreService();
                    ClientService c = new ClientService();
                    listReservations.add(new Reservation (rs.getInt(1), c.findById(rs.getInt(2)), ch.findById(rs.getInt(3)),rs.getDate(4),rs.getDate(5)));
                }
                return listReservations;
            } catch(SQLException e){
                System.out.println(e);
            }
            return null;
	}
        
        public List<Reservation> findAllG(int idc) {
            // TODO Auto-generated method stub
            List<Reservation> listReservations = new ArrayList<>();
            Connection con = Connexion.getCon();
            String req = "SELECT count(YEAR(dateDebut)), YEAR(dateDebut) FROM Reservation WHERE clientId = ? group by YEAR(dateDebut) ";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, idc);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    listReservations.add(new Reservation (rs.getInt(1), rs.getString(2)));
                }
                return listReservations;
            } catch(SQLException e){
                System.out.println(e);
            }
            return null;
	}
	
	public List<Chambre> findChambreBetweenDates (Client client, java.util.Date dateDebut, java.util.Date dateFin){
            
            List<Chambre> listChambres = new ArrayList<>();
            Connection con = Connexion.getCon();
            String req = "SELECT distinct c.* FROM Reservation r, Chambre c where (r.chambreId = c.id) and r.clientId = ? and r.dateDebut between ? and ?";
            
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, client.getId());
                ps.setDate(2, new Date(dateDebut.getTime()));
                ps.setDate(3, new Date(dateFin.getTime()));
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    listChambres.add(new Chambre (rs.getInt(1), rs.getString(2), cs.findById(rs.getInt(3))));
                }
                return listChambres;
            } catch(SQLException e){
                System.out.println(e);
            }
            return listChambres;
		
	}

}
