package Hospital;

import ALLMAINFILES.HosNavBar;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hos_bloodrequest extends javax.swing.JFrame {

    String f_id = null;

    public hos_bloodrequest(String g_id) {
        initComponents();
        f_id = g_id;
        System.out.println(f_id);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        setIconImage(icon);
        setBounds(-6, -6, 1600, 900);
        getContentPane().setBackground(new Color(245, 245, 245));
        a_p.setForeground(Color.GRAY);

        done_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                done_button.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                done_button.setBackground(new Color(255, 204, 204));
            }
        });
        a_p.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (a_p.getText().equals("0")) {
                    a_p.setText("");
                    a_p.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (a_p.getText().isEmpty()) {
                    a_p.setForeground(Color.GRAY);
                    a_p.setText("0");
                }
            }
        });
        b_p.setForeground(Color.GRAY);
        b_p.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (b_p.getText().equals("0")) {
                    b_p.setText("");
                    b_p.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (b_p.getText().isEmpty()) {
                    b_p.setForeground(Color.GRAY);
                    b_p.setText("0");
                }
            }
        });
        ab_p.setForeground(Color.GRAY);
        ab_p.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ab_p.getText().equals("0")) {
                    ab_p.setText("");
                    ab_p.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ab_p.getText().isEmpty()) {
                    ab_p.setForeground(Color.GRAY);
                    ab_p.setText("0");
                }
            }
        });
        o_p.setForeground(Color.GRAY);
        o_p.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (o_p.getText().equals("0")) {
                    o_p.setText("");
                    o_p.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (o_p.getText().isEmpty()) {
                    o_p.setForeground(Color.GRAY);
                    o_p.setText("0");
                }
            }
        });
        a_n.setForeground(Color.GRAY);
        a_n.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (a_n.getText().equals("0")) {
                    a_n.setText("");
                    a_n.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (a_n.getText().isEmpty()) {
                    a_n.setForeground(Color.GRAY);
                    a_n.setText("0");
                }
            }
        });
        b_n.setForeground(Color.GRAY);
        b_n.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (b_n.getText().equals("0")) {
                    b_n.setText("");
                    b_n.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (b_n.getText().isEmpty()) {
                    b_n.setForeground(Color.GRAY);
                    b_n.setText("0");
                }
            }
        });
        ab_n.setForeground(Color.GRAY);
        ab_n.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (ab_n.getText().equals("0")) {
                    ab_n.setText("");
                    ab_n.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (ab_n.getText().isEmpty()) {
                    ab_n.setForeground(Color.GRAY);
                    ab_n.setText("0");
                }
            }
        });
        o_n.setForeground(Color.GRAY);
        o_n.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (o_n.getText().equals("0")) {
                    o_n.setText("");
                    o_n.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (o_n.getText().isEmpty()) {
                    o_n.setForeground(Color.GRAY);
                    o_n.setText("0");
                }
            }
        });
        blood_msg.setForeground(Color.GRAY);
        blood_msg.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (blood_msg.getText().equals("Type Here")) {
                    blood_msg.setText("");
                    blood_msg.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (blood_msg.getText().isEmpty()) {
                    blood_msg.setForeground(Color.GRAY);
                    blood_msg.setText("Type Here");
                }
            }
        });
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress("www.google.com", 80);
        try {
            sock.connect(addr, 3000);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Please connect to Internet,Otherwise data won't get updated on any page!");
        } finally {
            try {
                sock.close();
            } catch (IOException e) {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a_p = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_p = new swing.TextField();
        jLabel11 = new javax.swing.JLabel();
        ab_p = new swing.TextField();
        jLabel12 = new javax.swing.JLabel();
        o_p = new swing.TextField();
        jLabel13 = new javax.swing.JLabel();
        a_n = new swing.TextField();
        jLabel14 = new javax.swing.JLabel();
        b_n = new swing.TextField();
        jLabel15 = new javax.swing.JLabel();
        ab_n = new swing.TextField();
        jLabel16 = new javax.swing.JLabel();
        o_n = new swing.TextField();
        jLabel17 = new javax.swing.JLabel();
        back_button = new swing.Button();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        blood_msg = new javax.swing.JTextArea();
        done_button = new swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOOD REQUEST");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        a_p.setText("0");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("      Blood Request");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("A+ :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("B+ :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("AB+ :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("O+ :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("A- :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("O- :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("AB- :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("B- :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("in unit");

        b_p.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("in unit");

        ab_p.setText("0");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("in unit");

        o_p.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("in unit");

        a_n.setText("0");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("in unit");

        b_n.setText("0");
        b_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_nActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("in unit");

        ab_n.setText("0");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("in unit");

        o_n.setText("0");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("in unit");

        back_button.setBackground(new java.awt.Color(255, 204, 204));
        back_button.setForeground(new java.awt.Color(0, 0, 0));
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Message :");

        blood_msg.setColumns(20);
        blood_msg.setRows(5);
        blood_msg.setText("Type Here");
        jScrollPane1.setViewportView(blood_msg);

        done_button.setBackground(new java.awt.Color(255, 204, 204));
        done_button.setForeground(new java.awt.Color(0, 0, 0));
        done_button.setText("Done");
        done_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(1538, Short.MAX_VALUE)
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(455, 455, 455)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(done_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addGap(47, 47, 47)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(b_p, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                .addComponent(a_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addComponent(jLabel10))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addGap(13, 13, 13)
                                                                    .addComponent(jLabel11))))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(ab_p, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel12))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(o_p, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jLabel13)))
                                                    .addGap(129, 129, 129)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel6))
                                                    .addGap(47, 47, 47)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(o_n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel17)
                                                                .addGap(10, 10, 10))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(a_n, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel14)))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(ab_n, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(b_n, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel15)
                                                                .addComponent(jLabel16))
                                                            .addGap(10, 10, 10))))
                                                .addComponent(jScrollPane1))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(634, 634, 634)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 421, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(a_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(a_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(b_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(b_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(ab_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(ab_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(o_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(o_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(done_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void done_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done_buttonActionPerformed
        // TODO add your handling code here:
        if (a_p.getText().isEmpty() || a_p.getText().equals("A+")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "A+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(a_p.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "A+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (b_p.getText().isEmpty() || b_p.getText().equals("B+")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "B+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(b_p.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "B+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (ab_p.getText().isEmpty() || ab_p.getText().equals("AB+")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "AB+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(ab_p.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "AB+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (o_p.getText().isEmpty() || o_p.getText().equals("O+")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "O+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(o_p.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "O+", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (a_n.getText().isEmpty() || a_n.getText().equals("A-")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "A-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(a_n.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "A-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (b_n.getText().isEmpty() || b_n.getText().equals("B-")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "B-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(b_n.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "B-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (ab_n.getText().isEmpty() || ab_n.getText().equals("AB-")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "AB-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(ab_n.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "AB-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (o_n.getText().isEmpty() || o_n.getText().equals("O-")) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want!", "O-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int s = Integer.parseInt(o_n.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter how much blood you want in numbers!", "O-", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (blood_msg.getText().isEmpty() || blood_msg.getText().equals("Message")) {
            JOptionPane.showMessageDialog(this, "Please enter message!", "Message", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int b_ap = Integer.parseInt(a_p.getText());
        int b_bp = Integer.parseInt(b_p.getText());
        int b_abp = Integer.parseInt(ab_p.getText());
        int b_op = Integer.parseInt(o_p.getText());
        int b_an = Integer.parseInt(a_n.getText());
        int b_bn = Integer.parseInt(b_n.getText());
        int b_abn = Integer.parseInt(ab_n.getText());
        int b_on = Integer.parseInt(o_n.getText());
        String b_msg = blood_msg.getText();
        int hh_id = 0;
        if ((((b_ap > 0) || (b_bp > 0)) || ((b_abp > 0) || (b_op > 0))) || (((b_an > 0) || (b_bn > 0)) || ((b_abn > 0) || (b_on > 0)))) {
        } else {
            JOptionPane.showMessageDialog(this, "Please enter correct blood amount!", "Blood amount", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String hh_name = null;
        String hh_phone = null;
        String hh_email = null;
        String hh_street = null;
        String hh_city = null;
        int hh_pincode = 0;
        String hh_state = null;
        try {
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                String sql = "SELECT hospital_id,hos_name,phone,email,street,city,pincode,state from hospital_table where hospital_id='" + f_id + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    hh_id = rs.getInt(1);
                    hh_name = rs.getString(2);
                    hh_phone = rs.getString(3);
                    hh_email = rs.getString(4);
                    hh_street = rs.getString(5);
                    hh_city = rs.getString(6);
                    hh_pincode = rs.getInt(7);
                    hh_state = rs.getString(8);
                }
                try {
                    try {
                        String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        try (Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                            String query = " insert into hospital_blood_requested(ngo_id,ngo_name,hospital_id,hos_name,phone,email,street,city,pincode,state,o_positive,o_negative,ab_positive,ab_negative,a_positive,a_negative,b_positive,b_negative,msg,status)"
                                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement preparedStmt = conn1.prepareStatement(query);
                            preparedStmt.setInt(1, 0);
                            preparedStmt.setString(2, null);
                            preparedStmt.setInt(3, hh_id);
                            preparedStmt.setString(4, hh_name);
                            preparedStmt.setString(5, hh_phone);
                            preparedStmt.setString(6, hh_email);
                            preparedStmt.setString(7, hh_street);
                            preparedStmt.setString(8, hh_city);
                            preparedStmt.setInt(9, hh_pincode);
                            preparedStmt.setString(10, hh_state);
                            preparedStmt.setInt(11, b_op);
                            preparedStmt.setInt(12, b_on);
                            preparedStmt.setInt(13, b_abp);
                            preparedStmt.setInt(14, b_abn);
                            preparedStmt.setInt(15, b_ap);
                            preparedStmt.setInt(16, b_an);
                            preparedStmt.setInt(17, b_bp);
                            preparedStmt.setInt(18, b_bn);
                            preparedStmt.setString(19, b_msg);
                            preparedStmt.setString(20, "Requested");
                            System.out.println(hh_id + hh_name + hh_phone + hh_email + hh_street + hh_city + hh_pincode + hh_state + b_op + b_on + b_abp + b_abn + b_ap + b_an + b_bp + b_bn);
                            preparedStmt.execute();
                            conn1.close();
                            JOptionPane.showMessageDialog(this, "Request is done!", "Request", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(this, e, "Register", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, e, "Request", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Sign In", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_done_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed

        // TODO add your handling code here:
        HosNavBar s = new HosNavBar();
        s.l1.setText(f_id);
        s.l1.setVisible(false);
        this.dispose();
        s.setVisible(true);

    }//GEN-LAST:event_back_buttonActionPerformed

    private void b_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_nActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hos_bloodrequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hos_bloodrequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hos_bloodrequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hos_bloodrequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            String str = null;
            new hos_bloodrequest(str).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField a_n;
    private swing.TextField a_p;
    private swing.TextField ab_n;
    private swing.TextField ab_p;
    private swing.TextField b_n;
    private swing.TextField b_p;
    private swing.Button back_button;
    private javax.swing.JTextArea blood_msg;
    private swing.Button done_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.TextField o_n;
    private swing.TextField o_p;
    // End of variables declaration//GEN-END:variables
}
