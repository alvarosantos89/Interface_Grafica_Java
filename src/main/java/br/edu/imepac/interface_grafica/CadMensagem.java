package br.edu.imepac.interface_grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadMensagem extends JFrame{
    private JLabel lbRemetente;
    private JTextField tfRemetente;
    private JLabel lbDestinatario;
    private JTextField tfDestinatario;
    private JLabel lbMensagem;
    private JTextField tfMensagem;
    private JButton btEnviar;
    private static CadMensagem frame;
    
    public CadMensagem(){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes(){
        setTitle("Envio de Mensagem");
        setBounds(0,0,500,400);
        setLayout(null);
        lbRemetente = new JLabel("Usuário:");
        tfRemetente = new JTextField(5);
        lbDestinatario = new JLabel("Destinatario");
        tfDestinatario = new JTextField(5);
        lbMensagem = new JLabel("Mensagem:");
        tfMensagem = new JTextField(5);
        btEnviar = new JButton("Enviar");
        lbRemetente.setBounds(30,30,80,25);
        tfRemetente.setBounds(100,30,120,25);
        lbDestinatario.setBounds(30,60,80,25);
        tfDestinatario.setBounds(100,60,120,25);
        lbMensagem.setBounds(30,90,80,25);
        tfMensagem.setBounds(100,90,240,50);
        btEnviar.setBounds(125,270,100,25);
        add(lbRemetente);
        add(tfRemetente);
        add(lbDestinatario);
        add(tfDestinatario);
        add(lbMensagem);
        add(tfMensagem);
        add(btEnviar);
    }
    
    private void definirEventos(){
        btEnviar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            //Comandos para enviar a mensagem
            }
        });
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame = new CadMensagem();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) /2);
                    frame.setVisible(true);            
            }
        });

    }
}