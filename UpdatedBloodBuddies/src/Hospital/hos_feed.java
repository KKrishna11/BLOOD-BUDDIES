package Hospital;

import ALLMAINFILES.HosNavBar;
import HosLoginAndRegister.Register;
import NGO.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
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
import java.util.Date;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class hos_feed extends javax.swing.JFrame {

    String f_id = null;

    public hos_feed(String g_id) {
        f_id = g_id;
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        setIconImage(icon);

        setBounds(-6, -6, 1600, 890);
        from.setForeground(Color.GRAY);

        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browse.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                browse.setBackground(new Color(255, 204, 204));
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
        from.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (from.getText().equals("From")) {
                    from.setText("");
                    from.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (from.getText().isEmpty()) {
                    from.setForeground(Color.GRAY);
                    from.setText("From");
                }
            }
        });
        pwd.setForeground(Color.GRAY);
        pwd.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (pwd.getText().equals("Password")) {
                    pwd.setText("");
                    pwd.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (pwd.getText().isEmpty()) {
                    pwd.setForeground(Color.GRAY);
                    pwd.setText("Password");
                }
            }
        });
        to.setForeground(Color.GRAY);
        to.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (to.getText().equals("To")) {
                    to.setText("");
                    to.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (to.getText().isEmpty()) {
                    to.setForeground(Color.GRAY);
                    to.setText("To");
                }
            }
        });
        subject.setForeground(Color.GRAY);
        subject.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (subject.getText().equals("Subject")) {
                    subject.setText("");
                    subject.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (subject.getText().isEmpty()) {
                    subject.setForeground(Color.GRAY);
                    subject.setText("Subject");
                }
            }
        });
        message.setText("Message");
        message.setForeground(Color.GRAY);
        message.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (message.getText().equals("Message")) {
                    message.setText("");
                    message.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (message.getText().isEmpty()) {
                    message.setForeground(Color.GRAY);
                    message.setText("Message");
                }
            }
        });
        sfile.addItem("Selected Files");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextPane();
        button1 = new swing.Button();
        button2 = new swing.Button();
        button3 = new swing.Button();
        browse = new swing.Button();
        sfile = new javax.swing.JComboBox<>();
        pwd = new javax.swing.JTextField();
        from = new javax.swing.JTextField();
        subject = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel1.setText("To");

        jLabel2.setText("From");

        jLabel3.setText("Subject");

        jLabel4.setText("Message");

        jLabel5.setText("Attachment");

        jScrollPane1.setViewportView(message);

        button1.setBackground(new java.awt.Color(255, 204, 204));
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Reset");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(255, 204, 204));
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Send");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 204, 204));
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setText("Back");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        browse.setBackground(new java.awt.Color(255, 204, 204));
        browse.setForeground(new java.awt.Color(0, 0, 0));
        browse.setText("Browse...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        sfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        sfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfileActionPerformed(evt);
            }
        });

        pwd.setText("Password");
        pwd.setToolTipText("1. Connect to your Google account. Click on the top right corner and click \"My account\".2.Enable 2 step varification.3.Click Security and App passwords.");

        from.setText("From");
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });

        subject.setText("Subject");
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        to.setText("To");
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sfile, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addComponent(sfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        try {
            if (from.getText().isEmpty() || pwd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Sender's and Reciever's emails are required", "E-Mail", JOptionPane.ERROR_MESSAGE);
            } else {
                String fromEmail = from.getText();
                String password = pwd.getText();
                String toEmail = to.getText();
                try {
                    String c = null;
                    String url = "https://isitarealemail.com/api/email/validate?email=" + fromEmail;

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
                    JOptionPane.showMessageDialog(this, "Sender mail is invalid", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try {
                    String c = null;
                    String url = "https://isitarealemail.com/api/email/validate?email=" + toEmail;

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
                    JOptionPane.showMessageDialog(this, "Receiver mail is invalid", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                int op = 0;
                if (message.getText().length() == 0 || message.getText().equals("Message")) {
                    op = JOptionPane.showConfirmDialog(this, "Do you want send the mail without message?", "Message", JOptionPane.OK_OPTION);
                }
                if (op == 0) {
//                final String fromEmail = "bloodbankjavaproject12@gmail.com";
//                final String password = "rfgkzzytogpxfmar";
                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    if (fromEmail.contains("@yahoo") || toEmail.contains("@yahoo")) {
                        properties.put("mail.smtp.host", "smtp.mail.yahoo.com");
                    } else if (fromEmail.contains("@gmail") || toEmail.contains("@gmail")) {
                        properties.put("mail.smtp.host", "smtp.gmail.com");
                    } else {
                        JOptionPane.showMessageDialog(this, "Only  gmail or yahoo is allowed!", "Mail", JOptionPane.WARNING_MESSAGE);
                    }
                    properties.put("mail.smtp.port", "587");

                    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(fromEmail, password);
                        }
                    });
                    MimeMessage msg = new MimeMessage(session);
                    try {
                        msg.setFrom(new InternetAddress(fromEmail));
                        msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                        msg.setSubject(subject.getText());
                        msg.setSentDate(new Date());
                        Multipart emailContent = new MimeMultipart();
                        MimeBodyPart textBodyPart = new MimeBodyPart();
                        textBodyPart.setText(message.getText());
                        emailContent.addBodyPart(textBodyPart);
                        try {
                            for (File file : selectedFiles) {
                                DataSource dataSource = new FileDataSource(file);
                                MimeBodyPart mimeBodyPart = new MimeBodyPart();
                                try {
                                    mimeBodyPart.setDataHandler(new DataHandler(dataSource));
                                } catch (MessagingException ex) {
                                    Logger.getLogger(hos_feed.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try {
                                    mimeBodyPart.setFileName(file.getName());
                                } catch (MessagingException ex) {
                                    Logger.getLogger(hos_feed.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                emailContent.addBodyPart(mimeBodyPart);
                            }
                        } catch (MessagingException e) {
                        }
                        msg.setContent(emailContent);
                        Transport.send(msg);
                        JOptionPane.showMessageDialog(this, "Your message has been sent!", "Sent", JOptionPane.INFORMATION_MESSAGE);

                    } catch (MessagingException e) {
                        MessagingException er = e;
                        JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } catch (HeadlessException e) {
            Exception er = e;
//            JOptionPane.showMessageDialog(this, er, "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("Hospital Feedback");
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser jfileChooser = new JFileChooser();
        jfileChooser.setDialogTitle("Attachments");
        jfileChooser.setMultiSelectionEnabled(true);
        int result = jfileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFiles = jfileChooser.getSelectedFiles();
        }
        try {
            String item = "Selected Files";
            boolean exists = false;
            if (item.equals(sfile.getItemAt(0))) {
                exists = true;
            }
            if (exists) {
                sfile.removeItemAt(0);
            }
        } catch (Exception e) {
            System.out.println("Hospital Feedback");
        }

        for (File file : selectedFiles) {
            sfile.addItem(file.getName());
        }
    }//GEN-LAST:event_browseActionPerformed

    private void sfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sfileActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        selectedFiles = null;
        from.setForeground(Color.GRAY);
        from.setText("From");
        pwd.setForeground(Color.GRAY);
        pwd.setText("Password");
        to.setForeground(Color.GRAY);
        to.setText("To");
        subject.setForeground(Color.GRAY);
        subject.setText("Subject");
        message.setForeground(Color.GRAY);
        message.setText("Message");
        sfile.removeAllItems();
        JOptionPane.showMessageDialog(this, "Reset Done!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        sfile.addItem("Selected Files");
    }//GEN-LAST:event_button1ActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        HosNavBar s = new HosNavBar();
        s.l1.setText(f_id);
        s.l1.setVisible(false);
        this.dispose();
        s.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

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
            java.util.logging.Logger.getLogger(hos_feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hos_feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hos_feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hos_feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new hos_feed(str).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button browse;
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private javax.swing.JTextField from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane message;
    private javax.swing.JTextField pwd;
    private javax.swing.JComboBox<String> sfile;
    private javax.swing.JTextField subject;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
    private File[] selectedFiles;
}
