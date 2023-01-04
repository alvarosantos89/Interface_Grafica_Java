package br.edu.imepac.interface_grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadContato extends JFrame{
    private JLabel lbUsuario;
    private JTextField tfUsuario;
    private JLabel lbNome;
    private JTextField tfNome;
    private JLabel lbEmail;
    private JTextField tfEmail;
    private JButton btCadastrar;
    private static CadContato frame;
    
    public CadContato(){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes(){
        setTitle("Cadastro de Contato");
        setBounds(0,0,500,400);
        setLayout(null);
        lbUsuario = new JLabel("Usuário:");
        tfUsuario = new JTextField(5);
        lbNome = new JLabel("Nome");
        tfNome = new JTextField(5);
        lbEmail = new JLabel("E-mail:");
        tfEmail = new JTextField(5);
        btCadastrar = new JButton("Cadastrar");
        lbUsuario.setBounds(30,30,80,25);
        tfUsuario.setBounds(100,30,120,25);
        lbNome.setBounds(30,60,80,25);
        tfNome.setBounds(100,60,120,25);
        lbEmail.setBounds(30,90,80,25);
        tfEmail.setBounds(100,90,120,25);
        btCadastrar.setBounds(125,120,100,25);
        add(lbUsuario);
        add(tfUsuario);
        add(lbNome);
        add(tfNome);
        add(lbEmail);
        add(tfEmail);
        add(btCadastrar);
    }
    
    private void definirEventos(){
        btCadastrar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            //Comandos para enviar o cadastro
            }
        });
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame = new CadContato();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) /2);
                    frame.setVisible(true);            
            }
        });

    }
}