package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Netho on 12/9/15.
 */
public class SubText extends JFrame {



    public SubText(){




        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);



        BorderLayout order= new BorderLayout();
        JEditorPane text=new JEditorPane();
        JScrollPane scroll=new JScrollPane(text);
        setLayout(order);






        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader (new SubPrincipal().memory);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            String str="";
            while((linea=br.readLine())!=null)
                //System.out.println(linea);
                str+=linea+"\n";
            text.setText(str);
            br.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }








        add(scroll, BorderLayout.CENTER);


        text.setEditable(false);




        setSize(800,600);











    }


}
