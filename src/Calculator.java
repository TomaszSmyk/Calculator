public class Calculator {
    public Calculator() {


    }
    private void getExpression() {
        GUI.display.getText();
    }
    public void add() {
        float expression = Listener.firstExpression + Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
    public void sub() {
        float expression = Listener.firstExpression - Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
}
