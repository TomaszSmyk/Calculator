import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {

    Container contentPane;
    private static boolean allowFurtherAction = true;
    protected static float firstExpression = 0;
    protected static float secondExpression = 0;
    private Calculator calculator = new Calculator();
    private static int operation = -1;



    public Listener(Container contentPane) {
        this.contentPane = contentPane;
    }

    private void action(int operation) {
        if(allowFurtherAction) {
            allowFurtherAction = false;
            firstExpression = Float.parseFloat(GUI.display.getText());
            GUI.display.setText("");
            this.operation = operation;
        }
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String action = actionEvent.getActionCommand();
        switch (action) {
            //functional
            case "add"://0
                action(0);
                break;
            case "sub"://1
                action(1);
                break;
            case "div"://2
                action(2);
                break;
            case "mul"://3
                action(3);
                break;
            case "equal":
                allowFurtherAction = true;
                secondExpression = Float.parseFloat(GUI.display.getText());
                switch (operation) {
                    case 0:
                        calculator.add();
                        break;
                    case 1:
                        calculator.sub();
                        break;
                    default:

                        break;

                }

                break;
            case "ac":
                GUI.display.setText("");
                break;
            case "del":
                String display = GUI.display.getText();
                display.substring(0, display.length()-1);
                GUI.display.setText(display);
                break;
            case "percent":
                GUI.display.setText(GUI.display.getText() + "%");

                break;
            case "9":
                GUI.display.setText(GUI.display.getText() + "9");
                break;
            case "8":
                GUI.display.setText(GUI.display.getText() + "8");
                break;
            case "7":
                GUI.display.setText(GUI.display.getText() + "7");
                break;
            case "6":
                GUI.display.setText(GUI.display.getText() + "6");
                break;
            case "5":
                GUI.display.setText(GUI.display.getText() + "5");
                break;
            case "4":
                GUI.display.setText(GUI.display.getText() + "4");
                break;
            case "3":
                GUI.display.setText(GUI.display.getText() + "3");
                break;
            case "2":
                GUI.display.setText(GUI.display.getText() + "2");
                break;
            case "1":
                GUI.display.setText(GUI.display.getText() + "1");
                break;
            case "0":
                GUI.display.setText(GUI.display.getText() + "0");
                break;
            default:
                System.out.println("Action undefined, error!");
                break;
        }
    }
}
