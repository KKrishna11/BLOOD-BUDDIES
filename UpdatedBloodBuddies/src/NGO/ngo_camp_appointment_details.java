package NGO;

import ALLMAINFILES.NAVBar;
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

public class ngo_camp_appointment_details extends javax.swing.JFrame {

    String f_id = null;
    String res = null;

    public ngo_camp_appointment_details(String g_id) {
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        this.setIconImage(icon);
        setBounds(-7, -7, 1600, 890);
        initComponents();
        f_id = g_id;
        System.out.println(f_id);
        search.setForeground(Color.GRAY);

        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3.setBackground(new Color(255, 204, 204));
            }
        });

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(255, 204, 204));
            }
        });

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
        int rep = 1;
        if (res == null) {
            for (int j = 0; j < rep; j++) {
                res = JOptionPane.showInputDialog(this, "Enter Camp ID:", "Appointment Details", JOptionPane.INFORMATION_MESSAGE);
                if (res.equals(String.valueOf(JOptionPane.CANCEL_OPTION))) {
                    new ngo_camp_appointment_details(f_id).setVisible(true);
                    setVisible(false);
                    dispose();
                }
                if (res != null && res.length() > 0) {
                    try {
                        String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        try ( Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery("select user_info_table.first_name,user_info_table.last_name,user_info_table.aadhaar_no,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_app.app_status from user_info_table inner join user_app on user_app.aadhaar_no=user_info_table.aadhaar_no where user_app.camp_id=(select camp_id from ngo_table where ngo_id='" + f_id + "' and camp_id='" + res + "')");
                            Object columnHeaders[] = {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Status"};
                            ResultSetMetaData rsmd;
                            DefaultTableModel dtm = new DefaultTableModel();
                            rsmd = (ResultSetMetaData) rs.getMetaData();
                            int count = rsmd.getColumnCount();
                            dtm.setColumnIdentifiers(columnHeaders);
                            while (rs.next()) {
                                Vector row = new Vector();
                                for (int i = 1; i <= count; i++) {
                                    row.addElement(rs.getString(i));
                                }
                                dtm.addRow(row);
                            }
                            jTable1.setModel(dtm);
                        }
                    } catch (ClassNotFoundException | SQLException e) {
//                        JOptionPane.showMessageDialog(this, e);
                        System.out.println("NGO Camp Appointment Details");
                        JOptionPane.showMessageDialog(rootPane, "Can't find camp!", "Camp ID", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    rep = rep + 1;
                }
            }
        } else {
            try {
                String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("select user_info_table.first_name,user_info_table.last_name,user_info_table.aadhaar_no,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_app.app_status from user_info_table inner join user_app on user_app.aadhaar_no=user_info_table.aadhaar_no where user_app.camp_id=(select camp_id from ngo_table where ngo_id='" + f_id + "' and camp_id='" + res + "')");
                    Object columnHeaders[] = {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Status"};
                    ResultSetMetaData rsmd;
                    DefaultTableModel dtm = new DefaultTableModel();
                    rsmd = (ResultSetMetaData) rs.getMetaData();
                    int count = rsmd.getColumnCount();
                    dtm.setColumnIdentifiers(columnHeaders);
                    while (rs.next()) {
                        Vector row = new Vector();
                        for (int i = 1; i <= count; i++) {
                            row.addElement(rs.getString(i));
                        }
                        dtm.addRow(row);
                    }
                    jTable1.setModel(dtm);
                }
            } catch (ClassNotFoundException | SQLException e) {
//                JOptionPane.showMessageDialog(this, e);
                System.out.println("NGO Camp Appointment Details");
                JOptionPane.showMessageDialog(rootPane, "Can't find camp!", "Camp ID", JOptionPane.INFORMATION_MESSAGE);
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

        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new swing.Button();
        search = new javax.swing.JTextField();
        button2 = new swing.Button();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button3 = new swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Camp Appointment");
        setBackground(new java.awt.Color(255, 255, 255));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"First name","Last name","Aadhaar Number","Date of Birth","Gender","Phone","E-Mail","Blood Group","Status"}));
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

        button2.setBackground(new java.awt.Color(255, 204, 204));
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Back");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NGO/NormalSearch.png"))); // NOI18N

        button3.setBackground(new java.awt.Color(255, 204, 204));
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setText("Reload");
        button3.setFocusable(false);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(806, 806, 806)
                    .addComponent(l1)
                    .addContainerGap(794, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(445, 445, 445)
                    .addComponent(l1)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void filter(String fill, String text) {
        try {
            System.out.println(fill + text);
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try ( Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select user_info_table.first_name,user_info_table.last_name,user_info_table.aadhaar_no,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_app.app_status from user_info_table inner join user_app on user_app.aadhaar_no=user_info_table.aadhaar_no where user_app.camp_id=(select camp_id from ngo_table where ngo_id='" + f_id + "' and camp_id='" + res + "') and " + fill + " like '" + text + "%'");
                Object columnHeaders[] = {"First name", "Last name", "Aadhaar Number", "Date of Birth", "Gender", "Phone", "E-Mail", "Blood Group", "Status"};
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
            System.out.println("NGO Camp Appointment Details");
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
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
            if (combo.getSelectedItem() == "Status") {
                filter("user_info_table.app_status", search.getText());
            }
        } catch (Exception e) {
            System.out.println("NGO Camp Appointment Details");
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        new ngo_camp_details(f_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemStateChanged

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:

        new ngo_camp_appointment_details(f_id).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_button3ActionPerformed

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
            java.util.logging.Logger.getLogger(ngo_camp_appointment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_appointment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_appointment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_appointment_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                String str = null;
                new ngo_camp_appointment_details(str).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel l1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
