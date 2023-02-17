package HosLoginAndRegister;

import Hospital.hos_feed;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
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
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Objects;

public class Register extends PanelCustom {

    public Register() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hos_name = new swing.TextField();
        jLabel1 = new javax.swing.JLabel();
        email = new swing.TextField();
        button1 = new swing.Button();
        password = new swing.Password();
        city = new swing.TextField();
        pin_code = new swing.TextField();
        street = new swing.TextField();
        user_name = new swing.TextField();
        phone = new swing.TextField();
        stt = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        hos_name.setHint("Hospital Name");
        hos_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hos_nameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        email.setHint("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 102, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Sign Up");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        password.setHint("Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        city.setHint("City");

        pin_code.setHint("Pincode");
        pin_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin_codeActionPerformed(evt);
            }
        });

        street.setHint("Street No");
        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        user_name.setHint("Username");
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });

        phone.setHint("Phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        stt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State",
            "Andhra Pradesh",
            "Arunachal Pradesh",
            "Assam",
            "Bihar",
            "Chhattisgarh",
            "Goa",
            "Gujarat",
            "Haryana",
            "Himachal Pradesh",
            "Jharkhand",
            "Karnataka",
            "Kerala",
            "Madhya Pradesh",
            "Maharashtra",
            "Manipur",
            "Meghalaya",
            "Mizoram",
            "Nagaland",
            "Odisha",
            "Punjab",
            "Rajasthan",
            "Sikkim",
            "Tamil Nadu",
            "Telangana",
            "Tripura",
            "Uttar Pradesh",
            "Uttarakhand",
            "West Bengal", }));
stt.setToolTipText("");
stt.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        sttActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(72, 72, 72)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(hos_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(pin_code, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(street, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addComponent(stt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(73, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(hos_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(pin_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(stt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(22, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (hos_name.getText().isEmpty() || hos_name.getText().equals("Hospital Name")) {
                JOptionPane.showMessageDialog(this, "Enter Hospital name!", "Hospital", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (user_name.getText().isEmpty() || user_name.getText().equals("Username")) {
                JOptionPane.showMessageDialog(this, "Enter Username!", "Username", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717");
                String sql = "SELECT hospital_id from hospital_table where hos_username='" + user_name.getText() + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                int id = 0;
                Boolean found = false;
                while (rs.next()) {
                    id = rs.getInt(1);
                    found = true;
                }
                if (found) {
                    JOptionPane.showMessageDialog(this, "Username already exist,please choose another one!", "Username", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (ClassNotFoundException | NumberFormatException | SQLException e1) {
            }
            if (user_name.getText().length() < 8 || user_name.getText().length() > 15) {
                JOptionPane.showMessageDialog(this, "Username must be of 8-15 characters!", "Username", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (street.getText().isEmpty() || street.getText().equals("Street")) {
                JOptionPane.showMessageDialog(this, "Enter street no!", "Street", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (city.getText().isEmpty() || city.getText().equals("City")) {
                JOptionPane.showMessageDialog(this, "Enter city!", "City", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (pin_code.getText().isEmpty() || pin_code.getText().equals("Pincode")) {
                JOptionPane.showMessageDialog(this, "Enter pincode!", "Pincode", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(pin_code.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter pincode number in numbers!", "Pincode", JOptionPane.WARNING_MESSAGE);

                return;
            }
            if (phone.getText().isEmpty() || phone.getText().equals("Phone")) {
                JOptionPane.showMessageDialog(this, "Please enter phone number!", "Phone", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (phone.getText().length() != 10) {
                JOptionPane.showMessageDialog(this, "Phone number must be of 10 digits!", "Phone", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (phone.getText().startsWith("9") || phone.getText().startsWith("8") || phone.getText().startsWith("7") || phone.getText().startsWith("6")) {
            } else {
                JOptionPane.showMessageDialog(this, "Phone number is wrong!", "Phone", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(phone.getText().substring(0, 5));
                int s2 = Integer.parseInt(phone.getText().substring(5, 10));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid phone number!", "Phone", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (email.getText().isEmpty() || email.getText().equals("Email")) {
                JOptionPane.showMessageDialog(this, "Enter email!", "E-mail", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                String c = null;
                String url = "https://isitarealemail.com/api/email/validate?email=" + email.getText();

                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                StringBuffer response;
                try ( BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String inputLine;
                    response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }

                c = response.substring(11, 16);
                if (!"valid".equals(c)) {
                    JOptionPane.showMessageDialog(this, "Email is invalid", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (MalformedURLException ex) {
                return;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Email is invalid", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (password.getText().isEmpty() || password.getText().equals("Password")) {
                JOptionPane.showMessageDialog(this, "Enter Password!", "Password", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Pattern p1 = Pattern.compile("\\b(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!#%*?&]{8,18}\\b");
            Matcher pwd = p1.matcher(password.getText());
            if ((!pwd.find()) && (password.getText().length() <= 8)) {
                JOptionPane.showMessageDialog(this, "Password should be: \n1) One Capital Letter\n2) Special Character\n3) One Number \n4) Length Should be 8-18.", "Password", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (state.equals("State")) {
                JOptionPane.showMessageDialog(this, "Enter state!", "State", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                System.out.println("State:" + state);
            }
            Random rand = new Random();
            int upperbound = 10000;
            int int_random = rand.nextInt(upperbound);
            String otp = Integer.toString(int_random - 1);
            try {
                final String fromEmail = "bloodbankjavaproject12@gmail.com";
                final String passwordmail = "rfgkzzytogpxfmar";
                String toEmail = email.getText();
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
            for (int j = 0; j < rep; j++) {
                if (res.equals(otp)) {
                    String h_name = hos_name.getText();
                    String h_user_name = user_name.getText();
                    String h_street = street.getText();
                    String h_city = city.getText();
                    int h_pin_code = Integer.parseInt(pin_code.getText());
                    String h_phone = phone.getText();
                    String h_email = email.getText();
                    String h_password = password.getText();
                    String h_date = null;
                    String h_time = null;
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        h_date = sdf.format(new Date());
                    } catch (Exception e) {
                    }
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                        h_time = sdf.format(new Date());
                    } catch (Exception e) {
                    }

                    try {
                        String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        try ( Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717")) {
                            String query = " insert into hospital_table(hos_name,hos_username,street,city,pincode,state,phone,email,password,date,time)"
                                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement preparedStmt = conn.prepareStatement(query);
                            preparedStmt.setString(1, h_name);
                            preparedStmt.setString(2, h_user_name);
                            preparedStmt.setString(3, h_street);
                            preparedStmt.setString(4, h_city);
                            preparedStmt.setInt(5, h_pin_code);
                            preparedStmt.setString(6, state);
                            preparedStmt.setString(7, h_phone);
                            preparedStmt.setString(8, h_email);
                            preparedStmt.setString(9, h_password);
                            preparedStmt.setString(10, h_date);
                            preparedStmt.setString(11, h_time);
                            preparedStmt.execute();
                        }
                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(this, e, "Register", JOptionPane.WARNING_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(this, "Registered successfully!", "Verified", JOptionPane.INFORMATION_MESSAGE);
                    try {
                        final String fromEmail = "bloodbankjavaproject12@gmail.com";
                        final String passwordmail = "rfgkzzytogpxfmar";
                        String toEmail = email.getText();

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
                            msg.setSubject("Registration successfull!");
                            msg.setSentDate(new Date());
                            Multipart emailContent = new MimeMultipart();
                            MimeBodyPart textBodyPart = new MimeBodyPart();
                            textBodyPart.setText("Hello " + hos_name.getText() + "!" + "\nYour password is : " + password.getText() + "\nDon't share it with anyone!");
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
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong OTP!", "OTP", JOptionPane.WARNING_MESSAGE);
                    String res1 = JOptionPane.showInputDialog(this, "Enter OTP sent on your email:", "Verification", JOptionPane.INFORMATION_MESSAGE);
                    rep = rep + 1;
                    res = res1;
                }
            }
        } catch (Exception e) {
            System.out.println("Hospital Register");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void pin_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_codeActionPerformed

    private void hos_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hos_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hos_nameActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void sttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sttActionPerformed
        // TODO add your handling code here:
        try {
            stt.removeItem("State");
        } catch (Exception e) {
        }
        state = (String) stt.getSelectedItem();
    }//GEN-LAST:event_sttActionPerformed
// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.TextField city;
    private swing.TextField email;
    private swing.TextField hos_name;
    private javax.swing.JLabel jLabel1;
    private swing.Password password;
    private swing.TextField phone;
    private swing.TextField pin_code;
    private swing.TextField street;
    private javax.swing.JComboBox<String> stt;
    private swing.TextField user_name;
    // End of variables declaration//GEN-END:variables
    private String state;
}
