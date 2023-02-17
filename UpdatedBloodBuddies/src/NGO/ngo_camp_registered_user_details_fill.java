package NGO;

import Hospital.*;
import ALLMAINFILES.HosNavBar;
import HosLoginAndRegister.Register;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import com.itextpdf.text.BadElementException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class ngo_camp_registered_user_details_fill extends javax.swing.JFrame {

    String f_id = null;

    public ngo_camp_registered_user_details_fill(String g_id) {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);

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

        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        this.setIconImage(icon);
        f_id = g_id;
        System.out.println(f_id);
        setBounds(-6, -6, 1600, 900);
        camp_id.setForeground(Color.GRAY);
        camp_id.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (camp_id.getText().equals("Camp ID")) {
                    camp_id.setText("");
                    camp_id.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (camp_id.getText().isEmpty()) {
                    camp_id.setForeground(Color.GRAY);
                    camp_id.setText("Camp ID");
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
        first_name.setForeground(Color.GRAY);
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
        dob.setForeground(Color.GRAY);
        dob.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (dob.getText().equals("Date Of Birth")) {
                    dob.setText("");
                    dob.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (dob.getText().isEmpty()) {
                    dob.setForeground(Color.GRAY);
                    dob.setText("Date Of Birth");
                }
            }
        });
        gender.setForeground(Color.GRAY);
        gender.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (gender.getText().equals("Gender")) {
                    gender.setText("");
                    gender.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (gender.getText().isEmpty()) {
                    gender.setForeground(Color.GRAY);
                    gender.setText("Gender");
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
        blood_type.setForeground(Color.GRAY);
        blood_type.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (blood_type.getText().equals("Blood Type")) {
                    blood_type.setText("");
                    blood_type.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (blood_type.getText().isEmpty()) {
                    blood_type.setForeground(Color.GRAY);
                    blood_type.setText("Blood Type");
                }
            }
        });
        staff_id.setForeground(Color.GRAY);
        staff_id.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (staff_id.getText().equals("ID")) {
                    staff_id.setText("");
                    staff_id.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (staff_id.getText().isEmpty()) {
                    staff_id.setForeground(Color.GRAY);
                    staff_id.setText("ID");
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
        state.setForeground(Color.GRAY);
        state.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (state.getText().equals("State")) {
                    state.setText("");
                    state.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (state.getText().isEmpty()) {
                    state.setForeground(Color.GRAY);
                    state.setText("State");
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
        jLabel6 = new javax.swing.JLabel();
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
        state = new swing.TextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        staff_id = new swing.TextField();
        gender = new swing.TextField();
        jLabel23 = new javax.swing.JLabel();
        aadhaar_no = new swing.TextField();
        camp_id = new swing.TextField();
        jLabel24 = new javax.swing.JLabel();
        dob = new swing.TextField();
        blood_type = new swing.TextField();
        button3 = new swing.Button();
        l1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registered User Details");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1600, 701));

        first_name.setText("First Name");
        first_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                first_nameMouseClicked(evt);
            }
        });
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

        jLabel6.setText("Blood Group");

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

        phone.setText("Phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        email.setText("Email");

        room.setText("Room/Flat No");
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });

        street.setText("Street No");

        city.setText("City");

        pin_code.setText("Pincode");
        pin_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin_codeActionPerformed(evt);
            }
        });

        state.setText("State");

        jLabel16.setText("Date Of Birth");

        jLabel17.setText("Staff/Operator ID");

        staff_id.setText("ID");
        staff_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_idActionPerformed(evt);
            }
        });

        gender.setText("Gender");
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel23.setText("Aadhaar No");

        aadhaar_no.setText("Aadhaar No");
        aadhaar_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaar_noActionPerformed(evt);
            }
        });

        camp_id.setText("Camp ID");
        camp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_idActionPerformed(evt);
            }
        });

        jLabel24.setText("Camp ID");

        dob.setText("Date Of Birth");

        blood_type.setText("Blood Type");

        button3.setBackground(new java.awt.Color(255, 204, 204));
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setText("Find");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel23))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(first_name, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(aadhaar_no, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(camp_id, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staff_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(street, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pin_code, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blood_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(557, 557, 557)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(camp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blood_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(aadhaar_no, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pin_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(l1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blood_collection(int b_done, String t_b_type, int cmp_id) {
        try {
            String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            try ( Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                String sqlUpdate = "update blood_collection set " + t_b_type + "=" + t_b_type + "+?,camp_id=?,ngo_id=(select ngo_id from camp_table where camp_id=?) where camp_id=?";
                PreparedStatement pstmt = conn1.prepareStatement(sqlUpdate);
                pstmt.setInt(1, b_done);
                pstmt.setInt(2, cmp_id);
                pstmt.setInt(3, cmp_id);
                pstmt.setInt(4, cmp_id);
                pstmt.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.WARNING_MESSAGE);
            System.out.println("NGO Camp Registered User Details Fill");
        }
    }
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        new ngo_camp_details(f_id).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void pin_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_codeActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (camp_id.getText().isEmpty() || camp_id.getText().equals("Camp ID")) {
                JOptionPane.showMessageDialog(this, "Please enter Camp ID!", "Camp ID", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int d_id = Integer.parseInt(camp_id.getText());
            } catch (HeadlessException | NumberFormatException e3) {
                JOptionPane.showMessageDialog(this, "Camp ID is Invalid!", "Camp ID", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (aadhaar_no.getText().isEmpty() || aadhaar_no.getText().equals("Aadhaar No")) {
                JOptionPane.showMessageDialog(this, "Please enter Adhaar No!", "Aadhaar No", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                if (aadhaar_no.getText().length() == 12) {
                    int a_st = Integer.parseInt(aadhaar_no.getText().substring(0, 4));
                    int a_st2 = Integer.parseInt(aadhaar_no.getText().substring(4, 8));
                    int a_st3 = Integer.parseInt(aadhaar_no.getText().substring(8, 12));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter valid Aadhaar No!", "Aadhaar No", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (aadhaar_no.getText().length() != 12) {
                JOptionPane.showMessageDialog(this, "Please enter valid Aadhaar No!", "Aadhaar No", JOptionPane.WARNING_MESSAGE);
                return;

            }
            if (first_name.getText().isEmpty() || first_name.getText().equals("First Name")) {
                JOptionPane.showMessageDialog(this, "Please enter First Name!", "First Name", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (last_name.getText().isEmpty() || last_name.getText().equals("Last Name")) {
                JOptionPane.showMessageDialog(this, "Please enter Last Name!", "Last Name", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (dob.getText().isEmpty() || dob.getText().equals("Date Of Birth")) {
                JOptionPane.showMessageDialog(this, "Please enter Date of birth!", "Date Of Birth", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                if (dob.getText().length() == 10) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String p_date = sdf.format(new Date());
                    int s1 = Integer.parseInt(p_date.substring(0, 4));
                    int s2 = Integer.parseInt(p_date.substring(5, 7));
                    int s3 = Integer.parseInt(p_date.substring(8, 10));
                    int m1 = Integer.parseInt(dob.getText().substring(0, 4));
                    int m2 = Integer.parseInt(dob.getText().substring(5, 7));
                    int m3 = Integer.parseInt(dob.getText().substring(8, 10));
                    if (m1 > s1) {
                        JOptionPane.showMessageDialog(this, "Time traveler?", "Date", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    if (m1 == s1) {
                        if (m2 > s2) {
                            JOptionPane.showMessageDialog(this, "Time traveler?", "Date", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        if (m2 == s2 && m3 > s3) {
                            JOptionPane.showMessageDialog(this, "Time traveler?", "Date", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Date is invalid!", "Date", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter date in yyyy-mm-dd Format!", "Date Of Birth", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (gender.getText().isEmpty() || gender.getText().equals("Gender")) {
                JOptionPane.showMessageDialog(this, "Please enter Gender!", "Gender", JOptionPane.WARNING_MESSAGE);
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

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                c = response.substring(11, 16);
                System.out.println(c);
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
            if (blood_type.getText().isEmpty() || blood_type.getText().equals("Blood Type")) {
                JOptionPane.showMessageDialog(this, "Please enter blood type!", "Blood Type", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (staff_id.getText().isEmpty() || staff_id.getText().equals("ID")) {
                JOptionPane.showMessageDialog(this, "Enter Staff ID.", "Operator ID", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int d_id = Integer.parseInt(staff_id.getText());
            } catch (HeadlessException | NumberFormatException e3) {
                JOptionPane.showMessageDialog(this, "Staff ID is Invalid!", "Operator ID", JOptionPane.WARNING_MESSAGE);
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
            if (city.getText().isEmpty() || city.getText().equals("City")) {
                JOptionPane.showMessageDialog(this, "Please enter city!", "City", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (pin_code.getText().isEmpty() || pin_code.getText().equals("Pincode")) {
                JOptionPane.showMessageDialog(this, "Please enter pincode number!", "Pincode", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int ss = Integer.parseInt(pin_code.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter pincode number in numbers!", "Pincode", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (state.getText().isEmpty() || state.getText().equals("State")) {
                JOptionPane.showMessageDialog(this, "Please enter state!", "State", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int e_camp_id = Integer.parseInt(camp_id.getText());
            String e_email = email.getText();
            String e_aadhaar_no = aadhaar_no.getText();
            String e_first_name = first_name.getText();
            String e_last_name = last_name.getText();
            String e_dob = dob.getText();
            String e_gender = gender.getText();
            String e_phone = phone.getText();
            String e_blood_type = blood_type.getText();
            int e_staff_id = Integer.parseInt(staff_id.getText());
            String e_room = room.getText();
            String e_street = street.getText();
            String e_city = city.getText();
            int e_pincode = Integer.parseInt(pin_code.getText());
            String e_state = state.getText();
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                e_date = sdf.format(new Date());
            } catch (Exception e) {
            }
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                e_time = sdf.format(new Date());
            } catch (Exception e) {
            }
            try {
                String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                    String sqlUpdate = "update user_info_table set first_name=?,last_name=?"
                            + ",date_of_birth=?,gender=?,blood_group=?,phone=?,email=?,room_no=?"
                            + ",street=?,city=?,pincode=?,state=?,last_donated_date=?,level=level+1 where aadhaar_no=?";
                    PreparedStatement pstmt = conn1.prepareStatement(sqlUpdate);
                    pstmt.setString(1, e_first_name);
                    pstmt.setString(2, e_last_name);
                    pstmt.setString(3, e_dob);
                    pstmt.setString(4, e_gender);
                    pstmt.setString(5, e_blood_type);
                    pstmt.setString(6, e_phone);
                    pstmt.setString(7, e_email);
                    pstmt.setString(8, e_room);
                    pstmt.setString(9, e_street);
                    pstmt.setString(10, e_city);
                    pstmt.setInt(11, e_pincode);
                    pstmt.setString(12, e_state);
                    pstmt.setString(13, e_date);
                    pstmt.setString(14, e_aadhaar_no);
                    pstmt.executeUpdate();
                }
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                    String query = " insert into blood_donation(camp_id,aadhaar_no,blood_group,blood_donated,staff_id,date,time)"
                            + " values (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = conn1.prepareStatement(query);
                    preparedStmt.setInt(1, e_camp_id);
                    preparedStmt.setString(2, e_aadhaar_no);
                    preparedStmt.setString(3, e_blood_type);
                    preparedStmt.setInt(4, 1);
                    preparedStmt.setInt(5, e_staff_id);
                    preparedStmt.setString(6, e_date);
                    preparedStmt.setString(7, e_time);
                    preparedStmt.execute();
                }
            } catch (ClassNotFoundException | SQLException e1) {
                JOptionPane.showMessageDialog(this, "Empty row!", "Data", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                    String sqlUpdate = "update user_app set  "
                            + "app_status='Completed' where aadhaar_no=? and app_status='New'";
                    PreparedStatement pstmt = conn1.prepareStatement(sqlUpdate);
                    pstmt.setString(1, e_aadhaar_no);
                    pstmt.executeUpdate();
                }
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                if (e_blood_type.equals("O+") || e_blood_type.equals("o+")) {
                    blood_collection(1, "o_positive", e_camp_id);
                }
                if (e_blood_type.equals("O-") || e_blood_type.equals("o-")) {
                    blood_collection(1, "o_negative", e_camp_id);
                }
                if (e_blood_type.equals("AB+") || e_blood_type.equals("ab+")) {
                    blood_collection(1, "ab_positive", e_camp_id);
                }
                if (e_blood_type.equals("AB-") || e_blood_type.equals("ab-")) {
                    blood_collection(1, "ab_negative", e_camp_id);
                }
                if (e_blood_type.equals("A+") || e_blood_type.equals("a+")) {
                    blood_collection(1, "a_positive", e_camp_id);
                }
                if (e_blood_type.equals("A-") || e_blood_type.equals("a-")) {
                    blood_collection(1, "a_negative", e_camp_id);
                }
                if (e_blood_type.equals("B+") || e_blood_type.equals("b+")) {
                    blood_collection(1, "b_positive", e_camp_id);
                }
                if (e_blood_type.equals("B-") || e_blood_type.equals("b-")) {
                    blood_collection(1, "b_negative", e_camp_id);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(this, "Successfully Done!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            int c_camp_id = 0;
            String c_phone = null;
            String c_email = null;
            try {
                String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717");
                String sql = "SELECT camp_id,phone,email from camp_table where camp_id='" + e_camp_id + "'";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    c_camp_id = rs.getInt(1);
                    c_phone = rs.getString(2);
                    c_email = rs.getString(3);
                }
            } catch (ClassNotFoundException | NumberFormatException | SQLException e1) {
            }
            Document document = new Document();
            @SuppressWarnings("unused")
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(null);
            File file = new File(fc.getSelectedFile().getAbsolutePath());
            try {
                PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(file + ".pdf"));
            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            Font boldFont1 = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Font boldFont2 = new Font(Font.FontFamily.HELVETICA, 13, Font.ITALIC);
            document.setMargins(40, 40, 40, 40);
            Paragraph paragraph1 = new Paragraph("Blood Buddies", boldFont1);
            paragraph1.setAlignment(1);//center

            Paragraph paragraph2 = new Paragraph("“A single pint can save three lives, a single gesture can create a million smiles”", boldFont2);
            paragraph2.setAlignment(1);//center
            paragraph2.setSpacingBefore(25);
            paragraph2.setSpacingAfter(25);

            Paragraph paragraph3 = new Paragraph();
            paragraph3.setAlignment(1);//center
            paragraph3.setSpacingBefore(30);
            paragraph3.setSpacingAfter(30);
            paragraph3.add("Camp Details:\n" + "Camp Id:" + c_camp_id + "\n" + "E-Mail:" + c_email + "\n" + "Phone:" + c_phone + "\n");

            com.itextpdf.text.Image image1 = null;
            try {
                image1 = com.itextpdf.text.Image.getInstance("temp.jpg");
            } catch (BadElementException | IOException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            image1.setAlignment(1);
            image1.scaleAbsolute(50, 50);
            PdfPTable pdfPTable = new PdfPTable(2);
//        pdfPTable.setTotalWidth(20);
            Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
            PdfPCell pdfPCell0 = new PdfPCell(new Paragraph("Personal Details:  ", boldFont));
            PdfPCell pdfPCell1 = new PdfPCell(new Paragraph("First name:    " + first_name.getText()));
            PdfPCell pdfPCell2 = new PdfPCell(new Paragraph("Last name: " + last_name.getText()));
            PdfPCell pdfPCell3 = new PdfPCell(new Paragraph("Date Of Birth: " + dob.getText()));
            PdfPCell pdfPCell4 = new PdfPCell(new Paragraph("Gender:    " + gender.getText()));
            PdfPCell pdfPCell5 = new PdfPCell(new Paragraph("Phone: " + phone.getText()));
            PdfPCell pdfPCell6 = new PdfPCell(new Paragraph("E-Mail:    " + email.getText()));
            PdfPCell pdfPCell7 = new PdfPCell(new Paragraph("Aadhaar No:    " + aadhaar_no.getText()));
            PdfPCell pdfPCell8 = new PdfPCell(new Paragraph("Blood Group:   " + blood_type.getText()));
            PdfPCell pdfPCell9 = new PdfPCell(new Paragraph("Blood Donated: " + "1 Bag"));
            PdfPCell pdfPCell10 = new PdfPCell(new Paragraph("Address Details:", boldFont));
            PdfPCell pdfPCell11 = new PdfPCell(new Paragraph("Room/Flat No: " + room.getText()));
            PdfPCell pdfPCell12 = new PdfPCell(new Paragraph("Street:   " + street.getText()));
            PdfPCell pdfPCell13 = new PdfPCell(new Paragraph("City: " + city.getText()));
            PdfPCell pdfPCell14 = new PdfPCell(new Paragraph("Pincode:  " + pin_code.getText()));
            PdfPCell pdfPCell15 = new PdfPCell(new Paragraph("State:    " + state.getText()));

            pdfPCell9.setColspan(2);
            pdfPCell0.setColspan(2);
            pdfPCell10.setColspan(2);
            pdfPCell15.setColspan(2);
            //pdfPCell3.setRowspan(2);
            pdfPTable.addCell(pdfPCell0);
            pdfPTable.addCell(pdfPCell1);
            pdfPTable.addCell(pdfPCell2);
            pdfPTable.addCell(pdfPCell3);
            pdfPTable.addCell(pdfPCell4);
            pdfPTable.addCell(pdfPCell5);
            pdfPTable.addCell(pdfPCell6);
            pdfPTable.addCell(pdfPCell7);
            pdfPTable.addCell(pdfPCell8);
            pdfPTable.addCell(pdfPCell9);
            pdfPTable.addCell(pdfPCell10);
            pdfPTable.addCell(pdfPCell11);
            pdfPTable.addCell(pdfPCell12);
            pdfPTable.addCell(pdfPCell13);
            pdfPTable.addCell(pdfPCell14);
            pdfPTable.addCell(pdfPCell15);
            try {
                document.add(image1);
            } catch (DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                document.add(paragraph1);
            } catch (DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                document.add(paragraph2);
            } catch (DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                document.add(pdfPTable);
            } catch (DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                document.add(paragraph3);
            } catch (DocumentException ex) {
                Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.close();
        } catch (Exception e) {
            System.out.println("NGO Camp Registered User Details Fill");
        }

    }//GEN-LAST:event_button1ActionPerformed

    private void first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameActionPerformed

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomActionPerformed

    private void staff_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_idActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void first_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_first_nameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nameMouseClicked

    private void aadhaar_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaar_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aadhaar_noActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void camp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_idActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        try {
            String f_aadhaar_no = aadhaar_no.getText();
            String myUrl = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "rootze", "root1717");
            String sql = "select user_info_table.first_name,user_info_table.last_name,user_info_table.date_of_birth,user_info_table.gender,user_info_table.phone,user_info_table.email,user_info_table.blood_group,user_info_table.room_no,user_info_table.street,user_info_table.city,user_info_table.pincode,user_info_table.state from user_info_table inner join user_app on user_app.aadhaar_no=user_info_table.aadhaar_no where user_app.aadhaar_no='" + f_aadhaar_no + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String f_first_name = null;
            String f_last_name = null;
            String f_dob = null;
            String f_gender = null;
            String f_phone = null;
            String f_email = null;
            String f_blood_type = null;
            String f_room = null;
            String f_street = null;
            String f_city = null;
            String f_pin_code = null;
            String f_state = null;
            while (rs.next()) {
                f_first_name = rs.getString(1);
                f_last_name = rs.getString(2);
                f_dob = rs.getString(3);
                f_gender = rs.getString(4);
                f_phone = rs.getString(5);
                f_email = rs.getString(6);
                f_blood_type = rs.getString(7);
                f_room = rs.getString(8);
                f_street = rs.getString(9);
                f_city = rs.getString(10);
                f_pin_code = rs.getString(11);
                f_state = rs.getString(12);
            }
            first_name.setForeground(Color.BLACK);
            first_name.setText(f_first_name);
            last_name.setForeground(Color.BLACK);
            last_name.setText(f_last_name);
            dob.setForeground(Color.BLACK);
            dob.setText(f_dob);
            gender.setText(f_gender);
            gender.setForeground(Color.BLACK);
            phone.setForeground(Color.BLACK);
            phone.setText(f_phone);
            email.setForeground(Color.BLACK);
            email.setText(f_email);
            blood_type.setForeground(Color.BLACK);
            blood_type.setText(f_blood_type);
            room.setForeground(Color.BLACK);
            room.setText(f_room);
            street.setForeground(Color.BLACK);
            street.setText(f_street);
            city.setForeground(Color.BLACK);
            city.setText(f_city);
            pin_code.setForeground(Color.BLACK);
            pin_code.setText(f_pin_code);
            state.setForeground(Color.BLACK);
            state.setText(f_state);
        } catch (ClassNotFoundException | NumberFormatException | SQLException e1) {
            JOptionPane.showMessageDialog(this, e1, "Error", JOptionPane.WARNING_MESSAGE);
//            JOptionPane.showMessageDialog(this, "User isn't registered! ", "Error", JOptionPane.WARNING_MESSAGE);
        }


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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_camp_registered_user_details_fill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String str = null;
                new ngo_camp_registered_user_details_fill(str).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.TextField aadhaar_no;
    private swing.TextField blood_type;
    private swing.Button button1;
    private swing.Button button2;
    private swing.Button button3;
    private swing.TextField camp_id;
    private swing.TextField city;
    private swing.TextField dob;
    private swing.TextField email;
    private swing.TextField first_name;
    private swing.TextField gender;
    private javax.swing.ButtonGroup gendergroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel l1;
    private swing.TextField last_name;
    private swing.TextField phone;
    private swing.TextField pin_code;
    private swing.TextField room;
    private swing.TextField staff_id;
    private swing.TextField state;
    private swing.TextField street;
    // End of variables declaration//GEN-END:variables
    private String e_date;
    private String e_time;
}
