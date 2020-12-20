
interface PolitischeRichtung {

	void politischeRichtung();
    
} 
	class AutoRight implements PolitischeRichtung{ 
		
	    public void politischeRichtung() { 
	        System.out.println("Authoritarian Right"); 
	    }
	    
	} 

	class AutoLeft implements PolitischeRichtung { 
		
	    public void politischeRichtung() { 
	        System.out.println("Authoritarian Left"); 
	    } 
	    
	} 

	class LibRight implements PolitischeRichtung{ 
		
	    public void politischeRichtung() { 
	        System.out.println("Libertarian Right"); 
	    } 
	    
	} 

	class LibLeft implements PolitischeRichtung{ 
		
	    public void politischeRichtung() { 
	        System.out.println("Libertarian Left"); 
	    } 
	    
	}


