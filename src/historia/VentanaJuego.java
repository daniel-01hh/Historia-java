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

public class VentanaJuego extends JFrame {
    public VentanaJuego(){
        super("Juego Historia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1200,650);
        setLocation(50, 50);
        ///dibujar el contenedor
        Container frame= getContentPane();
        frame.setLayout(new FlowLayout());

        Button bEntrar = new Button("Entrar al juego");
        bEntrar.setBounds(550, 500, 140, 30);
        bEntrar.setBackground(Color.GRAY);
        JLabel textoBienvenida= new JLabel("Bienvenido");
        textoBienvenida.setBackground(Color.blue);
        textoBienvenida.setBounds(550, 10, 100, 20);
        ImageIcon img= new ImageIcon("D:\\Descargas\\UV-Agosto19-Enero20\\uv-7\\interfaces de usuario avanzada\\ProyectoHistoria\\img\\historia.jpg");
        JLabel labelImage= new JLabel(img);
        labelImage.setBounds(300, 150, 300, 300);

        //codigo del boton
        bEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio nueva=  new Inicio();
                setVisible(false);
            }
        });



        setLayout(null);
        frame.add(bEntrar);
        frame.add(labelImage);
        frame.add(textoBienvenida);




    }









}

