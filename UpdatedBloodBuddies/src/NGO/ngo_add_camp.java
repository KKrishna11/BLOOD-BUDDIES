package NGO;

import ALLMAINFILES.NAVBar;
import HosLoginAndRegister.Register;
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
import java.net.URLConnection;
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

public class ngo_add_camp extends javax.swing.JFrame {

    String f_id = null;

    public ngo_add_camp(String g_id) {
        initComponents();
        f_id = g_id;
        System.out.println(f_id);
        this.getContentPane().setBackground(Color.WHITE);
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

        setBounds(-6, -6, 1600, 900);
        camp_name.setForeground(Color.GRAY);
        camp_name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (camp_name.getText().equals("Camp Name")) {
                    camp_name.setText("");
                    camp_name.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (camp_name.getText().isEmpty()) {
                    camp_name.setForeground(Color.GRAY);
                    camp_name.setText("Camp Name");
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
        hp_number.setForeground(Color.GRAY);
        hp_number.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (hp_number.getText().equals("Number")) {
                    hp_number.setText("");
                    hp_number.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (hp_number.getText().isEmpty()) {
                    hp_number.setForeground(Color.GRAY);
                    hp_number.setText("Number");
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
        start_time.setForeground(Color.GRAY);
        start_time.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (start_time.getText().equals("Start time in hh:mm")) {
                    start_time.setText("");
                    start_time.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (start_time.getText().isEmpty()) {
                    start_time.setForeground(Color.GRAY);
                    start_time.setText("Start time in hh:mm");
                }
            }
        });
        end_time.setForeground(Color.GRAY);
        end_time.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (end_time.getText().equals("End time in hh:mm")) {
                    end_time.setText("");
                    end_time.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (end_time.getText().isEmpty()) {
                    end_time.setForeground(Color.GRAY);
                    end_time.setText("End time in hh:mm");
                }
            }
        });
        seat.setForeground(Color.GRAY);
        seat.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (seat.getText().equals("No of seats")) {
                    seat.setText("");
                    seat.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (seat.getText().isEmpty()) {
                    seat.setForeground(Color.GRAY);
                    seat.setText("No of seats");
                }
            }
        });
        latitude.setForeground(Color.GRAY);
        latitude.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (latitude.getText().equals("Latitude")) {
                    latitude.setText("");
                    latitude.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (latitude.getText().isEmpty()) {
                    latitude.setForeground(Color.GRAY);
                    latitude.setText("Latitude");
                }
            }
        });
        longitude.setForeground(Color.GRAY);
        longitude.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (longitude.getText().equals("Longitude")) {
                    longitude.setText("");
                    longitude.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (longitude.getText().isEmpty()) {
                    longitude.setForeground(Color.GRAY);
                    longitude.setText("Longitude");
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

        modelNavigationBar1 = new SwingNAV.ModelNavigationBar();
        navigationBackgroundColor1 = new SwingNAV.NavigationBackgroundColor();
        navigationBackgroundColor2 = new SwingNAV.NavigationBackgroundColor();
        modelNavigationBar2 = new SwingNAV.ModelNavigationBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button1 = new swing.Button();
        seat = new swing.TextField();
        button3 = new swing.Button();
        camp_name = new swing.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staff_id = new swing.TextField();
        hp_number = new swing.TextField();
        email = new swing.TextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        street = new swing.TextField();
        city = new swing.TextField();
        pin_code = new swing.TextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        longitude = new swing.TextField();
        latitude = new swing.TextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        button4 = new swing.Button();
        jLabel188 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        start_time = new swing.TextField();
        jLabel5 = new javax.swing.JLabel();
        end_time = new swing.TextField();
        dob = new com.toedter.calendar.JDateChooser();
        l1 = new javax.swing.JLabel();
        dob1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        stt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1600, 900));

        jLabel1.setText("Start time");

        jLabel2.setText("Camp Name");

        jLabel3.setText("Last Date");

        jLabel6.setText("Seats");

        button1.setBackground(new java.awt.Color(255, 204, 204));
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Done");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        seat.setText("No of seats");
        seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatActionPerformed(evt);
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

        camp_name.setText("Camp Name");
        camp_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_nameActionPerformed(evt);
            }
        });

        jLabel7.setText("Help-Line Number");

        jLabel8.setText("Email");

        jLabel9.setText("Staff/Operator ID");

        staff_id.setText("ID");
        staff_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_idActionPerformed(evt);
            }
        });

        hp_number.setText("Number");
        hp_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hp_numberActionPerformed(evt);
            }
        });

        email.setText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel13.setText("Street");

        jLabel10.setText("City");

        jLabel11.setText("Pincode");

        street.setText("Street No");

        city.setText("City");

        pin_code.setText("Pincode");
        pin_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin_codeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Camp Details");

        jLabel14.setText("State");

        longitude.setText("Longitude");

        latitude.setText("Latitude");

        jLabel16.setText("Longitude");

        jLabel17.setText("Latitude");

        button4.setBackground(new java.awt.Color(255, 204, 204));
        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setText("Longitude and Latitude(Using Internet )");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel188.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel188.setText("Camp address Details");

        jLabel18.setText("Search");

        start_time.setText("Start time in hh:mm");
        start_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_timeActionPerformed(evt);
            }
        });

        jLabel5.setText("End time");

        end_time.setText("End time in hh:mm");
        end_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_timeActionPerformed(evt);
            }
        });

        dob.setBackground(new java.awt.Color(255, 255, 255));

        dob1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Start Date");

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
            .addGap(442, 442, 442)
            .addComponent(jLabel15)
            .addGap(451, 451, 451)
            .addComponent(jLabel188)
            .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(1648, Short.MAX_VALUE)
            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(end_time, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                .addComponent(dob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(hp_number, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(start_time, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                                    .addComponent(staff_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(camp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10))
                                .addComponent(jLabel11))
                            .addGap(43, 43, 43))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pin_code, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(street, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(longitude, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(latitude, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(seat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(695, 695, 695)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(585, 585, 585)
                .addComponent(l1)
                .addContainerGap(1226, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel188)
                        .addComponent(jLabel15))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(camp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGap(32, 32, 32)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hp_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel13)
                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(start_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(end_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pin_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addComponent(stt)))))
                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(l1)
                .addContainerGap(521, Short.MAX_VALUE)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        try {
            if (camp_name.getText().isEmpty() || camp_name.getText().equals("Camp Name")) {
                JOptionPane.showMessageDialog(this, "Please enter Camp Name!", "Camp Name", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (staff_id.getText().isEmpty() || staff_id.getText().equals("ID")) {
                JOptionPane.showMessageDialog(this, "Please enter the Staff ID!", "Staff ID", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(staff_id.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid Staff ID!", "Staff ID", JOptionPane.WARNING_MESSAGE);

                return;
            }
            if (hp_number.getText().startsWith("9") || hp_number.getText().startsWith("8") || hp_number.getText().startsWith("7") || hp_number.getText().startsWith("6")) {
            } else {
                JOptionPane.showMessageDialog(this, "Help-line number is wrong!", "Help-Line", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(hp_number.getText().substring(0, 5));
                int s2 = Integer.parseInt(hp_number.getText().substring(5, 10));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter valid help-line number!", "Help-Line", JOptionPane.WARNING_MESSAGE);
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

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

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
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String p_date = sdf.format(new Date());
                int s1 = Integer.parseInt(p_date.substring(0, 4));
                int s2 = Integer.parseInt(p_date.substring(5, 7));
                int s3 = Integer.parseInt(p_date.substring(8, 10));
                start_date = sdf.format(dob.getDate());
                end_date = sdf.format(dob1.getDate());
                int m1 = Integer.parseInt(start_date.substring(0, 4));
                int m2 = Integer.parseInt(start_date.substring(5, 7));
                int m3 = Integer.parseInt(start_date.substring(8, 10));
                int f1 = Integer.parseInt(start_date.substring(0, 4));
                int f2 = Integer.parseInt(start_date.substring(5, 7));
                int f3 = Integer.parseInt(start_date.substring(8, 10));

                if (m1 < s1 || m2 < s2 || m3 < s3) {
                    JOptionPane.showMessageDialog(this, "Date is invalid!", "Date", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (f1 < m1 || f2 < m2 || f3 < m3) {
                    JOptionPane.showMessageDialog(this, "End date can't be before start date!", "Date", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter date in yyyy-mm-dd Format!", "Date", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (start_time.getText().isEmpty() || start_time.getText().equals("Start time in hh:mm")) {
                JOptionPane.showMessageDialog(this, "Please enter start time!", "Time", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int th = Integer.parseInt(start_time.getText().substring(0, 2));
                int tm = Integer.parseInt(start_time.getText().substring(3, 5));
                if ((th >= 0 && th <= 23) && (tm >= 0 && tm <= 59)) {
                } else {

                    JOptionPane.showMessageDialog(this, "Time must be in 24 hrs format!", "Time", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Time must be in 24 hrs format!", "Time", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (end_time.getText().isEmpty() || end_time.getText().equals("End time in hh:mm")) {
                JOptionPane.showMessageDialog(this, "Please enter end time!", "Time", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int th = Integer.parseInt(end_time.getText().substring(0, 2));
                int tm = Integer.parseInt(end_time.getText().substring(3, 5));
                if ((th >= 0 && th <= 23) && (tm >= 0 && tm <= 59)) {
                } else {
                    JOptionPane.showMessageDialog(this, "Time must be in 24 hrs format!", "Time", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Time must be in 24 hrs format!", "Time", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (seat.getText().isEmpty() || seat.getText().equals("No of seats")) {
                JOptionPane.showMessageDialog(this, "Please enter no.of No of seats!", "Seats", JOptionPane.WARNING_MESSAGE);
                return;
            }
            try {
                int s = Integer.parseInt(seat.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter seats in numbers!", "Seats", JOptionPane.WARNING_MESSAGE);

                return;
            }
            if (latitude.getText().isEmpty() || latitude.getText().equals("Latitude")) {
                JOptionPane.showMessageDialog(this, "Please enter Latitude!", "Latitude", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (longitude.getText().isEmpty() || longitude.getText().equals("Longitude")) {
                JOptionPane.showMessageDialog(this, "Please enter Longitude!", "Longitude", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (street.getText().isEmpty() || street.getText().equals("Street No")) {
                JOptionPane.showMessageDialog(this, "Please enter street number!", "Street", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (city.getText().isEmpty() || city.getText().equals("City")) {
                JOptionPane.showMessageDialog(this, "Please enter City!", "City", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (pin_code.getText().isEmpty() || pin_code.getText().equals("Pincode")) {
                JOptionPane.showMessageDialog(this, "Please enter pincode!", "Pincode", JOptionPane.WARNING_MESSAGE);
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
            String e_camp_name = camp_name.getText();
            int e_staff_id = Integer.parseInt(staff_id.getText());
            String e_hp_number = hp_number.getText();
            String e_email = email.getText();
            String e_start_time = start_time.getText();
            String e_end_time = end_time.getText();
            int e_seat = Integer.parseInt(seat.getText());
            String e_latitude = latitude.getText();
            String e_longitude = longitude.getText();
            String e_street = street.getText();
            String e_city = city.getText();
            String e_pincode = pin_code.getText();
            int n_id = Integer.parseInt(f_id);
            try {
                String myUrl1 = "jdbc:mysql://db4free.net:3306/project?zeroDateTimeBehavior=CONVERT_TO_NULL";
                Class.forName("com.mysql.cj.jdbc.Driver");
                try ( Connection conn1 = DriverManager.getConnection(myUrl1, "rootze", "root1717")) {
                    String query = " insert into camp_table(ngo_id,camp_name,staff_id,phone,email,start_date,end_date,start_time,end_time,seats,latitude,longitude,street,city,pincode,state,status)"
                            + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStmt = conn1.prepareStatement(query);
                    preparedStmt.setInt(1, n_id);
                    preparedStmt.setString(2, e_camp_name);
                    preparedStmt.setInt(3, e_staff_id);
                    preparedStmt.setString(4, e_hp_number);
                    preparedStmt.setString(5, e_email);
                    preparedStmt.setString(6, start_date);
                    preparedStmt.setString(7, end_date);
                    preparedStmt.setString(8, e_start_time);
                    preparedStmt.setString(9, e_end_time);
                    preparedStmt.setInt(10, e_seat);
                    preparedStmt.setString(11, e_latitude);
                    preparedStmt.setString(12, e_longitude);
                    preparedStmt.setString(13, e_street);
                    preparedStmt.setString(14, e_city);
                    preparedStmt.setString(15, e_pincode);
                    preparedStmt.setString(16, state);
                    preparedStmt.setString(17, "Added");
                    preparedStmt.execute();

                }
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(this, e, "Camp", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Camp successfully established!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("NGO Add Camp");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        System.out.println(f_id);
        new ngo_camp_details(f_id).setVisible(true);
        dispose();

    }//GEN-LAST:event_button3ActionPerformed

    private void camp_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_nameActionPerformed

    private void staff_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_idActionPerformed

    private void hp_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hp_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hp_numberActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void pin_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin_codeActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(this, "Redirecting to Google Maps!", "Browser", JOptionPane.INFORMATION_MESSAGE);
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://maps.google.com/"));
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(this, "\"Connect with internet connection for get better results...\"", "Browser", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_button4ActionPerformed

    private void start_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_timeActionPerformed

    private void end_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end_timeActionPerformed

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
            java.util.logging.Logger.getLogger(ngo_add_camp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ngo_add_camp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ngo_add_camp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ngo_add_camp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String str = null;
                new ngo_add_camp(str).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private swing.Button button3;
    private swing.Button button4;
    private swing.TextField camp_name;
    private swing.TextField city;
    private com.toedter.calendar.JDateChooser dob;
    private com.toedter.calendar.JDateChooser dob1;
    private swing.TextField email;
    private swing.TextField end_time;
    private swing.TextField hp_number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel l1;
    private swing.TextField latitude;
    private swing.TextField longitude;
    private SwingNAV.ModelNavigationBar modelNavigationBar1;
    private SwingNAV.ModelNavigationBar modelNavigationBar2;
    private SwingNAV.NavigationBackgroundColor navigationBackgroundColor1;
    private SwingNAV.NavigationBackgroundColor navigationBackgroundColor2;
    private swing.TextField pin_code;
    private swing.TextField seat;
    private swing.TextField staff_id;
    private swing.TextField start_time;
    private swing.TextField street;
    private javax.swing.JComboBox<String> stt;
    // End of variables declaration//GEN-END:variables
    private String start_date;
    private String end_date;
    private String state;
}
