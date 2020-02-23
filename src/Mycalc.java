import org.w3c.dom.Text;
import java.awt.Color;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Mycalc {
    static int num1, num2;
    static char sign;

    public static void main(String[] args) {


        final String MSC = "Mahir Shahriar Calculator";
        JFrame mycalc = new JFrame(MSC);                  //create window
        mycalc.setLayout(null);                           // bujhi na
        mycalc.setSize(410, 661);          //window size
        mycalc.setVisible(true);
        //mycalc.setResizable(false);
        mycalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        final String MC = "MS Calculator";
        JLabel myname = new JLabel(MC);
        myname.setBounds(2, 2, 10, 10);
        myname.setSize(600, 50 );
        mycalc.add(myname);
        myname.setForeground(Color.blue);
        myname.setLayout(null);
        myname.setVisible(true);


        //monitor setup
        JTextField monitor = new JTextField();
        monitor.setBounds(2, 60, 392, 100);
        Font monitorFont = new Font("SansSerif",Font.BOLD, 36);
        monitor.setFont(monitorFont);
        mycalc.add(monitor);

        /*percentage setup
        JButton percentage = new JButton("%");
        percentage.setBounds(2, 132, 170, 110 );
        mycalc.add(percentage);
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText(x + "%");
            }
        }); */


        /*ce setup
        JButton CE = new JButton("CE");
        CE.setBounds(180, 250, 170, 110);
        mycalc.add(CE);
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                monitor.setText("");
            }
        });*/

        // c setup
        JButton C = new JButton("C");
        C.setBounds(2, 165, 95, 80);
        mycalc.add(C);
        // C.setBackground(Color.black);
        //b1.setContentAreaFilled(false);
        //b1.setOpaque(true);
        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText("");
            }
        });

        //backspace
        JButton back = new JButton();
        int backButtonHeight = back.getHeight();
        int backButtonWidth = back.getWidth();
        System.out.println(backButtonHeight + "\n" + backButtonHeight);

        try{
            Image bs = ImageIO.read(Mycalc.class.getResource("/res/bs.png"));

            back.setIcon(new ImageIcon(bs));
        } catch (Exception e){
            System.out.println(e.toString());
        }
        back.setBounds(100, 165, 195, 80);
        mycalc.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String monitorText = monitor.getText();
                int strLen = monitorText.length(); // returns the lenght of the string
                String newText = monitorText.substring(0,strLen-1); // creating a new string by deleting the last character
                monitor.setText(newText);

            }
        });



        //+
        JButton plus = new JButton("+");
        plus.setBounds(298, 444, 95, 95);
        mycalc.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                num1 = Integer.parseInt(x);
                monitor.setText("");
                sign = '+';
            }
        });


        //minus
        JButton minus = new JButton("-");
        minus.setBounds(298, 347, 95, 95);
        mycalc.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                num1 = Integer.parseInt(x);
                monitor.setText("");
                sign = '-';
            }
        });



        //*
        JButton into = new JButton("*");
        into.setBounds(298, 250, 95, 95);
        mycalc.add(into);
        into.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                num1 = Integer.parseInt(x);

                monitor.setText("");
                sign = '*';
            }
        });


        //devided
        JButton devide = new JButton("/");
        devide.setBounds(298, 165, 95, 80);
        mycalc.add(devide);
        devide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                num1 = Integer.parseInt(x);
                monitor.setText("");
                sign = '/';
            }
        });



        //=
        JButton equal = new JButton("=");
        equal.setBounds(298, 541, 95, 80);
        mycalc.add(equal);
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                num2 = Integer.parseInt(monitor.getText());
                int result=0;
                if (sign == '+') {
                    result = num1 + num2;
                }
                else if (sign == '-') {
                    result = num1 - num2;
                }
                else if (sign == '*'){
                    result = num1 * num2;
                }
                else if  (sign == '/'){
                    result = num1 / num2;
                }

                String res = result + "";
                monitor.setText(res);
            }
        });


        //0
        JButton zero = new JButton("0");
        zero.setBounds(100, 541, 195, 80);
        mycalc.add(zero);
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "0");
            }
        });


        //1
        JButton one = new JButton("1");
        one.setBounds(2, 444, 95, 95);
        mycalc.add(one);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "1");
            }
        });


        //2
        JButton two = new JButton("2");
        two.setBounds(100, 444, 95, 95);
        mycalc.add(two);
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "2");
            }
        });


        //3
        JButton three = new JButton("3");
        three.setBounds(198, 444, 97, 95);
        mycalc.add(three);
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "3");
            }
        });


        //4
        JButton four = new JButton("4");
        four.setBounds(2, 347, 95, 95);
        mycalc.add(four);
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "4");
            }
        });


        //5
        JButton five = new JButton("5");
        five.setBounds(100, 347, 95, 95);
        mycalc.add(five);
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "5");
            }
        });


        //6
        JButton six = new JButton("6");
        six.setBounds(198, 347, 97, 95);
        mycalc.add(six);
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "6");
            }
        });


        //7
        JButton seven = new JButton("7");
        seven.setBounds(2, 250, 95, 95);
        mycalc.add(seven);
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "7");
            }
        });


        //8
        JButton eight = new JButton("8");
        eight.setBounds(100, 250, 95, 95);
        mycalc.add(eight);
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + "8");
            }
        });


        //9
        JButton nine = new JButton("9");
        nine.setBounds(198, 250, 97, 95);
        mycalc.add(nine);
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText(x + "9");
            }
        });



        //.
        JButton dot = new JButton(".");
        dot.setBounds(2, 541, 95, 80);
        mycalc.add(dot);
        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String x = monitor.getText();
                monitor.setText( x + ".");
            }
        });


    }
}