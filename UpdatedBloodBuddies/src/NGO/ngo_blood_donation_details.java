package NGO;

import Hospital.*;
import ALLMAINFILES.HosNavBar;
import ALLMAINFILES.NAVBar;
import NGO.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ngo_blood_donation_details extends javax.swing.JFrame {

    String f_id = null;

    public ngo_blood_donation_details(String g_id) {
        initComponents();
        f_id = g_id;
        System.out.println(f_id);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        this.setIconImage(icon);

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(255, 204, 204));
            }
        });

        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5.setBackground(new Color(255, 204, 204));
            }
        });

        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6.setBackground(new Color(255, 204, 204));
            }
        });

        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7.setBackground(new Color(255, 204, 204));
            }
        });

        setBounds(-6, -6, 1600, 900);
        search.setForeground(Color.GRAY);
        search.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (search.getText().equals("Search")) {
                    search.setText("");
                    search.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (search.getText().isEmpty()) {
                    search.setForeground(Color.GRAY);
                    search.setText("Search");
                }
            }
        });
        try {
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select user_info_table.first_name,user_info_table.last_name,user_info_table.aadhaar_no,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_info_table.room_no,user_info_table.street,user_info_table.city,user_info_table.pincode,user_info_table.state,user_info_table.last_donated_date from user_info_table inner join blood_donation on user_info_table.aadhaar_no=blood_donation.aadhaar_no where blood_donation.camp_id=(select camp_id from ngo_table where ngo_id='" + f_id + "') group by blood_donation.aadhaar_no");
                Object columnHeaders[] = {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Room No", "Street", "City", "Pincode", "State", "Last donated date"};
                com.mysql.cj.jdbc.result.ResultSetMetaData rsmd;
                DefaultTableModel dtm = new DefaultTableModel();
                rsmd = (com.mysql.cj.jdbc.result.ResultSetMetaData) rs.getMetaData();
                int count = rsmd.getColumnCount();
                dtm.setColumnIdentifiers(columnHeaders);
                int rowcount = 0;
                while (rs.next()) {
                    Vector row = new Vector();
                    for (int i = 1; i <= count; i++) {
                        row.addElement(rs.getString(i));
                    }
                    dtm.addRow(row);
                    rowcount = rs.getRow();
                }
                if (rowcount < 1) {
                    JOptionPane.showMessageDialog(this, "No records found!", "Data", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                jTable1.setModel(dtm);
            }
        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(this, e);
            System.out.println("NGO Blood Donation Details");
        }
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

        jLabel1 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new swing.Button();
        search = new javax.swing.JTextField();
        button4 = new swing.Button();
        button5 = new swing.Button();
        button6 = new swing.Button();
        button7 = new swing.Button();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Donation Details");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NGO/NormalSearch.png"))); // NOI18N

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Room No", "Street", "City", "Pincode", "State", "Last donated date"}));
        combo.setPreferredSize(new java.awt.Dimension(30, 30));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setMaximumSize(new java.awt.Dimension(1500, 900));
        jTable1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jTable1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jScrollPane1.setViewportView(jTable1);

        button1.setBackground(new java.awt.Color(255, 204, 204));
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Find");
        button1.setFocusable(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.setToolTipText("Search");
        search.setPreferredSize(new java.awt.Dimension(32, 32));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 204, 204));
        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setText("Back");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(255, 204, 204));
        button5.setForeground(new java.awt.Color(0, 0, 0));
        button5.setText("Total Collection");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(255, 204, 204));
        button6.setForeground(new java.awt.Color(0, 0, 0));
        button6.setText("Blood Requested Response");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(255, 204, 204));
        button7.setForeground(new java.awt.Color(0, 0, 0));
        button7.setText("Blood Transferred");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(800, 800, 800)
                    .addComponent(l1)
                    .addContainerGap(800, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(385, 385, 385)
                    .addComponent(l1)
                    .addContainerGap(385, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void filter(String fill, String text) {
        try {
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select user_info_table.first_name,user_info_table.last_name,user_info_table.aadhaar_no,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_info_table.room_no,user_info_table.street,user_info_table.city,user_info_table.pincode,user_info_table.state,user_info_table.last_donated_date from user_info_table inner join blood_donation on user_info_table.aadhaar_no=blood_donation.aadhaar_no where blood_donation.camp_id=(select camp_id from ngo_table where ngo_id='" + f_id + "') and " + fill + " like '" + text + "%' group by blood_donation.aadhaar_no");
                Object columnHeaders[] = {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Room No", "Street", "City", "Pincode", "State", "Last donated date"};
                com.mysql.cj.jdbc.result.ResultSetMetaData rsmd;
                DefaultTableModel dtm = new DefaultTableModel();
                rsmd = (com.mysql.cj.jdbc.result.ResultSetMetaData) rs.getMetaData();
                int count = rsmd.getColumnCount();
                dtm.setColumnIdentifiers(columnHeaders);
                int rowcount = 0;
                while (rs.next()) {
                    Vector row = new Vector();
                    for (int i = 1; i <= count; i++) {
                        row.addElement(rs.getString(i));
                    }
                    dtm.addRow(row);
                    rowcount = rs.getRow();
                }
                if (rowcount < 1) {
                    JOptionPane.showMessageDialog(this, "No records found!", "Data", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                jTable1.setModel(dtm);
            }
        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(this, e);
            System.out.println("NGO Blood Donation Details");
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (search.getText().isEmpty() || search.getText().equals("Search")) {
                JOptionPane.showMessageDialog(this, "What do you want to search?", "Search", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (combo.getSelectedItem() == "First name") {
                filter("user_info_table.first_name", search.getText());
            }
            if (combo.getSelectedItem() == "Last name") {
                filter("user_info_table.last_name", search.getText());
            }
            if (combo.getSelectedItem() == "Aadhaar Number") {
                filter("user_info_table.aadhaar_no", search.getText());
            }
            if (combo.getSelectedItem() == "Date of Birth") {
                filter("user_info_table.date_of_birth", search.getText());
            }
            if (combo.getSelectedItem() == "Gender") {
                filter("user_info_table.gender", search.getText());
            }
            if (combo.getSelectedItem() == "Phone") {
                filter("user_info_table.phone", search.getText());
            }
            if (combo.getSelectedItem() == "E-Mail") {
                filter("user_info_table.email", search.getText());
            }
            if (combo.getSelectedItem() == "Blood Group") {
                filter("user_info_table.blood_group", search.getText());
            }
            if (combo.getSelectedItem() == "Room No") {
                filter("user_info_table.room_no", search.getText());
            }
            if (combo.getSelectedItem() == "Street") {
                filter("user_info_table.street", search.getText());
            }
            if (combo.getSelectedItem() == "City") {
                filter("user_info_table.city", search.getText());
            }
            if (combo.getSelectedItem() == "Pincode") {
                filter("user_info_table.pincode", search.getText());
            }
            if (combo.getSelectedItem() == "State") {
                filter("user_info_table.state", search.getText());
            }
            if (combo.getSelectedItem() == "Last donated date") {
                filter("user_info_table.last_donated_date", search.getText());
            }
        } catch (Exception e) {
            System.out.println("NGO Blood Donation Details");
        }

    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

        NAVBar s = new NAVBar();
        s.l1.setText(f_id);
        s.l1.setVisible(false);
        this.dispose();
        s.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        button5.setBackground(new Color(83, 173, 202));
        // TODO add your handling code here:
        new ngo_blood_collection(f_id).setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        button6.setBackground(new Color(83, 173, 202));
        // TODO add your handling code here:
        new ngo_blood_request_response(f_id).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        button7.setBackground(new Color(83, 173, 202));
        new ngo_blood_transfered_details(f_id).setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_button7ActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemStateChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ngo_blood_donation_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_blood_donation_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_blood_donation_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_blood_donation_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String str = null;
                new ngo_blood_donation_details(str).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button4;
    private swing.Button button5;
    private swing.Button button6;
    private swing.Button button7;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel l1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
