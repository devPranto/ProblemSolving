package BackendEngineering.src.GUI;
import javax.swing.JOptionPane;

public class DialogueBox {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Whats Your Name? ");
        JOptionPane.showMessageDialog(null,name);
    }
}
