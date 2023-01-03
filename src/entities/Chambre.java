package entities;

public class Chambre {
	private int id;
	private String telephone;
	private Categorie categorie;
	private int nbrC;
	
	public Chambre(String telephone, Categorie categorie) {
		super();
		this.telephone = telephone;
		this.categorie = categorie;
	}
	
	public Chambre(int id, String telephone, Categorie categorie) {
		super();
		this.telephone = telephone;
		this.categorie = categorie;
		this.id = id;
	}
        
        public Chambre(Categorie categorie, int nbrC) {
		super();
		this.nbrC = nbrC;
		this.categorie = categorie;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
        public int getNbrC() {
		return nbrC;
	}
	public void setNbrC(int nbrC) {
		this.nbrC = nbrC;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
        public String toString (){
            return this.id+"";
        }
}
