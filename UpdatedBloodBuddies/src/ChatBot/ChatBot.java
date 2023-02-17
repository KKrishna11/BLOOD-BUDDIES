package ChatBot;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatBot extends JFrame implements ActionListener {

    static JTextArea area = new JTextArea();
    JTextField field = new JTextField();
    JScrollPane sp;
    JButton send;
    LocalTime time = LocalTime.now();
    LocalDate date = LocalDate.now();
    Random random = new Random();

    public ChatBot() {
        this.setSize(365, 580);
        this.setLocation(50, 50);
          Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\krishna\\Desktop\\KIIT\\UpdatedBloodBuddies\\src\\ALLMAINFILES\\blood-donation.png");
        setIconImage(icon);
                setTitle("Chat Bot");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0x123456));
        field = new JTextField();
        JButton send = new JButton("Enter");
        send.setBackground(new Color(0x12344));
        send.setForeground(Color.white);
        send.setBounds(245, 500, 90, 25);
        send.setFocusable(false);
        add(send);
        area.setEditable(false);
        area.setForeground(Color.white);
        area.setBackground(new Color(0x12344));
        add(area);
        sp = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(10, 20, 325, 470);
        add(sp);
        sp.setBackground(new Color(0x123456));
        sp.getVerticalScrollBar().setBackground(new Color(0x123456));
        sp.getHorizontalScrollBar().setBackground(new Color(0x123456));
        field.setSize(235, 25);
        field.setLocation(10, 500);
        field.setBackground(new Color(0x12344));
        field.setForeground(Color.white);
        add(field);
        send.addActionListener(this);
        getRootPane().setDefaultButton(send);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (field.getText().length() >= 1) {
                String message = field.getText().toLowerCase();
                area.append("You : " + field.getText() + "\n");
                field.setText("");

                if (message.contains("how are you")) {

                    int num = random.nextInt(3);
                    switch (num) {
                        case 0:
                            bot("I'm fine !,What about you ? ");
                            break;
                        case 1:
                            bot("I am good , thanks for asking !");
                            break;
                        default:
                            bot("I am great ,thanks for asking !");
                            break;
                    }

                } else if (message.contains("you") && (message.contains("smart") || message.contains("good"))) {
                    bot("Thank you !");
                } else if (message.contains("welcome")) {
                    bot("You are so polite.How can i help you ?");
                } else if (message.contains("hi") && message.charAt(0) == 'h' || message.contains("hello") || message.contains("hey")) {

                    int num = random.nextInt(3);
                    switch (num) {
                        case 0:
                            bot("Hii");
                            break;
                        case 1:
                            bot("Hello");
                            break;
                        case 2:
                            bot("Heyy");
                            break;
                        case 3:
                            bot("hello buddy");
                            break;
                        default:
                            break;
                    }
                } else if (message.contains("by")) {
                    bot("Byy,See you soon ..!");
                } else if (message.contains("i am good") || message.contains("i am great") || message.contains("i am ") && message.contains("fine")) {

                    bot("Good to hear.");
                } else if (message.contains("thank")) {
                    int num = random.nextInt(3);
                    switch (num) {
                        case 0:
                            bot("Welcome..");
                            break;
                        case 1:
                            bot("My plesure");
                            break;
                        case 2:
                            bot("Happy to help");
                            break;
                        case 3:
                            bot("That's why i'm here for..");
                            break;
                        default:
                            break;
                    }
                } else if (message.contains("what is your name") && message.contains("name")) {
                    if (message.contains("your")) {
                        bot("I'm Bot...");
                    }
                    if (message.contains("my")) {
                        bot("My name is Blood Buddies");
                    }
                } else if (message.contains("change")) {
                    bot("Sorry,I can't change anything...");
                } else if (message.contains("time")) {

                    String ctime = new String();
                    if (time.getHour() > 12) {
                        int hour = time.getHour() - 12;
                        ctime = ctime + hour + ":" + time.getMinute() + ":" + time.getSecond() + " PM";
                    } else {

                        ctime = ctime + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + " AM";
                    }
                    bot(ctime);

                } else if (message.contains("date") || message.contains("month") || message.contains("year") || message.contains("day")) {

                    String cdate = new String();
                    cdate = cdate + date.getDayOfWeek() + "," + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear();
                    bot(cdate);

                } else if (message.contains("good morning")) {

                    bot("Good morning,Have a nice day !");

                } else if (message.contains("good night")) {

                    bot("Good night,Have a nice dreams !");

                } else if (message.contains("good evening")) {

                    bot("Good Evening ...!");

                } else if (message.contains("good") && message.contains("noon")) {

                    bot("Good Afternoon ...!");

                } else if (message.contains("clear screen")) {
                    bot("wait a few second...");
                    area.setText("");
                } else {
                    try {
                        int response = JOptionPane.showConfirmDialog(null, "Result not available!Do you want to be redirected to browser?",
                                "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (response == JOptionPane.OK_OPTION) {
                            try {
                                java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://www.google.com/search?hl=en&q=" + message.replace(" ", "+") + "&btnG=Google+Search"));

                            } catch (IOException ee) {
                                bot("Connect with internet connection for get better results...");
                            }
                        }

                    } catch (HeadlessException eee) {
                        int num = random.nextInt(3);
                        switch (num) {
                            case 0:
                                bot("Sorry ,I can't understand you !");
                                break;
                            case 1:
                                bot("Sorry,I don't understand ");
                                break;
                            case 2:
                                bot("My apologies...I don't understand ");
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        } catch (Exception e1) {

        }
    }

    public static void bot(String message) {
        area.append("Bot : " + message + "\n");
    }

}
