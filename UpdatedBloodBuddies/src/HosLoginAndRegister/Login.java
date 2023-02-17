package HosLoginAndRegister;

import ALLMAINFILES.HosNavBar;
import ALLMAINFILES.HospitalLogin;
import ALLMAINFILES.NAVBar;
import Hospital.hos_feed;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import swing.EventLogin;
import java.sql.*;

public class Login extends PanelCustom {

    private EventLogin event;

    public Login() {
        initComponents();
        Socket sock = new Socket();
        InetSocketAddress addr = new InetSocketAddress("www.google.com", 80);
        try {
            sock.connect(addr, 3000);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Please connect to Internet,Otherwise data won't get updated on any page!");
        } finally {
            try {
                sock.close();
            } catch (IOException e) {
            }
        }
        setAlpha(1);
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sign_in_user_name = new swing.TextField();
        sign_in_password = new swing.Password();
        button1 = new swing.Button();
        button2 = new swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN IN");

        sign_in_user_name.setForeground(new java.awt.Color(76, 76, 76));
        sign_in_user_name.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        sign_in_user_name.setHint("USER NAME");

        sign_in_password.setForeground(new java.awt.Color(76, 76, 76));
        sign_in_password.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        sign_in_password.setHint("PASSWORD");

        button1.setBackground(new java.awt.Color(86, 142, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Sign In");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(86, 142, 255));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Forgot Password?");
        button2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sign_in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sign_in_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(sign_in_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(sign_in_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        if (sign_in_user_name.getText().isEmpty() || sign_in_user_name.getText().equals("USER NAME")) {
            JOptionPane.showMessageDialog(this, "Please enter username!", "Username", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (sign_in_password.getText().isEmpty() || sign_in_password.getText().equals("PASSWORD")) {
            JOptionPane.showMessageDialog(this, "Please enter password!", "Password", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String hos_user_name = sign_in_user_name.getText();
        String hos_password = sign_in_password.getText();
        try {
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                String sql = "SELECT hospital_id from hospital_table where hos_username='" + hos_user_name + "' and password='" + hos_password + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                Boolean found = false;
                int id = 0;
                while (rs.next()) {
                    id = rs.getInt(1);
                    found = true;
                }
                if (!found) {
                    JOptionPane.showMessageDialog(this, "Password or username is wrong!", "Sign In", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Signed in!", "Sign In", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    HosNavBar h = new HosNavBar();
                    h.l1.setText(String.valueOf(id));
                    h.l1.setVisible(false);
                    h.setVisible(true);
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e, "Sign In", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        String toEmail = JOptionPane.showInputDialog(this, "Enter your email:", "Verification", JOptionPane.INFORMATION_MESSAGE);
        Random rand = new Random();
        int upperbound = 10000;
        int int_random = rand.nextInt(upperbound);
        String otp = Integer.toString(int_random - 1);
        try {

            final String fromEmail = "bloodbankjavaproject12@gmail.com";
            final String passwordmail = "rfgkzzytogpxfmar";

            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            //properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, passwordmail);
                }
            });
            MimeMessage msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(fromEmail));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                msg.setSubject("OTP verification");
                msg.setSentDate(new Date());

                Multipart emailContent = new MimeMultipart();
                MimeBodyPart textBodyPart = new MimeBodyPart();
                textBodyPart.setText("Your OTP is:" + otp);
                emailContent.addBodyPart(textBodyPart);
                msg.setContent(emailContent);
                Transport.send(msg);
            } catch (MessagingException e) {
                MessagingException er = e;
                JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HeadlessException e) {
            Exception er = e;
            JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
        }
        String res = JOptionPane.showInputDialog(this, "Enter OTP sent on your email:", "Verification", JOptionPane.INFORMATION_MESSAGE);
        int rep = 1;
        int reppd = 1;
        String pd = null;
        String cf_pd;
        for (int j = 0; j < rep; j++) {
            if (res.equals(otp)) {
                for (int k = 0; k < reppd; k++) {
                    JTextField pwd = new JTextField(15);
                    JTextField cf_pwd = new JTextField(15);
                    JPanel myPanel = new JPanel();
                    myPanel.setLayout(new GridLayout(4, 2));
                    myPanel.add(new JLabel("New Password:"));
                    myPanel.add(pwd);
                    myPanel.add(new JLabel("Change Password:"));
                    myPanel.add(cf_pwd);
                    int result = JOptionPane.showConfirmDialog(null, myPanel,
                            "Change Password", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        pd = pwd.getText();
                        cf_pd = cf_pwd.getText();
                        System.out.println(pd);
                        System.out.println(cf_pd);
                        if (pd.equals(cf_pd)) {
                            Pattern p1 = Pattern.compile("\\b(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!#%*?&]{8,18}\\b");
                            Matcher pwd1 = p1.matcher(pd);
                            if (((!pwd1.find()) && pd.length() <= 8)) {
                                JOptionPane.showMessageDialog(this, "Password should be: \n1) One Capital Letter\n2) Special Character\n3) One Number \n4) Length Should be 8-18.", "Password", JOptionPane.WARNING_MESSAGE);
                                reppd = reppd + 1;
                            } else {
                                try {
                                    String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    try (Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                                        String sqlUpdate = "UPDATE hospital_table "
                                                + "SET password = ? "
                                                + "WHERE email = ?";
                                        PreparedStatement pstmt = conn.prepareStatement(sqlUpdate);
                                        pstmt.setString(1, pd);
                                        pstmt.setString(2, toEmail);
                                        pstmt.executeUpdate();
                                    }
                                    JOptionPane.showMessageDialog(this, "Passsword successfully updated!", "Password", JOptionPane.INFORMATION_MESSAGE);

                                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                                    JOptionPane.showMessageDialog(this, e, "Forgot password", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Passsword must be same!", "Password", JOptionPane.WARNING_MESSAGE);
                            reppd = reppd + 1;
                        }
                    }
                }
                try {
                    final String fromEmail = "bloodbankjavaproject12@gmail.com";
                    final String passwordmail = "rfgkzzytogpxfmar";

                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    //properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");

                    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(fromEmail, passwordmail);
                        }
                    });
                    MimeMessage msg = new MimeMessage(session);
                    try {
                        msg.setFrom(new InternetAddress(fromEmail));
                        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                        msg.setSubject("Password changed!");
                        msg.setSentDate(new Date());
                        Multipart emailContent = new MimeMultipart();
                        MimeBodyPart textBodyPart = new MimeBodyPart();
                        textBodyPart.setText("Your password has been changed as : " + pd + "\nDon't share it with anyone!");
                        emailContent.addBodyPart(textBodyPart);
                        msg.setContent(emailContent);
                        Transport.send(msg);
                        JOptionPane.showMessageDialog(this, "Your password has been changed!", "Password", JOptionPane.INFORMATION_MESSAGE);
                    } catch (MessagingException e) {
                        MessagingException er = e;
                        JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (HeadlessException e) {
                    Exception er = e;
                    JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Wrong OTP!", "OTP", JOptionPane.WARNING_MESSAGE);
                String res1 = JOptionPane.showInputDialog(this, "Enter OTP sent on your email:", "Verification", JOptionPane.INFORMATION_MESSAGE);
                rep = rep + 1;
                res = res1;
            }
        }
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button2;
    private javax.swing.JLabel jLabel1;
    private swing.Password sign_in_password;
    private swing.TextField sign_in_user_name;
    // End of variables declaration//GEN-END:variables

}
