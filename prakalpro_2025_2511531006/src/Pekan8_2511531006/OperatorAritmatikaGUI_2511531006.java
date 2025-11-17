package Pekan8_2511531006;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class OperatorAritmatikaGUI_2511531006 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtBil1;
    private JTextField txtBil2;
    private JTextField txtHasil;


    private void pesanPeringatan(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
    }

   
    private void pesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * 
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OperatorAritmatikaGUI_2511531006 frame = new OperatorAritmatikaGUI_2511531006();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor GUI
     */
    public OperatorAritmatikaGUI_2511531006() {
        setResizable(false);
        setTitle("OPERATOR ARITMATIKA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 320);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblJudul = new JLabel("OPERATOR ARITMATIKA");
        lblJudul.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblJudul.setBounds(60, 10, 250, 30);
        contentPane.add(lblJudul);

        JLabel lblBil1 = new JLabel("Bilangan 1");
        lblBil1.setBounds(20, 60, 100, 14);
        contentPane.add(lblBil1);

        JLabel lblBil2 = new JLabel("Bilangan 2");
        lblBil2.setBounds(20, 95, 100, 14);
        contentPane.add(lblBil2);

        JLabel lblOp = new JLabel("Operator");
        lblOp.setBounds(20, 130, 100, 14);
        contentPane.add(lblOp);

        JLabel lblHasil = new JLabel("Hasil");
        lblHasil.setBounds(20, 190, 100, 14);
        contentPane.add(lblHasil);

        txtBil1 = new JTextField();
        txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil1.setBounds(120, 55, 80, 25);
        contentPane.add(txtBil1);

        txtBil2 = new JTextField();
        txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
        txtBil2.setBounds(120, 90, 80, 25);
        contentPane.add(txtBil2);

        JComboBox<String> cbOperator = new JComboBox<>();
        cbOperator.setModel(new DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", "%" }));
        cbOperator.setBounds(120, 125, 80, 25);
        contentPane.add(cbOperator);

        txtHasil = new JTextField();
        txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
        txtHasil.setEditable(false);
        txtHasil.setBounds(120, 185, 80, 25);
        contentPane.add(txtHasil);

        JButton btnProses = new JButton("Proses");
        btnProses.setBackground(new Color(255, 128, 64));
        btnProses.setBounds(220, 125, 90, 25);
        contentPane.add(btnProses);

       
        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (txtBil1.getText().trim().isEmpty()) {
                    pesanPeringatan("Silahkan input Bilangan 1");
                    return;
                }
                if (txtBil2.getText().trim().isEmpty()) {
                    pesanPeringatan("Silahkan input Bilangan 2");
                    return;
                }

                try {
                    int a = Integer.parseInt(txtBil1.getText());
                    int b = Integer.parseInt(txtBil2.getText());
                    int hasil = 0;
                    int op = cbOperator.getSelectedIndex();

                    switch (op) {
                        case 0: hasil = a + b; break;
                        case 1: hasil = a - b; break;
                        case 2: hasil = a * b; break;
                        case 3:
                            if (b == 0) {
                                pesanError("Pembagian dengan 0 tidak diperbolehkan");
                                return;
                            }
                            hasil = a / b;
                            break;
                        case 4:
                            if (b == 0) {
                                pesanError("Modulus dengan 0 tidak diperbolehkan");
                                return;
                            }
                            hasil = a % b;
                            break;
                    }

                    txtHasil.setText(String.valueOf(hasil));

                } catch (NumberFormatException ex) {
                    pesanError("Bilangan 1 dan Bilangan 2 harus berupa angka!");
                }
            }
        });
    }
}