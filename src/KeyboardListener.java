import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class KeyboardListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {}
    
    //listener - in case key is pressed invoke event
    @Override
    public void keyPressed(KeyEvent keyEvent) {
        key(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {}

    /**
     * method supporting keyboard listener
     * @param keyEvent - pass to support each one of pressed keys
     */
    private void key(KeyEvent keyEvent) {
        int key = keyEvent.getKeyCode();
        //'+' key
        if (key == VK_ADD) {
            Listener.action(0);
        }
        //'-' key
        else if (key == VK_SUBTRACT || key == VK_MINUS) {
            Listener.action(1);
        }
        //'/' key
        else if(key == VK_SLASH || key == VK_BACK_SLASH || key == VK_DIVIDE) {
            Listener.action(2);
        }
        //'*' key
        else if(key == VK_ASTERISK || key == VK_MULTIPLY) {
            Listener.action(3);
        }
        //'=' key and enter key
        else if(key == VK_EQUALS || key == VK_ENTER) {
            Listener.equals();
        }
        //backspace key
        else if(key == VK_BACK_SPACE) {
            Listener.delete();
        }
        //'.' key
        else if (key == VK_PERIOD || key == VK_DECIMAL) {
            if (!GUI.display.getText().contains(".")) {
                GUI.display.setText(GUI.display.getText() + ".");
            }
        }
        //numeric keys
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
