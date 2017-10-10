package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Netho on 12/8/15.
 */
public class Exitapp extends JPanel {


    JButton exit=new JButton("Exit");
    JButton back=new JButton("Back to the Menu");



    public  Exitapp(){

        GridLayout or=new GridLayout(2,1);
        setBackground(Color.blue);
        setLayout(or);
        JPanel first=new JPanel(new BorderLayout());
        first.setBackground(Color.blue);
        JPanel second=new JPanel(new GridLayout(1,2));
        second.setBackground(Color.blue);

        JLabel sure=new JLabel("Are you sure that you want to Exit?");
        Font mediumsize=new Font("", Font.ROMAN_BASELINE,35);
        sure.setFont(mediumsize);
        JLabel space=new JLabel("                                        ");
        first.add(space,BorderLayout.WEST);
        first.add(sure,BorderLayout.CENTER);
        add(first);


        exit.setFont(mediumsize);
        back.setFont(mediumsize);

       second.add(back);
        second.add(exit);

        add(second);






    }


}
