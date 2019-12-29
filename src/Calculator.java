
public class Calculator {
    public void add() {
        float expression = Listener.firstExpression + Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
    public void sub() {
        float expression = Listener.firstExpression - Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
    public void mul() {
        float expression = Listener.firstExpression * Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
    public void div() {
        float expression = Listener.firstExpression / Listener.secondExpression;
        GUI.display.setText(String.valueOf(expression));
    }
}
