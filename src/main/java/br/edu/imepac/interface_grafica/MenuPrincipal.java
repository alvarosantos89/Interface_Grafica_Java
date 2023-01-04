package br.edu.imepac.interface_grafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame{
    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnCadUsuario, mnCadContato, mnCadMensagem;
    private JMenuItem miBUsuario, miBContato, miBMensagem;
    private static MenuPrincipal frame;
    
    public MenuPrincipal(){
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes(){
        setTitle("Menu Principal de Cadastro");
        setBounds(0,0,800,600);
        contentPane = getContentPane();
        mnBarra = new JMenuBar();
        mnCadUsuario = new JMenu("Usuário");
        mnCadUsuario.setMnemonic('U');
        mnCadContato = new JMenu("Contato");
        mnCadContato.setMnemonic('C');
        mnCadMensagem = new JMenu("Mensagem");
        mnCadMensagem.setMnemonic('M');
        miBUsuario = new JMenuItem("Cadastrar Usuário");
        miBContato = new JMenuItem("Cadastrar Contato");
        miBMensagem = new JMenuItem("Enviar Mensagem");
        mnCadUsuario.add(miBUsuario);
        mnCadContato.add(miBContato);
        mnCadMensagem.add(miBMensagem);
        mnBarra.add(mnCadUsuario);
        mnBarra.add(mnCadContato);
        mnBarra.add(mnCadMensagem);
        setJMenuBar(mnBarra);
    }
    
    private void definirEventos(){
        miBUsuario.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //codigo para chamada do CadUsuario
            }
        });
                
        miBContato.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //codigo para chamada do CadContato
            }
        });
                
        miBMensagem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //codigo para chamada do CadMensagem
            }
        });
    }
    
    public static void abrir(){
        MenuPrincipal frame = new MenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2,
                (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                frame = new MenuPrincipal();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2,
                        (tela.height - frame.getSize().height) /2);
                frame.setVisible(true);            
            }
        });

    }
    
}
