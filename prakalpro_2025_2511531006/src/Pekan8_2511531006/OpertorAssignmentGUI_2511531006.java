package Pekan8_2511531006;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame; // PENTING: Untuk membuat jendela induk
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class OpertorAssignmentGUI_2511531006 extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    
    
    private int nilaiSaatIni = 10; 
    

    private final JTextField jTextField1 = new JTextField(); 

    /**
     * Launch the application
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
     JFrame containerFrame = new JFrame();
     containerFrame.setTitle("Operator Assignment");
     containerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     containerFrame.setSize(500, 400); 
     containerFrame.getContentPane().setLayout(new java.awt.BorderLayout());
                    
                    
     OpertorAssignmentGUI_2511531006 internalFrame = new OpertorAssignmentGUI_2511531006();
                    
                   
     containerFrame.getContentPane().add(internalFrame, java.awt.BorderLayout.CENTER);
                    
     internalFrame.setVisible(true); 
     containerFrame.setVisible(true); 
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public OpertorAssignmentGUI_2511531006() {
        
      
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);
        
    
        JLabel lblNewLabel_1 = new JLabel("OPERATOR ASSIGNMENT");
        lblNewLabel_1.setBounds(100, 10, 250, 20); 
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER); 
        getContentPane().add(lblNewLabel_1);
        jTextField1.setText("10");
        
      
        jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField1.setEditable(false);
        jTextField1.setBounds(140, 59, 100, 33); 
        getContentPane().add(jTextField1);
        jTextField1.setColumns(10);
        

        JLabel lblNewLabel_2 = new JLabel("Nilai saat ini");
        lblNewLabel_2.setBounds(50, 68, 80, 14);
        getContentPane().add(lblNewLabel_2);
        
      
        JButton btnTambah = new JButton("+= 5");
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni += 5; 
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnTambah.setBounds(36, 124, 88, 22);
        getContentPane().add(btnTambah);
        
       
        JButton btnKurang = new JButton("-=3");
        btnKurang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni -= 3;
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnKurang.setBounds(36, 157, 88, 22);
        getContentPane().add(btnKurang);
        
       
        JButton btnKali = new JButton("*=2");
        btnKali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni *= 2;
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnKali.setBounds(134, 124, 88, 22);
        getContentPane().add(btnKali);
        

        JButton btnBagi = new JButton("/=4");
        btnBagi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni /= 4; 
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnBagi.setBounds(144, 157, 88, 22);
        getContentPane().add(btnBagi);
        

        JButton btnModulo = new JButton("%=10");
        btnModulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni %= 10;
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnModulo.setBounds(232, 124, 88, 22);
        getContentPane().add(btnModulo);
        

        JButton btnReset = new JButton("reset=10");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nilaiSaatIni = 10; 
                jTextField1.setText(String.valueOf(nilaiSaatIni));
            }
        });
        btnReset.setBounds(242, 157, 88, 22);
        getContentPane().add(btnReset);
        
   
        JButton btnproses = new JButton("PROSES");
        btnproses.setBounds(134, 190, 88, 22);
        getContentPane().add(btnproses);
   }
}
