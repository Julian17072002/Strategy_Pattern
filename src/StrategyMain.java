import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class StrategyMain extends JFrame{
		 
		 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


			public StrategyMain(){
		 		super("Political Compass");
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				getContentPane().add(new JLabel(new ImageIcon("Unbenannt.jpg")));
				pack();
				setVisible(true);
		 	}
	  	
	
	public static void main(String[] args) {
		new StrategyMain();
		
		PolitischeRichtung autoRight = new AutoRight(); 
		PolitischeRichtung libRight = new LibRight(); 
		PolitischeRichtung autoLeft = new AutoLeft(); 
		PolitischeRichtung libLeft = new LibLeft();
		
		Herkunft usa = new USA();
		Herkunft india = new India();
		Herkunft russia = new Russia();
		
        Person_Abstrakt mf = new Milton_Friedman(libRight, usa); 
        Milton_Friedman.display(); 
  
        mf.politischeRichtung(); 
        mf.herkunft();
        
        System.out.println("");
        
        Person_Abstrakt rr = new Ronald_Reagen(autoRight, usa); 
        Ronald_Reagen.display(); 
  
        rr.politischeRichtung(); 
        rr.herkunft();
        
        System.out.println("");
        
        Person_Abstrakt js = new Josef_Stalin(autoLeft, russia); 
        Josef_Stalin.display(); 
  
        js.politischeRichtung(); 
        js.herkunft();
        
        System.out.println("");
        
        Person_Abstrakt mg = new Mahatma_Gandhi(libLeft, india); 
        Mahatma_Gandhi.display(); 
  
        mg.politischeRichtung(); 
        mg.herkunft();


	}

}
