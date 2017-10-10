package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

/**
 * Created by Netho on 12/8/15.
 */
public class Movies2 extends JPanel {

    JButton backtoMenu=new JButton("Back to the Menu");
    JButton next=new JButton("Back");

    public Movies2(){


        GridLayout or=new GridLayout(5,1);
        setLayout(or);

        film1();
        film2();
        film3();
        film4();


        JPanel buttonsCenter=new JPanel(new BorderLayout());
        ImageIcon logo=new ImageIcon("cinelogo.jpg");
        JLabel cinelogo=new JLabel(logo);
        buttonsCenter.add(cinelogo,BorderLayout.CENTER);
        buttonsCenter.setBackground(Color.white);

        JPanel buttons=new JPanel();
        buttons.setLayout(new BoxLayout(buttons,BoxLayout.LINE_AXIS));
        buttons.setBackground(Color.white);


        Font sise=new Font("",Font.ROMAN_BASELINE,20);
        backtoMenu.setFont(sise);

        next.setFont(sise);
        buttons.add(backtoMenu);
        buttons.add(next);

        buttonsCenter.add(buttons,BorderLayout.EAST);

        add(buttonsCenter);










    }


    public void film1(){

        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("Spy.png");
        JLabel movieicon=new JLabel(sicario);

        first.add(movieicon, BorderLayout.WEST);

        add(first);
        JButton trailer=new JButton("Trailer");
        Font sis=new Font("",Font.HANGING_BASELINE,15);
        trailer.setFont(sis);

        first.add(trailer, BorderLayout.EAST);

        trailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=mBBuzHrZBro"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"Bridge of Spies\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B (141min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("20:30");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);



        thirdCenter.add(showtime);
        thirdCenter.add(fun1);


        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);




    }


    public void film2(){
        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("Sons.png");
        JLabel movieicon=new JLabel(sicario);

        first.add(movieicon, BorderLayout.WEST);

        add(first);
        JButton trailer=new JButton("Trailer");
        Font sis=new Font("",Font.HANGING_BASELINE,15);
        trailer.setFont(sis);

        first.add(trailer, BorderLayout.EAST);

        trailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dH3NCjfr7n4"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"The Hallow\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B15 (97min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("19:10"+",");
        JLabel fun2=new JLabel("21:10");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);
        fun2.setFont(mediumSize);



        thirdCenter.add(showtime);
        thirdCenter.add(fun1);
        thirdCenter.add(fun2);


        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);





    }


    public void film3(){


        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("Grim.png");
        JLabel movieicon=new JLabel(sicario);

        first.add(movieicon, BorderLayout.WEST);

        add(first);
        JButton trailer=new JButton("Trailer");
        Font sis=new Font("",Font.HANGING_BASELINE,15);
        trailer.setFont(sis);

        first.add(trailer, BorderLayout.EAST);

        trailer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=oquZifON8Eg"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"Crimson Peak\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B15 (119min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("20:30"+",");
        JLabel fun2=new JLabel("22:30");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);
        fun2.setFont(mediumSize);


        thirdCenter.add(showtime);
        thirdCenter.add(fun1);
        thirdCenter.add(fun1);


        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);







    }


    public void film4(){


        JPanel first=new JPanel(new BorderLayout());


        first.setBackground(Color.white);
       add(first);





    }











}




