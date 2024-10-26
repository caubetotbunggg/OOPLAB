package Exercises;

import javax.swing.JOptionPane;

/*
 Questions: 

What happens if users choose “Cancel”? 
ANS: it appears No box
How to customize the options to users, e.g. only two options: “Yes” and “No”, OR “I do” and “I don’t” 
ANS: we can use JOptionPane.showOptionDialog to input custom option
 */
public class ChangeOptionBox {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to first class ticket?");

       // JOptionPane.showOptionDialog(null, args, null, option, option, null, args, args)

    /*  we can implement the code below to change option

        Object[] options = { "I do",
                "I don't" };
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to first class ticket?",
                "Ticket Confirm Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // do not use a custom Icon
                options, // the titles of buttons
                options[0]); // default button title
    */

        JOptionPane.showMessageDialog(null,
                "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}