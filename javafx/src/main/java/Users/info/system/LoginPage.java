package Users.info.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton logButton=new JButton("Login");
    JTextField userNameField=new JTextField();
    JPasswordField userPasswordField=new JPasswordField();
    JTextField userEmailField=new JTextField();
    JTextField userphonomField=new JTextField();
    JLabel uNameLabel=new JLabel("Name");
    JLabel uPasswordLabel=new JLabel("Password");
    JLabel uEmailLabel=new JLabel("Email");
    JLabel uPhonomLabel=new JLabel("Phone Number");
    JLabel uTypeLabel=new JLabel("Major");
    JRadioButton uvisitorRadio=new JRadioButton("visitor");
    JRadioButton uAdminRadio=new JRadioButton("Admin");
    JRadioButton uInstructorRadio=new JRadioButton("Istructor");
    List<Users> users=new ArrayList<>();
    public LoginPage(){
       // this.logininfo=logininfo;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setVisible(true);
        uNameLabel.setBounds(150,200,75,25);
        uEmailLabel.setBounds(150,255,75,25);
        uPasswordLabel.setBounds(150,300,75,25);
        uPhonomLabel.setBounds(150,350,100,25);
        userNameField.setBounds(150,225,200,30);
        userEmailField.setBounds(150,275,200,30);
        userPasswordField.setBounds(150,325,200,30);
        userphonomField.setBounds(150,375,200,30);
        logButton.setBounds(270,410,80,25);
        uTypeLabel.setBounds(150,430,80,25);
        uvisitorRadio.setBounds(150,450,75,40);
        uAdminRadio.setBounds(150,480,75,40);
        uInstructorRadio.setBounds(150,520,75,40);
        frame.add(uTypeLabel);
        frame.add(uAdminRadio);
        frame.add(uInstructorRadio);
        frame.add(uvisitorRadio);
         frame.add(uNameLabel);
         frame.add(uEmailLabel);
         frame.add(uPasswordLabel);
         frame.add(uPhonomLabel);
         frame.add(userNameField);
        frame.add(userEmailField);
        frame.add(userphonomField);
        frame.add(userPasswordField);
        frame.add(logButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logButton){
            String userName=userNameField.getText();
            String userEmail=userEmailField.getText();
            String userPhono=userphonomField.getText();
            String userPassword=userPasswordField.getText();
            //users.add();
        }

    }
}
