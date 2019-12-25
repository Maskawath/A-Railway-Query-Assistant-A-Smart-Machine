
package lab_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.jpl7.Atom;
import org.jpl7.Atom.*;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;
import org.jpl7.JPL.*;




public class Lab_project {

    public static void main(String[] args) 
    
    { 
        
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setSize(new Dimension(250, 32));
        panel.setLayout(null);

        JLabel label = new JLabel("Welcome to Bangladesh Railway :)");
        label.setForeground(new Color(255, 255, 0));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 11));
        label.setBounds(0, 0, 250, 32);
        panel.add(label);

        UIManager.put("OptionPane.minimumSize",new Dimension(270, 120));

        Object[] options = {"Dhaka", "Rajshahi", "Dinajpur","Mymensingh"};
        Object ob = JOptionPane.showInputDialog(null, panel, 
                "Mix & Match", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

         System.out.println(ob);
        

    }
        
        
        
        
        
        
        
    }
    

