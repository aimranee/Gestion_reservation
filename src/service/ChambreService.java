package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.IDao;
import db.Connexion;
import entities.Categorie;
import entities.Chambre;
import java.util.Date;

public class ChambreService implements IDao <Chambre>{

	@Override
	public boolean create(Chambre o) {
            // TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req="INSERT INTO Chambre (id,telephone, categorie) VALUES (NULL,?, ?)";
            try {
                PreparedStatement st = con.prepareStatement(req);

                st.setString(1, o.getTelephone());
                st.setObject(2, o.getCategorie().getId());
                st.executeUpdate();
                System.out.println("bien ajouter");
                return true;
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            }
	}

	@Override
	public boolean update(Chambre o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "UPDATE Chambre SET telephone=?, categorie=? WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);

            ps.setString(1, o.getTelephone());
            ps.setObject(2, o.getCategorie());
            ps.setInt(3, o.getId());
            ps.executeUpdate();
            System.out.println("bien modifier");
            return true;
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
	}

	@Override
	public boolean delete(Chambre o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "DELETE FROM Chambre WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);

            ps.setInt(1, o.getId());
            ps.executeUpdate();
            System.out.println("bien supprimer");
            con.close();
            return true;
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
	}

	@Override
	public Chambre findById(int id) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "SELECT * FROM Chambre WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
            	CategorieService cs = new CategorieService();
                return new Chambre(id, res.getString(1), cs.findById(res.getInt(3)));
            }
            return null;
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
	}
        
        public List<Chambre> findByCats(int id) {
		// TODO Auto-generated method stub
            List<Chambre> listChambresB = new ArrayList<>();
            Connection con = Connexion.getCon();
            String req = "SELECT * FROM Chambre WHERE categorie = ?";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    CategorieService cs = new CategorieService();
                    listChambresB.add(new Chambre (rs.getInt(1), rs.getString(2), cs.findById(rs.getInt(3))));
                }
                return listChambresB;
            } catch (SQLException e){
                System.out.println(e);
            }
            return null;
	}
        
	@Override
	public List<Chambre> findAll() {
		// TODO Auto-generated method stub
		List<Chambre> listChambres = new ArrayList<>();
        Connection con = Connexion.getCon();
        String req = "SELECT * FROM Chambre";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            	CategorieService cs = new CategorieService();
            	listChambres.add(new Chambre (rs.getInt(1), rs.getString(2), cs.findById(rs.getInt(3))));
            }
            return listChambres;
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
	}
        
        public List<Chambre> findAllG() {
		// TODO Auto-generated method stub
		List<Chambre> list = new ArrayList<>();
        Connection con = Connexion.getCon();
        String req = "SELECT categorie , count(categorie) FROM Chambre GROUP BY categorie";

        try{
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                CategorieService cs = new CategorieService();
            	list.add(new Chambre(cs.findById(rs.getInt(1)), rs.getInt(2)));
            }
            return list;
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
	}

}
