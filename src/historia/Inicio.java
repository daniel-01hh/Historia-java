/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historia;

/**
 *
 * @author Daniel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Inicio extends JFrame {
    public static String[] preguntas= new String[10];
    private static int i=0;
    private  static  int time=6;


    public Inicio(){
        super("Historia de Mexico");
        preguntas[0]="¿quien fue el primer presidente de méxico?";
        preguntas[1]="¿quien descubrio america?";
        preguntas[2]="¿quien inicio la revolución?";
        preguntas[3]="¿Deidad del México antiguo conocida como la “Serpiente Emplumada”?";
        preguntas[4]="¿Cultura que se desarrolló en la ciudad de Palenque?";
        preguntas[5]="¿Las cabezas colosales son creaciones de la cultura?";
        preguntas[6]="¿En dónde se encuentran las pirámides del Sol y la Luna?";
        preguntas[7]="¿La base alimenticia de los pueblos mesoamericanos fue?";
        preguntas[8]="¿ Chichén Itzá fue una poderosa ciudad?";
        preguntas[9]="¿ Año en que los españoles conquistaron México Tenochtitlán?";
        setSize(1200,650);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //contenedor
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        /////////////////////////////////botones

        JButton bPreguntas= new JButton("Buscar pregunta");
        bPreguntas.setBounds(450,200,150,30);
        bPreguntas.setBackground(Color.white);

        JButton btnFalse= new JButton("FALSE");
        btnFalse.setBounds(50,30,150,30);
        btnFalse.setBackground(Color.white);

        JButton btnTrue= new JButton("TRUE.");
        btnTrue.setBounds(850,30,150,30);
        btnTrue.setBackground(Color.white);

        /////
        Label labelPreguntas= new Label("preguntas");
        labelPreguntas.setBounds(250,100,1000,55);
        labelPreguntas.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelPreguntas.setPreferredSize(new Dimension(250, 250));
        ///////////////////////////////////////////////////////////////////////////////77
        Label labelTiempo= new Label("00");
        labelTiempo.setBounds(450,280,500,55);
        labelTiempo.setFont(new Font("Verdana", Font.PLAIN, 25));
        labelTiempo.setPreferredSize(new Dimension(250, 250));
        //////////////////////////////////////////////////////////////////////////////////////////7
        bPreguntas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                time=6;
                int num= numAleatorio();
                String pregunta= preguntas[num];
                labelPreguntas.setText(pregunta);
                while(0<time) {
                    labelTiempo.setText(time + "s Restantes");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    time--;

                }
            }
        });



        setLayout(null);
        cp.add(labelPreguntas);
        cp.add(bPreguntas);
        cp.add(labelTiempo);
        cp.add(btnFalse);
        cp.add(btnTrue);




    }
    public static int numAleatorio(){
        //numeroo aleatorio
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAletorio = aleatorio.nextInt(9);
        return intAletorio;

    }


}
