import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //key(keyEvent);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        key(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        //key(keyEvent);
    }

    private void key(KeyEvent keyEvent) {
        int key = keyEvent.getKeyCode();
        if (key == VK_ADD) {
            Listener.action(0);
        }
        else if (key == VK_SUBTRACT) {
            Listener.action(1);
        }
        else if(key == VK_SLASH || key == VK_BACK_SLASH) {
            Listener.action(2);
        }
        else if(key == VK_ASTERISK ) {
            Listener.action(3);
        }
        else if(key == VK_EQUALS || key == VK_ENTER) {
            Listener.equals();
        }
        else if(key == VK_BACK_SPACE) {
            try {
                String display = GUI.display.getText();
                display = display.substring(0, display.length() - 1);
                GUI.display.setText(display);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                GUI.display.setText("0");
            }
        }
        else if (key == VK_PERIOD || key == VK_DECIMAL) {
            if (!GUI.display.getText().contains(".")) {
                GUI.display.setText(GUI.display.getText() + ".");
            }
        }
        else if(key == VK_0) {
            GUI.display.setText(GUI.display.getText() + "0");
        }
        else if (key == VK_1) {
            GUI.display.setText(GUI.display.getText() + "1");
        }
        else if (key == VK_2) {
            GUI.display.setText(GUI.display.getText() + "2");
        }
        else if (key == VK_3) {
            GUI.display.setText(GUI.display.getText() + "3");
        }
        else if (key == VK_4) {
            GUI.display.setText(GUI.display.getText() + "4");
        }
        else if (key == VK_5) {
            GUI.display.setText(GUI.display.getText() + "5");
        }
        else if (key == VK_6) {
            GUI.display.setText(GUI.display.getText() + "6");
        }
        else if (key == VK_7) {
            GUI.display.setText(GUI.display.getText() + "7");
        }
        else if (key == VK_8) {
            GUI.display.setText(GUI.display.getText() + "8");
        }
        else if (key == VK_9) {
            GUI.display.setText(GUI.display.getText() + "9");
        }
    }
}
