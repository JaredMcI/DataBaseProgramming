import javax.swing.*;
import java.awt.*;

public class RegisterGUI {
    static JFrame Window, WindowB;
    static Font TitleFont = new Font ("Times New Roman", Font.PLAIN, 90);
    static Font ButtonFont = new Font("Timers New Roman", Font.PLAIN, 30);
    static Font StatFont = new Font("Times New Roman", Font.PLAIN, 15);
    static Container cont, contB;
    static JPanel TitlePanel, ButtonPanel;
    static JButton Register, Login;

    public static void CreateGUI() {

        Window = new JFrame();
        Window.setSize(800, 600);
        Window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Window.getContentPane().setBackground(Color.BLACK);
        Window.setLayout(null);
        Window.setVisible(true);
        cont = Window.getContentPane();

         TitlePanel = new JPanel();
         TitlePanel.setBounds(100,150,600,150);
         TitlePanel.setBackground(Color.BLACK);
         JLabel Title = new JLabel("FILMNATION");
         Title.setForeground(Color.RED);
         Title.setFont(TitleFont);
         TitlePanel.add(Title);

         cont.add(TitlePanel);

        ButtonPanel = new JPanel();
        ButtonPanel.setBounds(300,400,200,200);
        ButtonPanel.setBackground(Color.BLACK);

        Register = new JButton("REGISTER");
        Register.setBounds(0,0,200,20);
        Register.setBackground(Color.BLACK);
        Register.setBorderPainted(false);
        Register.setForeground(Color.RED);
        Register.setVisible(true);
        ButtonPanel.add(Register);

        Login = new JButton("LOGIN");
        Login.setBounds(0,20,200,20);
        Login.setBackground(Color.BLACK);
        Login.setBorderPainted(false);
        Login.setForeground(Color.RED);
        Login.setVisible(true);
        ButtonPanel.add(Login);

        //Register.addActionListener(TitleScreenHandler);

        cont.add(ButtonPanel);









    }


}

