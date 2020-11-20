package com.week10;

import javax.swing.*;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class LoginFrame {
    private JPanel mainPanel;
    private JPanel TopPanel;
    private JPanel LeftPanel;
    private JPanel RightPanel;
    private JPanel ButtonPanel;
    private JPanel CenterPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton LoginButton;
    private JPanel loginpanel;
    private JPanel logopanel;
    private JPasswordField passwordField1;


    //public  LoginFrame(){
    //    init();
    //    initTOPPanel();
    //
    //
    //}


    //private  void initTOPPanel(){
    //    TopPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
    //    JButton jButton1=new JButton("测试按钮");
    //    JButton jButton2=new JButton("测试按钮");
    //    jButton1.setBackground(Color.DARK_GRAY);
    //    jButton1.setOpaque(true);
    //    jButton1.setBorderPainted(false);
    //    TopPanel.add(jButton1);
    //    TopPanel.add(jbutton2);
    //
    //}

    public LoginFrame() {
        LoginButton.addActionListener(e -> {
            if ("cly".equals(textField1.getText()) && "123456".equals(passwordField1.getText())) {
                JOptionPane.showMessageDialog(null, "登陆成功");
            } else {
                JOptionPane.showMessageDialog(null, "账号或者密码错误！");
            }

        });
    }

    //public static void main(String[] args) {
    //    JFrame frame = new JFrame("LoginFrame");
    //    frame.setContentPane(new LoginFrame().mainPanel);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //    //frame.setMaximumSize();
    //    //frame.setSize(800,600);
    //    //frame.setLocationRelativeTo(null);
    //    //
    //    //frame.pack();
    //
    //    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //    frame.setVisible(true);
    //    //new LoginFrame();
//}


    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,600);
        //frame.pack();
        frame.setVisible(true);
    }
}

