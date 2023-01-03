/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.IDao;
import db.Connexion;
import entities.Client;
import entities.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aimra
 */
public class EmployeeService implements IDao <Employee> {

    @Override
    public boolean create(Employee o) {
        Connection con = Connexion.getCon();
        String req="INSERT INTO employee (id,nom,prenom,cin,password) VALUES (NULL,?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(req);

            st.setString(1, o.getNom());
            st.setString(2, o.getPrenom());
            st.setString(3, o.getCin());
            st.setString(4, o.getPassword());
            st.executeUpdate();
            System.out.println("bien ajouter");
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean update(Employee o) {
        Connection con = Connexion.getCon();
            String req = "UPDATE Employee SET nom=?,prenom=?,cin=?,password=? WHERE id = ?";
            try{
                PreparedStatement ps = con.prepareStatement(req);

                ps.setString(1, o.getNom());
                ps.setString(2, o.getPrenom());
                ps.setString(3, o.getCin());
                ps.setString(4, o.getPassword());
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
    public boolean delete(Employee o) {
        
        Connection con = Connexion.getCon();
        String req = "DELETE FROM Employee WHERE id = ?";
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
    public Employee findById(int id) {

        Connection con = Connexion.getCon();
        String req = "SELECT * FROM Employee WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ps.setInt(1, id);
            ResultSet res = ps.executeQuery();
            if(res.next()){
                return new Employee(id, res.getString(2),res.getString(3),res.getString(4),res.getString(5));
            }
            return null;
        } catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {

        List<Employee> listEmployees = new ArrayList<>();
        Connection con = Connexion.getCon();
        String req = "SELECT * FROM Employee";
        try{
            PreparedStatement ps = con.prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                listEmployees.add(new Employee (rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return listEmployees;
        } catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
}
