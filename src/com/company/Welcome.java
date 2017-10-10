package com.company;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by Netho on 12/8/15.
 */
public class Welcome extends JPanel {

    JButton start=new JButton("Welcome");


    public Welcome() {
        ImageIcon cine = new ImageIcon("cine.png");
        JLabel cinepo = new JLabel(cine);
        setBackground(Color.blue);
        cinepo.setBorder(BorderFactory.createLineBorder(Color.blue));
        BorderLayout order=new BorderLayout();
        setLayout(order);

        JPanel buttons=new JPanel();
        buttons.setBackground(Color.blue);
        buttons.setLayout(new FlowLayout());
        Font sizes=new Font("", Font.ROMAN_BASELINE,35);
        start.setFont(sizes);

        buttons.add(start);


        add(buttons, BorderLayout.SOUTH);
        add(cinepo);


        String click="Click to start !!";
        start.setToolTipText(click);
    }


}
