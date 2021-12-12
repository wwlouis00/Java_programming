import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_Test1 {
    private JTextField displayField;
    private JButton oppisiteButton;
    private JButton Button1;
    private JButton clearenterButton;
    private JButton Button4;
    private JButton Button7;
    private JButton Button6;
    private JButton Button3;
    private JButton dotButton;
    private JButton Button9;
    private JButton divideButton;
    private JButton multiplyButton;
    private JButton subButton;
    private JButton addButton;
    private JButton equalButton;
    private JButton clearButton;
    private JButton Button8;
    private JButton Button5;
    private JButton Button2;
    private JButton Button0;
    private JPanel calcPanel;


    enum CalcOP {NONE, ADD, SUB, MULTIPLY, DIVIDE};

    private boolean isDigitEnterMode = false;
    private String displayString = "";
    private double result = 0;
    private CalcOP lastOP = CalcOP.NONE;

    private void enterDigit(String digit) {
        if (!isDigitEnterMode) {
            if (digit == ".")
                displayString = "0.";
            else
                displayString = digit;
                isDigitEnterMode = true;
        }
        else {
            // Only floating-point number
            // can start with 0
            if (displayString == "0" && digit != ".")
                return;
            displayString += digit;
        }
        displayField.setText(displayString);
    }

    private void evalLastOP(CalcOP currOP) {
        double value = Double.parseDouble(displayField.getText());
        try {
            switch (lastOP) {
                case ADD:
                    result += value;
                    break;
                case SUB:
                    result -= value;
                    break;
                case DIVIDE:
                    result /= value;
                    break;
                case MULTIPLY:
                    result *= value;
                    break;
                default: // First value
                    result = value;
                    break; }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        displayField.setText(Double.toString(result));
        isDigitEnterMode = false;
        lastOP = currOP;
    }

    public Calculator_Test1() {
        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("0");
            }
        });

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("1");
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("2");
            }
        });

        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("3");
            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("4");
            }
        });

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("5");
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("6");
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("7");
            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("8");
            }
        });

        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit("9");
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evalLastOP(CalcOP.ADD);
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evalLastOP(CalcOP.SUB);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evalLastOP(CalcOP.MULTIPLY);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evalLastOP(CalcOP.DIVIDE);
            }
        });

        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evalLastOP(CalcOP.NONE);
            }
        });

        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterDigit(".");
            }
        });

        clearenterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayString="";
                isDigitEnterMode = false;
                displayField.setText(displayString);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = 0;
                lastOP = CalcOP.NONE;
                displayString="";
                isDigitEnterMode = false;
                displayField.setText(displayString);
            }
        });

        oppisiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp = Double.parseDouble(displayField.getText());
                temp *= -1;
                displayString = Double.toString(temp);
                displayField.setText(displayString);
            }
        });

    }

    public void testClick(String button) throws Exception {
        switch (button) {
            case "+": addButton.doClick(); break;
            case "-": subButton.doClick(); break;
            case "*": multiplyButton.doClick(); break;
            case "/": divideButton.doClick(); break;
            case ".": dotButton.doClick(); break;
            case "=": divideButton.doClick(); break;
            case "±": oppisiteButton.doClick(); break;
            case "CE": clearenterButton.doClick(); break;
            case "CLEAR": clearButton.doClick(); break;
            case "0": Button0.doClick(); break;
            case "1": Button1.doClick(); break;
            case "2": Button2.doClick(); break;
            case "3": Button3.doClick(); break;
            case "4": Button4.doClick(); break;
            case "5": Button5.doClick(); break;
            case "6": Button6.doClick(); break;
            case "7": Button7.doClick(); break;
            case "8": Button8.doClick(); break;
            case "9": Button9.doClick(); break;
            default: throw new Exception("Error! No button " + button);
        }
    }

    public double getResult() {
        return result;
    }

    public void showWindow() {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(this.calcPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator_Test1");
        frame.setContentPane(new Calculator_Test1().calcPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
