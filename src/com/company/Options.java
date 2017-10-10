package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Netho on 12/8/15.
 */
public class Options extends JPanel {

    JButton createOrder=new JButton("Create an Order");
    JButton films=new JButton("Films");
    JButton previousOrders=new JButton("Previous Orders");
    JButton quit=new JButton("Quit the Program");



    public Options(){

        GridLayout or=new GridLayout(4,1);
        setLayout(or);
        setBackground(Color.blue);

        Font fors=new Font("", Font.ROMAN_BASELINE,25);

        createOrder.setFont(fors);
        films.setFont(fors);
        previousOrders.setFont(fors);
        quit.setFont(fors);

        add(createOrder);
        add(films);
        add(previousOrders);
        add(quit);




    }

}
