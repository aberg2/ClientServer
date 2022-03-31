import javax.swing.*;

/**
 * Skapat mars 2022-03-28 - 08:48
 * Main
 * Skriven av coolingen
 */
public class Controller {

    public static void main(String[] args) {


        String[] options = {"Client", "Server"};
        //Integer[] options = {1, 3, 5, 7, 9, 11};
        //Double[] options = {3.141, 1.618};
        //Character[] options = {'a', 'b', 'c', 'd'};
        int x = JOptionPane.showOptionDialog(null, "Vill du köra som Server eller Client?",
                "Välj",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (x == 0) {
        View v = new View();
        }else {
           Model m = new Model();


        }
    }

}