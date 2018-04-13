package payroll;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create an object of the payroll GUI class
        PayrollGUI p = new PayrollGUI();

        //terminate program when exit
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set title of program
        p.setTitle(" Payroll ");

        //centerlocation of GUI to center of screen
        p.setLocationRelativeTo(null);
        //make GUI visible
        p.setVisible(true);
        //set size of GUI window
        p.setSize(900, 500);

    }

}
