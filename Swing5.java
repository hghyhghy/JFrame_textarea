
import javax.swing.*;


public class Swing5
{
       public static  void main(String[]  args )
       {
            JFrame f= new JFrame();

            JTextField tf1= new JTextField("Here Is Your System");

            JTextField tf2= new JTextField("System is hacked");


            tf1.setBounds(50, 100, 200, 30);

            tf2.setBounds(50, 150, 200, 30);

            f.add(tf1);

            f.add(tf2);

            f.setSize(400, 400);

            f.setLayout(null);


            f.setVisible(true);

            JFrame f1= new JFrame();

            JTextArea ta= new JTextArea("Welcome to Java Swing ");

            ta.setBounds(10,30,200,200);

            f1.add(ta);

            f1.setSize(300,300);

            f1.setLayout(null);

            f1.setVisible(true);




       }
}