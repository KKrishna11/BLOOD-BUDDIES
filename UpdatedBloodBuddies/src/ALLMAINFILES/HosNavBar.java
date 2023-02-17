package ALLMAINFILES;

import ChatBot.ChatBot;
import Hospital.hos_blood_received_details;
import Hospital.hos_blood_requested_details;
//import Hospital.hos_campsituation_details;
import Hospital.hos_bloodrequest;
import Hospital.hos_feed;
//import Hospital.hos_user_details;
//import Hospital.hos_registered_user_details_fill;
import SwingNAV.EventNavigationBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class HosNavBar extends javax.swing.JFrame {

    public HosNavBar() {

        initComponents();
          Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");

        this.setIconImage(icon);
        setBounds(-8, -8, 1600, 890);

        getContentPane().setBackground(new Color(250, 250, 250));
        
                UIManager.put("ToolTip.background",Color.white);
        UIManager.put("ToolTip.foreground",Color.black);
        UIManager.put("ToolTip.font",new Font("Century Gothic",Font.PLAIN,14));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("HosStaffDetails.png")));  
        navigationBar1.addItem(new ImageIcon(getClass().getResource("blood-request.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("blood-recieved.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("feed.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("chatbot.png")));
        navigationBar1.addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {

//                if (index == 0) {
////                    jLabel2.setToolTipText("Blood Request");
//
//                }
//                if (index == 1) {
////                    jLabel4.setToolTipText("Blood Table");
//                }
//                if (index == 2) {
////                    jLabel5.setToolTipText("Blood Recieved");
//                }
//                if (index == 3) {
////                    jLabel6.setToolTipText("Feedback");
//
//                }
//                if (index == 4) {
//
////                    jLabel3.setToolTipText("ChatBot");
//
//                }

            }

            @Override
            public void afterSelected(int index) {
                switch (index) {
                    case 0: {
                        new hos_bloodrequest(l1.getText()).setVisible(true);
                        dispose(); //Destroy the JFrame object
                        break;
                    }
                    case 1: {
                        new hos_blood_requested_details(l1.getText()).setVisible(true);
                        dispose(); //Destroy the JFrame object
                        break;
                    }
                    case 2: {
                        new hos_blood_received_details(l1.getText()).setVisible(true);
                        dispose(); //Destroy the JFrame object
                        break;
                    }
                    case 3:
                        new hos_feed(l1.getText()).setVisible(true);
                        dispose(); //Destroy the JFrame object
                        break;
                    case 4:
                        ChatBot obj = new ChatBot();
                        obj.setVisible(rootPaneCheckingEnabled);
                        obj.setDefaultCloseOperation(1);
                        break;
                    default:
                        break;
                }

            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        navigationBar1 = new SwingNAV.NavigationBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 1, 1600, 800));
        setMinimumSize(new java.awt.Dimension(1600, 900));

        navigationBar1.setBackground(new java.awt.Color(245, 245, 250));
        navigationBar1.setForeground(new java.awt.Color(83, 173, 202));

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1594, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NGO/hospital.jpg"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Feedback");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("FeedBack");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Received");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ChatBot");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Requested Details");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Request Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navigationBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel12)
                .addGap(146, 146, 146)
                .addComponent(jLabel11)
                .addGap(165, 165, 165)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(190, 190, 190)
                .addComponent(jLabel10)
                .addGap(182, 182, 182))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(90, 90, 90))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(l1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HosNavBar().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel l1;
    private SwingNAV.NavigationBar navigationBar1;
    // End of variables declaration//GEN-END:variables
}
