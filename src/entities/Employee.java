/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author aimra
 */
public class Employee {
    
    private int id;
    private String nom;
    private String prenom;
    private String cin;
    private String password;
    
    public Employee (int id, String nom, String prenom, String cin, String password){
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
    }
    
    public Employee (String nom, String prenom, String cin, String password){
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
    }
    
    public int getId (){
        return this.id;
    }
    
    public void setId (int id){
        this.id = id;
    }
    public String getNom (){
        return this.nom;
    }
    
    public void setNom (String nom){
        this.nom = nom;
    }
    public String getPrenom (){
        return this.prenom;
    }
    
    public void setPrenom (String prenom){
        this.prenom = prenom;
    }
    public String getCin (){
        return this.cin;
    }
    
    public void setCin (String cin){
        this.cin = cin;
    }
    public String getPassword (){
        return this.password;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
}
