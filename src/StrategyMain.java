
public class StrategyMain {

	public static void main(String[] args) {
		
		PolitischeRichtung autoRight = new AutoRight(); 
		PolitischeRichtung libRight = new LibRight(); 
		PolitischeRichtung autoLeft = new AutoLeft(); 
		PolitischeRichtung libLeft = new LibLeft();
		
        Person_Abstrakt mf = new Milton_Friedman(libRight); 
        Milton_Friedman.display(); 
  
        mf.politischeRichtung(); 
        
        System.out.println("");
        
        Person_Abstrakt rr = new Ronald_Reagen(autoRight); 
        Ronald_Reagen.display(); 
  
        rr.politischeRichtung(); 
        
        
        System.out.println("");
        
        Person_Abstrakt js = new Josef_Stalin(autoLeft); 
        Josef_Stalin.display(); 
  
        js.politischeRichtung(); 
        
        System.out.println("");
        
        Person_Abstrakt mg = new Mahatma_Gandhi(libLeft); 
        Mahatma_Gandhi.display(); 
  
        mg.politischeRichtung(); 


	}

}
