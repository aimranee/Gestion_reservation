package entities;

import java.util.Date;

public class Reservation {
	private int id;
	private Client client;
	private Chambre chambre;
	private Date datedebut;
	private Date datefin;
        private int nbr;
        private String year;
	
	
	public Reservation(int id, Client client, Chambre chambre, Date datedebut, Date datefin) {
		super();
		this.id = id;
		this.client = client;
		this.chambre = chambre;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
	
	public Reservation(Client client, Chambre chambre, Date datedebut, Date datefin) {
		super();
		this.client = client;
		this.chambre = chambre;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
        
        public Reservation(Client client, Date datedebut, Date datefin) {
		super();
		this.client = client;
		this.datedebut = datedebut;
		this.datefin = datefin;
	}
        
        public Reservation(int nbr, String year) {
		super();
		this.year = year;
		this.nbr = nbr;
	}
	
        public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}
        
        public int getNbr() {
		return nbr;
	}

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public void setNbr(int nbr) {
		this.nbr = nbr;
	}


	public Chambre getChambre() {
		return chambre;
	}


	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	
	
}
