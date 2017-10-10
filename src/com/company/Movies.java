package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

/**
 * Created by Netho on 12/8/15.
 */
public class Movies extends JPanel {

    JButton backtoMenu=new JButton("Back to the Menu");
    JButton next=new JButton("Next");


    public Movies(){


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


        ImageIcon sicario=new ImageIcon("Sicario.png");
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
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=sR0SDT2GeFg"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"Sicario\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B15 (122min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel(new SubPrincipal().tim1+",");
        JLabel fun2=new JLabel(new SubPrincipal().tim2+",");
        JLabel fun3=new JLabel(new SubPrincipal().tim3);

        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);
        fun2.setFont(mediumSize);
        fun3.setFont(mediumSize);


        thirdCenter.add(showtime);
        thirdCenter.add(fun1);
        thirdCenter.add(fun2);
        thirdCenter.add(fun3);

        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);




    }


    public void film2(){
        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("007.png");
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
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=7GqClqvlObY"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"Spectre 007\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B (148min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("18:50"+",");
        JLabel fun2=new JLabel("20:45"+",");
        JLabel fun3=new JLabel("21:45");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);
        fun2.setFont(mediumSize);
        fun3.setFont(mediumSize);




        thirdCenter.add(showtime);
        thirdCenter.add(fun1);
        thirdCenter.add(fun2);
        thirdCenter.add(fun3);



        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);





    }


    public void film3(){


        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("ActividadPara.png");
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
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Y9Jy2T0uQ9Y"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"Paranormal Activity (The Ghost Dimension)\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B15 (88min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("22:30");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);


        thirdCenter.add(showtime);
        thirdCenter.add(fun1);


        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);







    }


    public void film4(){


        JPanel first=new JPanel(new BorderLayout());


        ImageIcon sicario=new ImageIcon("thelast.png");
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
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=xsuG2JUgs_8"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar la página");
                }

            }
        });


        JPanel firstCenter=new JPanel(new GridLayout(2,1));
        firstCenter.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        JPanel secondCEnter=new JPanel(new FlowLayout());
        JPanel thirdCenter=new JPanel(new FlowLayout());

        JLabel moviesTitle= new JLabel(" \"The last Witch Hunter\"");
        Font sizeJumbo=new Font("", Font.ROMAN_BASELINE,30);
        Font sizeSmall=new Font(" ", Font.ROMAN_BASELINE,12);
        JLabel clasification=new JLabel("      B (107min)");
        moviesTitle.setFont(sizeJumbo);
        clasification.setFont(sizeSmall);

        secondCEnter.add(moviesTitle);
        secondCEnter.add(clasification);

        firstCenter.add(secondCEnter);

        JLabel showtime=new JLabel("ShowTimes :");
        JLabel fun1=new JLabel("18:50"+",");
        JLabel fun2=new JLabel("21:00"+",");
        JLabel fun3=new JLabel("22:20"+",");


        Font mediumSize=new Font(" ",Font.ROMAN_BASELINE,15);
        showtime.setFont(mediumSize);
        fun1.setFont(mediumSize);
        fun2.setFont(mediumSize);
        fun3.setFont(mediumSize);


        thirdCenter.add(showtime);
        thirdCenter.add(fun1);
        thirdCenter.add(fun2);
        thirdCenter.add(fun3);


        firstCenter.add(thirdCenter);



        first.add(firstCenter,BorderLayout.CENTER);







    }











}
