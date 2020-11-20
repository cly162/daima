package com.homework1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class form1 {
    private JPanel mainpanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JLabel text1;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ibsn = textField1.getText();
                Integer length = Integer.parseInt(textField2.getText());
                Integer price = Integer.parseInt(textField3.getText());
                Book book = new Book(ibsn,length,price);
                BookService ss = new BookServiceImpl();
                boolean flay=false;
                try {
                    flay = ss.checkbook(book);
                } catch (BookNameException | PriceException | LengthException ee) {
                    JOptionPane.showMessageDialog(null,"书没成功上架");
                }finally {
                    JOptionPane.showMessageDialog(null,"finish");
                }
                if(flay){
                    text1.setText("书上架成功");
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                }
            }
        });


    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("form1");
        frame.setContentPane(new form1().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        //frame.pack();
        frame.setVisible(true);
    }
}
