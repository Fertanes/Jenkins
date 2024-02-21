
import javax.swing.*;

public class cositas {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Mi Aplicación Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        JLabel label = new JLabel("¡Hola, mundo!");
        


        frame.getContentPane().add(label);
        
       
        frame.setSize(300, 200);
        
       
        frame.setVisible(true);
    }
}
