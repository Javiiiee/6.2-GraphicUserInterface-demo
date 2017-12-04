import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class CalcDriver extends  JFrame {
        public JTextField textField;
        public JLabel label;
        public JTextField textField2;

        public CalcDriver() {
            textField = new JTextField(10);
            label = new JLabel("             0.0");
            textField2 = new JTextField(10);
            JButton button = new JButton("SUM");
            button.addActionListener(new CalculateHandle());

            FlowLayout layout = new FlowLayout();
            JPanel panel = new JPanel(layout);
            panel.add(label);
            panel.add(textField);
            panel.add(textField2);
            panel.add(button);
            setContentPane(panel);
        }
        public static void main(String [] args){
            CalcDriver calc = new CalcDriver();
            calc.setSize(1000,1000);
            calc.setTitle("Calculator");
            calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            calc.pack();
            calc.setVisible(true);
            System.out.println(calc.getInsets());
        }
        private class CalculateHandle implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                double input1 = Double.parseDouble(textField.getText());
                double input2 = Double.parseDouble(textField2.getText());
                double result = (input1 + input2);
                DecimalFormat format = new DecimalFormat("####.00");
                label.setText(String.valueOf(format.format(result)));
            }
        }
}
