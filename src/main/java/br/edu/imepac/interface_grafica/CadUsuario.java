package br.edu.imepac.interface_grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadUsuario extends JFrame{
    private JLabel lbUsuario;
    private JTextField tfUsuario;
    private JLabel lbSenha;
    private JPasswordField pfSenha;
    private JButton btCadastrar;
    private static CadUsuario frame;
    
    public CadUsuario(){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes(){
        setTitle("Cadastro de Usuário");
        setBounds(0,0,250,200);
        setLayout(null);
        tfUsuario = new JTextField(5);
        pfSenha = new JPasswordField(5);
        lbUsuario = new JLabel("Usuário:");
        lbSenha = new JLabel("Senha");
        btCadastrar = new JButton("Cadastrar");
        lbUsuario.setBounds(30,30,80,25);
        tfUsuario.setBounds(100,30,120,25);
        lbSenha.setBounds(30,75,120,25);
        pfSenha.setBounds(100,75,80,25);
        btCadastrar.setBounds(125,120,100,25);
        add(lbUsuario);
        add(tfUsuario);
        add(lbSenha);
        add(pfSenha);
        add(btCadastrar);
    }
    
    private void definirEventos(){
        btCadastrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //Envio de dados para cadatro
            }
        });
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            frame = new CadUsuario();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation((tela.width - frame.getSize().width) / 2,
                    (tela.height - frame.getSize().height) /2);
            frame.setVisible(true);
        });

    }
        
}