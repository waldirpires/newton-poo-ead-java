package u7.joptionpane;

import javax.swing.JOptionPane;

public class OptionDialogExample {

    public static void main(String[] args) {
        Object[] options = { "OK", "CANCEL", "MAYBE" };
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);
    }
}
