package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Netho on 12/10/15.
 */
public class Subprincipal6 extends JPanel {


    JButton acept=new JButton("Accept");
    JButton back=new JButton(" Back ");
    String tim1="19:10";
    String tim2="21:10";

    JRadioButton time1=new JRadioButton(tim1);
    JRadioButton time2=new JRadioButton(tim2);

    TextField pur1=new TextField(10);
    TextField pur2=new TextField(10);
    TextField pur3=new TextField(10);
    JPanel SubSubprincipal= new JPanel(new GridLayout(3,1));

    float totalNeto=0.0f;
    float totalNeto1=0.0f;
    float totalNeto2=0.0f;
    float totalNeto3=0.0f;
    String showtotal="";

    JButton backtoMenu=new JButton("Back to the Menu");
    File memory=new File("Memory.txt");







    public Subprincipal6(){


        GridLayout order=new GridLayout(4,1);
        setLayout(order);
        JPanel tarjeta1 = new JPanel(new FlowLayout());
        JPanel tarjeta2= new JPanel(new FlowLayout());
        JPanel tarjeta3= new JPanel(new FlowLayout());
        JPanel tarjeta4=new JPanel(new FlowLayout());

        setBackground(Color.blue);

        tarjeta1.setBackground(Color.white);
        tarjeta2.setBackground(Color.white);
        tarjeta3.setBackground(Color.white);
        tarjeta4.setBackground(Color.white);







        // start with the first card

        ImageIcon icon=new ImageIcon("Sons.png");
        JLabel pic1=new JLabel(icon);
        tarjeta1.add(pic1);

        // just space




        JLabel titulo=new JLabel("       \"The Hallow\"");
        Font ti=new Font("",Font.ROMAN_BASELINE,40);
        titulo.setFont(ti);
        tarjeta1.add(titulo);



        JLabel cla=new JLabel("        B15  (97min) ");
        Font cla1=new Font(" ",Font.BOLD,28);
        cla.setFont(cla1);
        tarjeta1.add(cla);

// Second  Card


        JLabel selestime=new JLabel("Select time :");
        Font  forma=new Font("", Font.ROMAN_BASELINE,30);
        selestime.setFont(forma);
        selestime.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));


        tarjeta2.add(selestime);
        tarjeta2.add(time1);
        tarjeta2.add(time2);



        //Third Card


        Font fuen=new Font(" ", Font.BOLD,20);
        acept.setFont(fuen);
        back.setFont(fuen);

        tarjeta3.add(back);
        tarjeta3.add(acept);


        //Fourth Card




        Font si=new Font(" ", Font.ROMAN_BASELINE,25);
        Font si2=new Font("",Font.ROMAN_BASELINE,15);
        JLabel age= new JLabel(" Ages 0-12 (40%): ");
        JLabel age2=new JLabel(" Ages 14-64 (Normal Price): ");
        JLabel age3=new JLabel(" Ages 65 and older(20%): ");

        age.setFont(si);
        age2.setFont(si);
        age3.setFont(si);

        pur1.setFont(si2);
        pur2.setFont(si2);
        pur3.setFont(si2);

        time1.setFont(si);
        time2.setFont(si);


        tarjeta4.add(age);
        tarjeta4.add(pur1);
        tarjeta4.add(age2);
        tarjeta4.add(pur2);
        tarjeta4.add(age3);
        tarjeta4.add(pur3);



        add(tarjeta1);
        add(tarjeta2);
        add(tarjeta4);
        add(tarjeta3);


        time1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(time1.isSelected()){
                    time2.setVisible(false);


                }
                else if(!time1.isSelected()){
                    time2.setVisible(true);

                }
            }
        });


        time2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(time2.isSelected()){
                    time1.setVisible(false);

                }
                else if(!time2.isSelected()){
                    time1.setVisible(true);

                }
            }
        });



        acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (time1.isSelected()) {


                    Date now = new Date();
                    SimpleDateFormat horario = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");

                    String fecha = horario.format(now);

                    JLabel fechita = new JLabel(fecha);


                    JPanel tar1 = new JPanel();
                    JPanel subtar1 = new JPanel(new FlowLayout());
                    tar1.setLayout(new BoxLayout(tar1, BoxLayout.Y_AXIS));
                    JPanel tar2 = new JPanel(new FlowLayout());
                    JPanel subtar3 = new JPanel(new FlowLayout());
                    JPanel tar3 = new JPanel();
                    tar3.setLayout(new BoxLayout(tar3, BoxLayout.Y_AXIS));


                    // First little panel


                    JLabel thank = new JLabel("---Thank you For Coming---");
                    JLabel thank2 = new JLabel("      We hope you enjoyed!! ");
                    Font size = new Font(" ", Font.ROMAN_BASELINE, 30);
                    Font size2 = new Font(" ", Font.BOLD, 15);
                    thank.setFont(size);
                    thank2.setFont(size2);


                    tar1.add(fechita);
                    tar1.add(thank);
                    tar1.add(thank2);


                    // Time section

                    JLabel titles = new JLabel(" Your Film is :  \"The Hallow\" ");
                    Font size3 = new Font(" ", Font.ROMAN_BASELINE, 20);
                    titles.setFont(size3);


                    JLabel timess = new JLabel("\n*** Movie Time : ");
                    JLabel t1 = new JLabel(tim1 + "***");
                    t1.setFont(size3);

                    timess.setFont(size3);
                    tar2.add(titles);
                    tar2.add(timess);
                    tar2.add(t1);

                    subtar1.add(tar1);
                    SubSubprincipal.add(subtar1);
                    SubSubprincipal.add(tar2);

                    if (pur1.getText().length() != 0) {


                        String dato1 = pur1.getText();
                        String qty = dato1;
                        float num = Float.parseFloat(dato1);

                        float total = 0.0f;

                        total = (num * 15) - ((num * 15) * .40f);
                        totalNeto1 = total;


                        dato1 = Float.toString(total);

                        JLabel purchasing = new JLabel("Qty:" + qty + ":" + "You got 40% infant Discount!! \t :$" + dato1);

                        purchasing.setFont(size3);
                        tar3.add(purchasing);


                    }

                    if (pur2.getText().length() != 0) {

                        String dato2 = pur2.getText();
                        String qty = dato2;
                        float num2 = Float.parseFloat(dato2);
                        float total2 = 0.00f;

                        total2 = (num2 * 15);
                        totalNeto2 = total2;

                        dato2 = Float.toString(total2);

                        JLabel purchasing2 = new JLabel("Qty:" + qty + ":" + "Normal Price              \t         :$" + dato2);
                        purchasing2.setFont(size3);
                        tar3.add(purchasing2);

                    }

                    if (pur3.getText().length() != 0) {


                        String dato3 = pur3.getText();
                        String qty = dato3;
                        float num3 = Float.parseFloat(dato3);
                        float total3 = 0.0f;

                        total3 = (num3 * 15) - ((num3 * 15) * .20f);
                        totalNeto3 = total3;
                        dato3 = Float.toString(total3);

                        JLabel purchasing3 = new JLabel("Qty:" + qty + ":" + "Elderly Discount %20 !     \t    :$" + dato3);
                        purchasing3.setFont(size3);
                        tar3.add(purchasing3);


                    }

                    totalNeto = totalNeto1 + totalNeto2 + totalNeto3;
                    showtotal = Float.toString(totalNeto);
                    JLabel showsum = new JLabel("****** Total to pay: ***** : $" + showtotal);
                    showsum.setFont(size3);
                    backtoMenu.setFont(size3);


                    tar3.add(showsum);
                    tar3.add(backtoMenu);
                    subtar3.add(tar3);
                    SubSubprincipal.add(subtar3);


                    try {


                        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(memory, true), "UTF8"));


                        out.append("==================================================\n");
                        out.append("  Welcome to Cinepolis    \n ");
                        out.append("==================================================\n");
                        out.write(" your Movie is :" + "\"The Hallow\"\n");
                        out.write("Your showTime is :" + tim1 + "\n");
                        out.write("==================================================\n");
                        out.write("    your order is :\n");
                        if (pur1.getText().length() != 0) {


                            String dato1 = pur1.getText();
                            String qty = dato1;
                            float num = Float.parseFloat(dato1);

                            float total = 0.0f;

                            total = (num * 15) - ((num * 15) * .40f);
                            totalNeto1 = total;


                            dato1 = Float.toString(total);

                            String buying = "Qty:" + qty + ":" + "You got 40% infant Discount!!  :$" + dato1;
                            out.write(buying + "\n");


                        }

                        if (pur2.getText().length() != 0) {

                            String dato2 = pur2.getText();
                            String qty = dato2;
                            float num2 = Float.parseFloat(dato2);
                            float total2 = 0.00f;

                            total2 = (num2 * 15);
                            totalNeto2 = total2;

                            dato2 = Float.toString(total2);

                            String buying = "Qty:" + qty + ":" + "Normal Price          :$" + dato2;
                            out.write(buying + "\n");


                        }

                        if (pur3.getText().length() != 0) {


                            String dato3 = pur3.getText();
                            String qty = dato3;
                            float num3 = Float.parseFloat(dato3);
                            float total3 = 0.0f;

                            total3 = (num3 * 15) - ((num3 * 15) * .20f);
                            totalNeto3 = total3;
                            dato3 = Float.toString(total3);

                            String buying = "Qty:" + qty + ":" + "Elderly Discount %20 !     :$" + dato3;
                            out.write(buying + "\n");


                        }

                        out.write("===============================================\n");
                        out.write("****** Total to pay: ***** : $" + showtotal + "\n");
                        out.write("===============================================\n");
                        out.write(fecha + "\n");
                        out.write("**********************************************\n");
                        out.write("                                                \n");
                        out.write("\n");

                        out.close();


                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }


                }

                if (time2.isSelected()) {

                    Date now = new Date();
                    SimpleDateFormat horario = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");

                    String fecha = horario.format(now);

                    JLabel fechita = new JLabel(fecha);

                    JPanel tar1 = new JPanel();
                    JPanel subtar1 = new JPanel(new FlowLayout());
                    tar1.setLayout(new BoxLayout(tar1, BoxLayout.Y_AXIS));
                    JPanel tar2 = new JPanel(new FlowLayout());
                    JPanel subtar3 = new JPanel(new FlowLayout());
                    JPanel tar3 = new JPanel();
                    tar3.setLayout(new BoxLayout(tar3, BoxLayout.Y_AXIS));


                    // First little panel


                    JLabel thank = new JLabel("---Thank you For Coming---");
                    JLabel thank2 = new JLabel("    We hope you enjoyed ");
                    Font size = new Font(" ", Font.ROMAN_BASELINE, 30);
                    Font size2 = new Font(" ", Font.BOLD, 15);
                    thank.setFont(size);
                    thank2.setFont(size2);

                    tar1.add(fechita);
                    tar1.add(thank);
                    tar1.add(thank2);


                    // Time section

                    JLabel titles = new JLabel(" Your Film is :  \"The Hallow\" ");
                    Font size3 = new Font(" ", Font.ROMAN_BASELINE, 20);
                    titles.setFont(size3);


                    JLabel timess = new JLabel("\n*** Movie Time : ");
                    JLabel t2 = new JLabel(tim2 + "***");
                    t2.setFont(size3);

                    timess.setFont(size3);
                    tar2.add(titles);
                    tar2.add(timess);
                    tar2.add(t2);
                    tar1.setFont(size3);
                    subtar1.add(tar1);
                    SubSubprincipal.add(subtar1);
                    SubSubprincipal.add(tar2);

                    if (pur1.getText().length() != 0) {


                        String dato1 = pur1.getText();
                        String qty = dato1;

                        float num = Float.parseFloat(dato1);

                        float total = 0.0f;

                        total = (num * 15) - ((num * 15) * .40f);

                        totalNeto1 = total;

                        dato1 = Float.toString(total);

                        JLabel purchasing = new JLabel("Qty:" + qty + ":" + "You got 40% infant Discount!! :$" + dato1);
                        purchasing.setFont(size3);
                        tar3.add(purchasing);


                    }

                    if (pur2.getText().length() != 0) {

                        String dato2 = pur2.getText();
                        String qty = dato2;
                        float num2 = Float.parseFloat(dato2);
                        float total2 = 0.0f;

                        total2 = (num2 * 15);
                        totalNeto2 = total2;

                        dato2 = Float.toString(total2);

                        JLabel purchasing2 = new JLabel("Qty:" + qty + ":" + "Normal Price                   :$" + dato2);
                        purchasing2.setFont(size3);
                        tar3.add(purchasing2);

                    }

                    if (pur3.getText().length() != 0) {


                        String dato3 = pur3.getText();
                        String qty = dato3;
                        float num3 = Float.parseFloat(dato3);
                        float total3 = 0.0f;

                        total3 = (num3 * 15) - ((num3 * 15) * .20f);
                        totalNeto3 = total3;
                        dato3 = Float.toString(total3);

                        JLabel purchasing3 = new JLabel("Qty:" + qty + ":" + "Elderly Discount  %20!         :$" + dato3);
                        purchasing3.setFont(size3);
                        tar3.add(purchasing3);


                    }


                    totalNeto = totalNeto1 + totalNeto2 + totalNeto3;
                    showtotal = Float.toString(totalNeto);
                    JLabel showsum = new JLabel("      ****** Total to pay : ***** : $" + showtotal);
                    showsum.setFont(size3);
                    backtoMenu.setFont(size3);


                    tar3.add(showsum);
                    tar3.add(backtoMenu);
                    subtar3.add(tar3);
                    SubSubprincipal.add(subtar3);

                    try {


                        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(memory, true), "UTF8"));

                        PrintWriter wr = new PrintWriter(out);

                        wr.append("==================================================\n");
                        wr.append("  Welcome to Cinepolis    \n ");
                        wr.append("==================================================\n");
                        wr.write(" your Movie is :" + "\"The Hallow\"\n");
                        wr.write("Your showTime is :" + tim2 + "\n");
                        wr.write("==================================================\n");
                        wr.write("    your order is :\n");
                        if (pur1.getText().length() != 0) {


                            String dato1 = pur1.getText();
                            String qty = dato1;
                            float num = Float.parseFloat(dato1);

                            float total = 0.0f;

                            total = (num * 15) - ((num * 15) * .40f);
                            totalNeto1 = total;


                            dato1 = Float.toString(total);

                            String buying = "Qty:" + qty + ":" + "You got 40% infant Discount!!  :$" + dato1;
                            wr.write(buying + "\n");


                        }

                        if (pur2.getText().length() != 0) {

                            String dato2 = pur2.getText();
                            String qty = dato2;
                            float num2 = Float.parseFloat(dato2);
                            float total2 = 0.00f;

                            total2 = (num2 * 15);
                            totalNeto2 = total2;

                            dato2 = Float.toString(total2);

                            String buying = "Qty:" + qty + ":" + "Normal Price          :$" + dato2;
                            wr.write(buying + "\n");


                        }

                        if (pur3.getText().length() != 0) {


                            String dato3 = pur3.getText();
                            String qty = dato3;
                            float num3 = Float.parseFloat(dato3);
                            float total3 = 0.0f;

                            total3 = (num3 * 15) - ((num3 * 15) * .20f);
                            totalNeto3 = total3;
                            dato3 = Float.toString(total3);

                            String buying = "Qty:" + qty + ":" + "Elderly Discount %20 !     :$" + dato3;
                            wr.write(buying + "\n");


                        }

                        wr.write("===============================================\n");
                        wr.write("****** Total to pay: ***** : $" + showtotal + "\n");
                        wr.write("===============================================\n");
                        wr.write(fecha + "\n");
                        wr.write("**********************************************\n");
                        wr.write("                                                \n");
                        wr.write("\n");

                        wr.close();


                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }


                }

            }

            });





        pur1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                if(!Character.isDigit(e.getKeyChar()) && !Character.isISOControl(e.getKeyChar())){

                    JOptionPane.showMessageDialog(null,"Introduce  a number!!");
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();

                }



            }

            @Override
            public void keyPressed(KeyEvent e) {



            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });



        pur2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                if(!Character.isDigit(e.getKeyChar()) && !Character.isISOControl(e.getKeyChar())){

                    JOptionPane.showMessageDialog(null,"Introduce  a number!!");
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();

                }



            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });




        pur3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) && !Character.isISOControl(e.getKeyChar())) {


                    ImageIcon exclama = new ImageIcon("exclamation.gif");
                    JLabel data = new JLabel(exclama);
                    JOptionPane.showMessageDialog(null, "Introduce a number !!");
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();

                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });











    }

}












