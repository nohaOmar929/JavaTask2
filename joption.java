import javax.swing.JOptionPane;

public class joption {
	public static void main (String[] args){
	
	
		
		
		String n = JOptionPane.showInputDialog("Enter Number1");
		
		String z = JOptionPane.showInputDialog("Enter Number1");
		
		int x = Integer.parseInt(n);
		int y = Integer.parseInt(z);
		
		int add, sub,mult,div,mod;
		
		add = x+y;
		sub = x-y;
		mult = x*y;
		div = x/y;
		mod = x%y;


		
JOptionPane.showMessageDialog(null,"x+y= " + add);
JOptionPane.showConfirmDialog(null, add);


JOptionPane.showMessageDialog(null,"X-Y=" + sub);
/*JOptionPane.showMessageDialog(null,"X*Y="+mult);
JOptionPane.showMessageDialog(null,"X/Y=" +div);
JOptionPane.showMessageDialog(null,"X mod Y =" + mod );
*/




	}//end main
} //end class