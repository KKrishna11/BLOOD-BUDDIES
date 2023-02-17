package NGO;

import ALLMAINFILES.NAVBar;
import HosLoginAndRegister.Register;
import Hospital.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ngo_addstaff extends javax.swing.JFrame {

    String f_id = null;

    public ngo_addstaff(String g_id) {
        initComponents();
        f_id = g_id;
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        this.setIconImage(icon);
        setBounds(-7, -7, 1600, 890);

//        this.getContentPane().setBackground(Color.GRAY);
        first_name.setForeground(Color.GRAY);

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(83, 173, 202));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setBackground(new Color(255, 204, 204));
            }
        });

        getContentPane().setBackground(new Color(245, 245, 245));
        first_name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (first_name.getText().equals("First Name")) {
                    first_name.setText("");
                    first_name.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (first_name.getText().isEmpty()) {
                    first_name.setForeground(Color.GRAY);
                    first_name.setText("First Name");
                }
            }
        });
        last_name.setForeground(Color.GRAY);
        last_name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (last_name.getText().equals("Last Name")) {
                    last_name.setText("");
                    last_name.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (last_name.getText().isEmpty()) {
                    last_name.setForeground(Color.GRAY);
                    last_name.setText("Last Name");
                }
            }
        });
        aadhaar_no.setForeground(Color.GRAY);
        aadhaar_no.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (aadhaar_no.getText().equals("Aadhaar No")) {
                    aadhaar_no.setText("");
                    aadhaar_no.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (aadhaar_no.getText().isEmpty()) {
                    aadhaar_no.setForeground(Color.GRAY);
                    aadhaar_no.setText("Aadhaar No");
                }
            }
        });
        phone.setForeground(Color.GRAY);
        phone.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (phone.getText().equals("Phone")) {
                    phone.setText("");
                    phone.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (phone.getText().isEmpty()) {
                    phone.setForeground(Color.GRAY);
                    phone.setText("Phone");
                }
            }
        });
        email.setForeground(Color.GRAY);
        email.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (email.getText().equals("Email")) {
                    email.setText("");
                    email.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (email.getText().isEmpty()) {
                    email.setForeground(Color.GRAY);
                    email.setText("Email");
                }
            }
        });
        desg.setForeground(Color.GRAY);
        desg.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (desg.getText().equals("Designation")) {
                    desg.setText("");
                    desg.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (desg.getText().isEmpty()) {
                    desg.setForeground(Color.GRAY);
                    desg.setText("Designation");
                }
            }
        });
        salary.setForeground(Color.GRAY);
        salary.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (salary.getText().equals("Salary")) {
                    salary.setText("");
                    salary.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (salary.getText().isEmpty()) {
                    salary.setForeground(Color.GRAY);
                    salary.setText("Salary");
                }
            }
        });
        room.setForeground(Color.GRAY);
        room.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (room.getText().equals("Room/Flat No")) {
                    room.setText("");
                    room.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (room.getText().isEmpty()) {
                    room.setForeground(Color.GRAY);
                    room.setText("Room/Flat No");
                }
            }
        });
        street.setForeground(Color.GRAY);
        street.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (street.getText().equals("Street No")) {
                    street.setText("");
                    street.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (street.getText().isEmpty()) {
                    street.setForeground(Color.GRAY);
                    street.setText("Street No");
                }
            }
        });
        city.setForeground(Color.GRAY);
        city.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (city.getText().equals("City")) {
                    city.setText("");
                    city.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (city.getText().isEmpty()) {
                    city.setForeground(Color.GRAY);
                    city.setText("City");
                }
            }
        });
        pin_code.setForeground(Color.GRAY);
        pin_code.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (pin_code.getText().equals("Pincode")) {
                    pin_code.setText("");
                    pin_code.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (pin_code.getText().isEmpty()) {
                    pin_code.setForeground(Color.GRAY);
                    pin_code.setText("Pincode");
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

        gendergroup = new javax.swing.ButtonGroup();
        first_name = new swing.TextField();
        button1 = new swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        button2 = new swing.Button();
        last_name = new swing.TextField();
        phone = new swing.TextField();
        email = new swing.TextField();
        room = new swing.TextField();
        street = new swing.TextField();
        city = new swing.TextField();
        pin_code = new swing.TextField();
        r_male = new javax.swing.JRadioButton();
        r_female = new javax.swing.JRadioButton();
        r_others = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        desg = new swing.TextField();
        salary = new swing.TextField();
        aadhaar_no = new swing.TextField();
        jLabel4 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        stt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Staff");
        setBackground(new java.awt.Color(255, 255, 255));

        first_name.setText("First Name");
        first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nameActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(255, 204, 204));
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Done");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Phone");

        jLabel5.setText("Email");

        jLabel8.setText("City");

        jLabel9.setText("Pincode");

        jLabel10.setText("State");

        jLabel11.setText("Gender");

        jLabel12.setText("Room/Flat No");

        jLabel13.setText("Street");

        button2.setBackground(new java.awt.Color(255, 204, 204));
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Back");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        last_name.setText("Last Name");
        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });

        phone.setText("Phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        email.setText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        room.setText("Room/Flat No");

        street.setText("Street No");

        city.setText("City");

        pin_code.setText("Pincode");
        pin_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin_codeActionPerformed(evt);
            }
        });

        r_male.setBackground(new java.awt.Color(255, 255, 255));
        gendergroup.add(r_male);
        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        r_female.setBackground(new java.awt.Color(255, 255, 255));
        gendergroup.add(r_female);
        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        r_others.setBackground(new java.awt.Color(255, 255, 255));
        gendergroup.add(r_others);
        r_others.setText("Others");
        r_others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_othersActionPerformed(evt);
            }
        });

        jLabel16.setText("Date Of Birth");

        dob.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Designation");

        jLabel17.setText("Salary");

        desg.setText("Designation");

        salary.setText("Salary");

        aadhaar_no.setText("Aadhaar No");
        aadhaar_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaar_noActionPerformed(evt);
            }
        });

        jLabel4.setText("Aadhaar No");

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(573, 573, 573)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(aadhaar_no, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(r_male)
                                    .addGap(86, 86, 86)
                                    .addComponent(r_female, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(r_others))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(75, 75, 75)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(street, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(salary, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(desg, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(pin_code, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(stt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap(414, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(44, 44, 44))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(l1)
                .addContainerGap(1043, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(desg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(aadhaar_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r_others)
                        .addComponent(r_female)
                        .addComponent(r_male)
                        .addComponent(jLabel11)))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pin_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(35, 35, 35)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(stt)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
            .addGap(28, 28, 28)
            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(152, 152, 152))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(l1)
                .addContainerGap(552, Short.MAX_VALUE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        new ngo_staff_details(f_id).setVisible(true);
        dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void pin_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_codeActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (first_name.getText().isEmpty() || first_name.getText().equals("First Name")) {
                JOptionPane.showMessageDialog(this, "Please enter First Name!", "First Name", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (last_name.getText().isEmpty() || last_name.getText().equals("Last Name")) {
                JOptionPane.showMessageDialog(this, "Please enter Last Name!", "Last Name", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (aadhaar_no.getText().isEmpty() || aadhaar_no.getText().equals("Aadhaar No")) {
                JOptionPane.showMessageDialog(this, "Please enter Adhaar No!", "Aadhaar No", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                if (aadhaar_no.getText().length() == 16) {
                    int a_st = Integer.parseInt(aadhaar_no.getText().substring(0, 5));
                    int a_st2 = Integer.parseInt(aadhaar_no.getText().substring(5, 10));
                    int a_st3 = Integer.parseInt(aadhaar_no.getText().substring(10, 16));
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid Aadhaar No!", "Aadhaar No", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String p_date = sdf.format(new Date());
                int s1 = Integer.parseInt(p_date.substring(0, 4));
                int s2 = Integer.parseInt(p_date.substring(5, 7));
                int s3 = Integer.parseInt(p_date.substring(8, 10));
                birth_date = sdf.format(dob.getDate());
                int m1 = Integer.parseInt(birth_date.substring(0, 4));
                int m2 = Integer.parseInt(birth_date.substring(5, 7));
                int m3 = Integer.parseInt(birth_date.substring(8, 10));
                if (m1 > s1 || m2 > s2 || m3 > s3) {
                    JOptionPane.showMessageDialog(this, "Time traveller?", "Date", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "Please enter date of birth!", "Date", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                if (gender.length() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select gender!", "Gender", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (HeadlessException e1) {
                JOptionPane.showMessageDialog(this, "Please select gender!", "Gender", JOptionPane.WARNING_MESSAGE);
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
                JOptionPane.showMessageDialog(this, "Enter email!", "E-Mail", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                String c = null;
                String url = "https://isitarealemail.com/api/email/validate?email=" + email.getText();

                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                StringBuffer response;
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
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
            if (desg.getText().isEmpty() || desg.getText().equals("Designation")) {
                JOptionPane.showMessageDialog(this, "Please enter designation of the employee!", "Designation", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (salary.getText().isEmpty() || salary.getText().equals("Salary")) {
                JOptionPane.showMessageDialog(this, "Please enter salary in numbers!", "Salary", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(salary.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter salary in numbers!", "Salary", JOptionPane.WARNING_MESSAGE);

                return;
            }
            if (room.getText().isEmpty() || room.getText().equals("Room/Flat No")) {
                JOptionPane.showMessageDialog(this, "Please enter room number!", "Room", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (street.getText().isEmpty() || street.getText().equals("Street No")) {
                JOptionPane.showMessageDialog(this, "Please enter street number!", "Street", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (pin_code.getText().isEmpty() || pin_code.getText().equals("Pincode")) {
                JOptionPane.showMessageDialog(this, "Please enter pincode number!", "Pincode", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(pin_code.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter pincode number in numbers!", "Pincode", JOptionPane.WARNING_MESSAGE);

                return;
            }
            if (state.equals("State")) {
                JOptionPane.showMessageDialog(this, "Enter state!", "State", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                System.out.println("State:" + state);
            }
            String s_first_name = first_name.getText();
            String s_last_name = last_name.getText();
            String s_aadhaar_no = aadhaar_no.getText();
            String s_email = email.getText();
            String s_phone = phone.getText();
            String s_desg = desg.getText();
            int s_salary = Integer.parseInt(salary.getText());
            String s_room = room.getText();
            String s_street = street.getText();
            String s_city = city.getText();
            int s_pin_code = Integer.parseInt(pin_code.getText());
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                s_date = sdf.format(new Date());
            } catch (Exception e) {
            }
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                s_time = sdf.format(new Date());
            } catch (Exception e) {
            }
            int n_id = Integer.parseInt(f_id);
            try {
                String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                    String query = " insert into staff_table(ngo_id,first_name,last_name,aadhaar_no,date_of_birth,gender,email,phone,designation,salary,room_no,street,city,pincode,state,joining_date,joining_time,status)"
                            + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = conn1.prepareStatement(query);
                    preparedStmt.setInt(1, n_id);
                    preparedStmt.setString(2, s_first_name);
                    preparedStmt.setString(3, s_last_name);
                    preparedStmt.setString(4, s_aadhaar_no);
                    preparedStmt.setString(5, birth_date);
                    preparedStmt.setString(6, gender);
                    preparedStmt.setString(7, s_email);
                    preparedStmt.setString(8, s_phone);
                    preparedStmt.setString(9, s_desg);
                    preparedStmt.setInt(10, s_salary);
                    preparedStmt.setString(11, s_room);
                    preparedStmt.setString(12, s_street);
                    preparedStmt.setString(13, s_city);
                    preparedStmt.setInt(14, s_pin_code);
                    preparedStmt.setString(15, state);
                    preparedStmt.setString(16, s_date);
                    preparedStmt.setString(17, s_time);
                    preparedStmt.setString(18, "Added");
                    preparedStmt.execute();
                    conn1.close();
                    JOptionPane.showMessageDialog(this, "Successfully Done!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ClassNotFoundException | SQLException e1) {
                JOptionPane.showMessageDialog(this, e1, "Data", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("NGO Add Staff");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void r_othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_othersActionPerformed
        gender = "Others";
    }//GEN-LAST:event_r_othersActionPerformed

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_nameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed
        gender = "Male";
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed
        gender = "Female";
    }//GEN-LAST:event_r_femaleActionPerformed

    private void aadhaar_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaar_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaar_noActionPerformed

    private void sttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sttActionPerformed
        // TODO add your handling code here:
        try {
            stt.removeItem("State");
        } catch (Exception e) {
        }
        state = (String) stt.getSelectedItem();
    }//GEN-LAST:event_sttActionPerformed

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
            java.util.logging.Logger.getLogger(ngo_addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_addstaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            String str = null;
            new ngo_addstaff(str).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField aadhaar_no;
    private swing.Button button1;
    private swing.Button button2;
    private swing.TextField city;
    private swing.TextField desg;
    private com.toedter.calendar.JDateChooser dob;
    private swing.TextField email;
    private swing.TextField first_name;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel l1;
    private swing.TextField last_name;
    private swing.TextField phone;
    private swing.TextField pin_code;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JRadioButton r_others;
    private swing.TextField room;
    private swing.TextField salary;
    private swing.TextField street;
    private javax.swing.JComboBox<String> stt;
    // End of variables declaration//GEN-END:variables
    private String birth_date;
    private String gender;
    private String s_date;
    private String s_time;
    private String state;

}
