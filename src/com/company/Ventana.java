package  com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Ventana extends JFrame{





    public Ventana(){

        super("Cinepolis Beta Edition!");

        CardLayout cl=new CardLayout(10,10);
        JPanel principal=new JPanel(cl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Welcome welcome=new Welcome();
        SubPrincipal sub=new SubPrincipal();
        Options option=new Options();
        Movies films=new Movies();
        Movies2 films2=new Movies2();
        Exitapp exit=new Exitapp();
        Purshasing tickets=new Purshasing();
        Purshasing2 tickets2=new Purshasing2();
        SubPrincipal2 sub2=new SubPrincipal2();
        SubPrincipal3 sub3=new SubPrincipal3();
        SubPrincipal4 sub4=new SubPrincipal4();
        SubPrincipal5 sub5=new SubPrincipal5();
        Subprincipal6 sub6=new Subprincipal6();
        SubPrincipal7 sub7=new SubPrincipal7();





        principal.add("1",welcome);
        principal.add("2",option);
        principal.add("3",films);
        principal.add("4",films2);
        principal.add("5",sub);
        principal.add("6",sub.SubSubprincipal);
        principal.add("7",exit);
        principal.add("8",tickets);
        principal.add("9",tickets2);
        principal.add("10",sub2);
        principal.add("11",sub2.SubSubprincipal);
        principal.add("12",sub3);
        principal.add("13",sub3.SubSubprincipal);
        principal.add("14",sub4);
        principal.add("15",sub4.SubSubprincipal);
        principal.add("16",sub5);
        principal.add("17",sub5.SubSubprincipal);
        principal.add("18",sub6);
        principal.add("19",sub6.SubSubprincipal);
        principal.add("20",sub7);
        principal.add("21",sub7.SubSubprincipal);
















        add(principal);







        setSize(1500, 1600);
        setVisible(true);
        setLocationRelativeTo(null);




        welcome.start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });




        option.films.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"3");
            }
        });


        films.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });

        films.next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"4");
            }
        });

        films2.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });

        films2.next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"3");
            }
        });


        option.quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"7");
            }
        });


        exit.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });

        exit.exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);


            }
        });



        option.createOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });


        tickets.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });


        tickets.next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"9");
            }
        });


        tickets2.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"2");
            }
        });

        tickets2.next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });


        tickets.order1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"5");


            }
        });


        sub.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });

        sub.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"6");
            }
        });


        sub.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"2");


                sub.time1.setSelected(false);
                sub.time2.setSelected(false);
                sub.time3.setSelected(false);

                sub.time1.setVisible(true);
                sub.time2.setVisible(true);
                sub.time3.setVisible(true);

                sub.pur1.setText("");
                sub.pur2.setText("");
                sub.pur3.setText("");

                sub.SubSubprincipal.removeAll();
                sub.totalNeto=0.0f;
                sub.totalNeto1=0.0f;
                sub.totalNeto2=0.0f;
                sub.totalNeto3=0.0f;






                


            }
        });


        option.previousOrders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              new SubText().setVisible(true);
            }
        });


        tickets.order2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"10");
            }
        });

        sub2.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"8");
            }
        });



        sub2.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"11");
            }
        });


        sub2.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"2");


                sub2.time1.setSelected(false);
                sub2.time2.setSelected(false);
                sub2.time3.setSelected(false);


                sub2.time1.setVisible(true);
                sub2.time2.setVisible(true);
                sub2.time3.setVisible(true);


                sub2.pur1.setText("");
                sub2.pur2.setText("");
                sub2.pur3.setText("");

                sub2.SubSubprincipal.removeAll();
                sub2.totalNeto=0.0f;
                sub2.totalNeto1=0.0f;
                sub2.totalNeto2=0.0f;
                sub2.totalNeto3=0.0f;

            }
        });


        sub3.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"13");

            }
        });


        sub3.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });


        sub3.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"2");


                sub3.time1.setSelected(true);



                sub3.time1.setVisible(true);



                sub3.pur1.setText("");
                sub3.pur2.setText("");
                sub3.pur3.setText("");

                sub3.SubSubprincipal.removeAll();
                sub3.totalNeto=0.0f;
                sub3.totalNeto1=0.0f;
                sub3.totalNeto2=0.0f;
                sub3.totalNeto3=0.0f;

            }
        });

        tickets.order3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"12");

            }
        });

        sub4.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });


        sub4.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"15");

            }
        });


        sub4.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"2");


                sub4.time1.setSelected(false);
                sub4.time2.setSelected(false);
                sub4.time3.setSelected(false);


                sub4.time1.setVisible(true);
                sub4.time2.setVisible(true);
                sub4.time3.setVisible(true);


                sub4.pur1.setText("");
                sub4.pur2.setText("");
                sub4.pur3.setText("");

                sub4.SubSubprincipal.removeAll();
                sub4.totalNeto=0.0f;
                sub4.totalNeto1=0.0f;
                sub4.totalNeto2=0.0f;
                sub4.totalNeto3=0.0f;

            }
        });

        tickets.order4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"14");

            }
        });

        sub5.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"8");
            }
        });

        sub5.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"17");
            }
        });



        sub5.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"2");


                sub5.time1.setSelected(true);



                sub5.time1.setVisible(true);



                sub5.pur1.setText("");
                sub5.pur2.setText("");
                sub5.pur3.setText("");

                sub5.SubSubprincipal.removeAll();
                sub5.totalNeto=0.0f;
                sub5.totalNeto1=0.0f;
                sub5.totalNeto2=0.0f;
                sub5.totalNeto3=0.0f;

            }
        });


        tickets2.order5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"16");
            }
        });

        sub6.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"8");
            }
        });

        sub6.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(principal,"19");
            }
        });

        sub6.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                cl.show(principal,"2");


                sub6.time1.setSelected(false);
                sub6.time2.setSelected(false);



                sub6.time1.setVisible(true);
                sub6.time2.setVisible(true);



                sub6.pur1.setText("");
                sub6.pur2.setText("");
                sub6.pur3.setText("");

                sub6.SubSubprincipal.removeAll();
                sub6.totalNeto=0.0f;
                sub6.totalNeto1=0.0f;
                sub6.totalNeto2=0.0f;
                sub6.totalNeto3=0.0f;


            }
        });


        tickets2.order6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"18");
            }
        });

        sub7.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"8");
            }
        });

        sub7.acept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"21");

            }
        });


        sub7.backtoMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"2");


                sub7.time1.setSelected(true);



                sub7.time1.setVisible(true);



                sub7.pur1.setText("");
                sub7.pur2.setText("");
                sub7.pur3.setText("");

                sub7.SubSubprincipal.removeAll();
                sub7.totalNeto=0.0f;
                sub7.totalNeto1=0.0f;
                sub7.totalNeto2=0.0f;
                sub7.totalNeto3=0.0f;

            }
        });



        tickets2.order7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cl.show(principal,"20");
            }
        });




























    }



        }


