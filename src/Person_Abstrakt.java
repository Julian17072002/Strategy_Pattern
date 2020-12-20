
abstract class Person_Abstrakt {

	PolitischeRichtung politischeRichtung;
	
	public Person_Abstrakt(PolitischeRichtung politischeRichtung) { 
		 this.politischeRichtung = politischeRichtung; 
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
	
	
}
