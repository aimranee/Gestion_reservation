package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IDao;
import db.Connexion;
import entities.Client;

public class ClientService implements IDao <Client>{

	@Override
	public boolean create(Client o) {
            // TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req="INSERT INTO client (id,nom,prenom,email,telephone) VALUES (NULL,?,?,?,?)";
            try {
                PreparedStatement st = con.prepareStatement(req);

                st.setString(1, o.getNom());
                st.setString(2, o.getPrenom());
                st.setString(3, o.getEmail());
                st.setString(4, o.getTelephone());
                st.executeUpdate();
                System.out.println("bien ajouter");
                return true;
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            }
	}

	@Override
	public boolean update(Client o) {
            // TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req = "UPDATE client SET nom=?,prenom=?,email=?,telephone=? WHERE id = ?";
            try{
                PreparedStatement ps = con.prepareStatement(req);

                ps.setString(1, o.getNom());
                ps.setString(2, o.getPrenom());
                ps.setString(3, o.getEmail());
                ps.setString(4, o.getTelephone());
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
	public boolean delete(Client o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "DELETE FROM client WHERE id = ?";
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
	public Client findById(int id) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "SELECT * FROM client WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                return new Client(id, res.getString(2),res.getString(3),res.getString(4),res.getString(5));
            }
            return null;
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		List<Client> listClients = new ArrayList<>();
        Connection con = Connexion.getCon();
        String req = "SELECT * FROM client";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listClients.add(new Client (rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return listClients;
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
	}

}
