import javax.swing.*;
import java.awt.*;

public class Window {
    private static final int windowHeight = 550;
    private static final int windowWidth  = 350;
    Window() {


    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("CALCULATOR");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(windowWidth, windowHeight));
        mainFrame.setLocationRelativeTo(null);


        Container contentPane = mainFrame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        new GUI(contentPane);


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
