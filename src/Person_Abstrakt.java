
abstract class Person_Abstrakt {

	PolitischeRichtung politischeRichtung;
	Herkunft herkunft;
	
	public Person_Abstrakt(PolitischeRichtung politischeRichtung, Herkunft herkunft) { 
		 this.politischeRichtung = politischeRichtung; 
		 this.herkunft = herkunft;
		}
	
	public void politischeRichtung() { 
		politischeRichtung.politischeRichtung(); 
	} 
	
	public PolitischeRichtung getPolitischeRichtung() {
		return politischeRichtung;
	}

	public void setPolitischeRichtung(PolitischeRichtung politischeRichtung) {
		this.politischeRichtung = politischeRichtung;
	}

	public void herkunft() { 
		herkunft.herkunft(); 
	} 
	
	public Herkunft getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(Herkunft herkunft) {
		this.herkunft = herkunft;
	} 
	
	
	
}
