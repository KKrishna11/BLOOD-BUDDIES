package NGO;

import Hospital.*;
import ALLMAINFILES.HosNavBar;
import ALLMAINFILES.NAVBar;
import NGO.*;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
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
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class ngo_staff_details extends javax.swing.JFrame {

    String f_id = null;

    public ngo_staff_details(String g_id) {
        initComponents();
        f_id = g_id;
        System.out.println(f_id);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        this.setIconImage(icon);
        setBounds(-6, -6, 1600, 900);
        search.setForeground(Color.GRAY);

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(255, 204, 204));
            }
        });

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2.setBackground(new Color(255, 204, 204));
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
                ResultSet rs = stmt.executeQuery("select staff_id,first_name,last_name,aadhaar_no,gender,email,phone,designation,salary,room_no,street,city,pincode,state,joining_date,joining_time,status from staff_table where ngo_id='" + f_id + "'");
                Object columnHeaders[] = {"Staff ID", "First name", "Last name", "Aadhaar number", "Gender", "E-Mail", "Phone", "Designation", "salary", "Room No", "Street", "City", "Pincode", "State", "Joining Date", "Joining Time", "Status"};
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
            System.out.println("NGO Feedback");
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

        combo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        button1 = new swing.Button();
        search = new javax.swing.JTextField();
        button4 = new swing.Button();
        button5 = new swing.Button();
        l1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        button2 = new swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staffs Details");
        setBackground(new java.awt.Color(255, 255, 255));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Staff ID", "First name", "Last name", "Aadhaar number", "Gender", "E-Mail", "Phone", "Designation", "salary", "Room No", "Street", "City", "Pincode", "State", "Joining Date", "Joining Time", "Status"}));
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
                {1, "fddsf", "sf", "fgsd"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(1500, 900));
        jTable1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jTable1.setPreferredSize(new java.awt.Dimension(1500, 900));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        button5.setText("Add Staff");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NGO/NormalSearch.png"))); // NOI18N

        button2.setBackground(new java.awt.Color(255, 204, 204));
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Reload");
        button2.setFocusable(false);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1588, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l1)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
                ResultSet rs = stmt.executeQuery("select staff_id,first_name,last_name,aadhaar_no,gender,email,phone,designation,salary,room_no,street,city,pincode,state,joining_date,joining_time,status from staff_table where ngo_id='" + f_id + "' and " + fill + " like '" + text + "%'");
                Object columnHeaders[] = {"Staff ID", "First name", "Last name", "Aadhaar number", "Gender", "E-Mail", "Phone", "Designation", "salary", "Room No", "Street", "City", "Pincode", "State", "Joining Date", "Joining Time", "Status"};
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
            System.out.println("NGO Feedback");
        }
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (search.getText().isEmpty() || search.getText().equals("Search")) {
                JOptionPane.showMessageDialog(this, "What do you want to search?", "Search", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (combo.getSelectedItem() == "Staff ID") {
                filter("staff_id", search.getText());
            }
            if (combo.getSelectedItem() == "First name") {
                filter("first_name", search.getText());
            }
            if (combo.getSelectedItem() == "Last name") {
                filter("last_name", search.getText());
            }
            if (combo.getSelectedItem() == "Aadhaar number") {
                filter("aadhaar_no", search.getText());
            }
            if (combo.getSelectedItem() == "Gender") {
                filter("gender", search.getText());
            }
            if (combo.getSelectedItem() == "E-Mail") {
                filter("email", search.getText());
            }
            if (combo.getSelectedItem() == "Phone") {
                filter("phone", search.getText());
            }
            if (combo.getSelectedItem() == "Designation") {
                filter("designation", search.getText());
            }
            if (combo.getSelectedItem() == "salary") {
                filter("salary", search.getText());
            }
            if (combo.getSelectedItem() == "Room No") {
                filter("room_no", search.getText());
            }
            if (combo.getSelectedItem() == "Street") {
                filter("street", search.getText());
            }
            if (combo.getSelectedItem() == "City") {
                filter("city", search.getText());
            }
            if (combo.getSelectedItem() == "Pincode") {
                filter("pincode", search.getText());
            }
            if (combo.getSelectedItem() == "State") {
                filter("state", search.getText());
            }
            if (combo.getSelectedItem() == "Joining Date") {
                filter("joining_date", search.getText());
            }
            if (combo.getSelectedItem() == "Joining Time") {
                filter("joining_time", search.getText());
            }
            if (combo.getSelectedItem() == "Status") {
                filter("status", search.getText());
            }
        } catch (HeadlessException e) {
            System.out.println("NGO Feedback");
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            String buttons[] = {"Fire", "Close"};
            jTable1.setRowSelectionAllowed(true);
            DefaultTableModel table_data_fetch = (DefaultTableModel) jTable1.getModel();
            int selectedRowIndex = jTable1.getSelectedRow();
            String staff_id = table_data_fetch.getValueAt(selectedRowIndex, 0).toString();
            String first_name = table_data_fetch.getValueAt(selectedRowIndex, 1).toString();
            String last_name = table_data_fetch.getValueAt(selectedRowIndex, 2).toString();
            int n = JOptionPane.showOptionDialog(
                    this,
                    "Staff ID:  " + staff_id + "\n" + "First Name:  " + first_name + "\n" + "Last Name" + last_name,
                    "Details",
                    JOptionPane.OK_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    buttons,
                    0);
            if (n == 0) {
                try {
                    String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    try (Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                        String sqlUpdate = "update staff_table "
                                + "set status='Removed' "
                                + "WHERE staff_id = ? and status='Added'";
                        PreparedStatement pstmt = conn1.prepareStatement(sqlUpdate);
                        pstmt.setString(1, staff_id);
                        int count = pstmt.executeUpdate();
                        if (count > 0) {
                            JOptionPane.showMessageDialog(this, "Staff Removed!", "Staff", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Looks like you have already fired the employee!", "Staff", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(this, "Looks like you have already fired the employee!", "Staff", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (HeadlessException e1) {
//            JOptionPane.showMessageDialog(this, e1, "Data", JOptionPane.WARNING_MESSAGE);
            System.out.println("NGO Feedback");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboItemStateChanged

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed

        // TODO add your handling code here:
        new ngo_addstaff(f_id).setVisible(true);
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_button5ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new ngo_staff_details(f_id).setVisible(true);


    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(ngo_staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_staff_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ngo_staff_details(str).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button4;
    private swing.Button button5;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel l1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
