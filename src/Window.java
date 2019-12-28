import javax.swing.*;
import java.awt.*;

public class Window {
    private static final int windowHeight = 500;
    private static final int windowWidth  = 300;
    Window() {


    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("CALCULATOR");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(windowWidth, windowHeight));
        mainFrame.setLocationRelativeTo(null);
        Container contentPane = mainFrame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GUI gui = new GUI(contentPane);

        //size the window so all its contents are at or above their preferred sizes
        //mainFrame.pack();
        //show the window
        mainFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}
