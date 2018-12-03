

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGui {
    static JFrame Window, WindowB;
    static Font TitleFont = new Font ("Times New Roman", Font.PLAIN, 90);
    static Font ButtonFont = new Font("Timers New Roman", Font.PLAIN, 30);
    static Font StatFont = new Font("Times New Roman", Font.PLAIN, 15);
    static Container cont, contB;
    static JPanel TitlePanel, ButtonPanel, FormPanel;
    static JButton Register, Login;
    static RegisterHandler RegisterHandler = new RegisterHandler();
    static InsertHandler InsertHandler = new InsertHandler();
    static JTextField usernametxt,passwordtxt,emailtxt,DOBtxt, nametxt;


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

        Register.addActionListener(RegisterHandler);

        cont.add(ButtonPanel);

    }
    public static class RegisterHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            TitlePanel.setVisible(false);
            ButtonPanel.setVisible(false);

            FormPanel = new JPanel();
            FormPanel.setBounds(100,150,600,300);
            FormPanel.setBackground(Color.BLACK);


            JLabel username = new JLabel("username: ");
            username.setBounds(100,50,100,20);     ;
            JLabel password = new JLabel("password: ");
            password.setBounds(100,100,100,20);
            JLabel DOB = new JLabel("D/O/B: ");
            DOB.setBounds(100,150,100,20);
            JLabel Email = new JLabel("Email: ");
            Email.setBounds(100,200,100,20);
            JLabel Name = new JLabel("Email: ");
            Name.setBounds(100,250,100,20);

            username.setForeground(Color.RED);
            password.setForeground(Color.RED);
            DOB.setForeground(Color.RED);
            Email.setForeground(Color.RED);

            usernametxt = new JTextField();
            usernametxt.setBounds(210,50,100,20);
             passwordtxt = new JTextField();
            passwordtxt.setBounds(210,100,100,20);
             DOBtxt = new JTextField();
            DOBtxt.setBounds(210,150,100,20);
            emailtxt = new JTextField();
            emailtxt.setBounds(210,200,100,20);
            nametxt = new JTextField();
            nametxt.setBounds(210,250,100,20);


            FormPanel.add(username);
            FormPanel.add(usernametxt);
            FormPanel.add(password);
            FormPanel.add(passwordtxt);
            FormPanel.add(DOB);
            FormPanel.add(DOBtxt);
            FormPanel.add(Email);
            FormPanel.add(emailtxt);
            FormPanel.add(Name);
            FormPanel.add(nametxt);

            JButton Insert = new JButton("Register");
            Insert.setBounds(100,250,100,20);
            Insert.addActionListener(InsertHandler);
            FormPanel.add(Insert);


            FormPanel.setLayout(null);
            cont.add(FormPanel);



        }}

    public static class InsertHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //This is essentially a Session Factory instance
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

            //On Button Click, create an object using attributes from Text Boxes.

            Account account = new Account();
            account.setEmail(emailtxt.getText());
            account.setName("");
            account.setUsername(usernametxt.getText());
            account.setPassword(passwordtxt.getText());


            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            entityManager.persist(account);
            entityManager.getTransaction().commit();

            entityManagerFactory.close();

        }

        }


}

