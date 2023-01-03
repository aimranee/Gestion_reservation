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

public class CategorieService implements IDao <Categorie>{
	

	@Override
	public boolean create(Categorie o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req="INSERT INTO categorie (id,code,libelle) VALUES (NULL,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(req);

            st.setString(1, o.getCode());
            st.setString(2, o.getLibelle());
            st.executeUpdate();
            System.out.println("bien ajouter");
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
	}

	@Override
	public boolean update(Categorie o) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "UPDATE categorie SET code=?,libelle=? WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);

            ps.setString(1, o.getCode());
            ps.setString(2, o.getLibelle());
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
	public boolean delete(Categorie o) {
            // TODO Auto-generated method stub
            Connection con = Connexion.getCon();
            String req = "DELETE FROM categorie WHERE id = ?";
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
	public Categorie findById(int id) {
		// TODO Auto-generated method stub
		Connection con = Connexion.getCon();
        String req = "SELECT * FROM categorie WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                return new Categorie(id, res.getString(2),res.getString(3));
            }
            return null;
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
	}

	@Override
	public List<Categorie> findAll() {
            // TODO Auto-generated method stub
            List<Categorie> listCategories = new ArrayList<>();
            Connection con = Connexion.getCon();
            String req = "SELECT * FROM categorie";
            try{
                PreparedStatement ps = con.prepareStatement(req);
                ResultSet rs = ps.executeQuery();
                while (rs.next()){
                    listCategories.add(new Categorie (rs.getInt(1), rs.getString(2),rs.getString(3)));
                }
                return listCategories;
            } catch(SQLException e){
                System.out.println(e);
            }
            return null;
        }

}
