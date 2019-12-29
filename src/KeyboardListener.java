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
        else if (key == VK_SUBTRACT || key == VK_MINUS) {
            Listener.action(1);
        }
        else if(key == VK_SLASH || key == VK_BACK_SLASH || key == VK_DIVIDE) {
            Listener.action(2);
        }
        else if(key == VK_ASTERISK || key == VK_MULTIPLY) {
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
        else if(key == VK_0 || key == VK_NUMPAD0) {
            GUI.display.setText(GUI.display.getText() + "0");
        }
        else if (key == VK_1 || key == VK_NUMPAD1) {
            GUI.display.setText(GUI.display.getText() + "1");
        }
        else if (key == VK_2 || key == VK_NUMPAD2) {
            GUI.display.setText(GUI.display.getText() + "2");
        }
        else if (key == VK_3 || key == VK_NUMPAD3) {
            GUI.display.setText(GUI.display.getText() + "3");
        }
        else if (key == VK_4 || key == VK_NUMPAD4) {
            GUI.display.setText(GUI.display.getText() + "4");
        }
        else if (key == VK_5 || key == VK_NUMPAD5) {
            GUI.display.setText(GUI.display.getText() + "5");
        }
        else if (key == VK_6 || key == VK_NUMPAD6) {
            GUI.display.setText(GUI.display.getText() + "6");
        }
        else if (key == VK_7 || key == VK_NUMPAD7) {
            GUI.display.setText(GUI.display.getText() + "7");
        }
        else if (key == VK_8 || key == VK_NUMPAD8) {
            GUI.display.setText(GUI.display.getText() + "8");
        }
        else if (key == VK_9 || key == VK_NUMPAD9) {
            GUI.display.setText(GUI.display.getText() + "9");
        }
    }
}
