package com.daka2;

import javax.swing.*;

/**
 * @ClassName HellowSwing
 * @Description TODO
 * @Author 29180
 * @Date 2020/11/8
 **/
public class HellowSwing {
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("HellowWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("hellow world");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(HellowSwing::createAndShowGUI);
    }
}

