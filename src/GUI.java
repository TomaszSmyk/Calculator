import javax.swing.*;
import java.awt.*;

public class GUI {
    private Container contentPane;
    private Listener listener;
    private GridBagConstraints gbc = new GridBagConstraints();
    protected static JTextField display = new JTextField();

    public GUI(Container contentPane) {
        this.contentPane = contentPane;
        //set pane color
        contentPane.setBackground(new Color(127,127,156));
        //set up all components - buttons and display,
        setupButtons();
    }
    private void setupButtons() {
        //all components have same weight so each one of them will have same size...
        gbc.weightx = 1;
        gbc.weighty = 1;
        //...and will spread up and down evenly
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridwidth = 4;//makes text field span 3 cells
        //make it not editable in case user wants to change cursor position
        display.setEditable(false);
        //this will change this gray color of uneditable components back to black
        display.setBackground(Color.WHITE);
        //add keyboard listener
        display.addKeyListener(new KeyboardListener());
        //set display's text size and color
        Font font = new Font("Verdana", Font.BOLD, 40);
        display.setFont(font);
        display.setBackground(new Color(127,127,156));
        display.setOpaque(false);
        //add textfield to pane
        contentPane.add(display,gbc);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;//return to default
        /********************************************
         *    DESIGN:
         *            x 0  1 2 3
         *         y   ----------
         *         0 |  /display/
         *         1 |  AC < % /
         *         2 |  7  8 9 *
         *         3 |  4  5 6 -
         *         4 |  1  2 3 +
         *         5 |     0 . =
         *
         ********************************************/
        //Functional buttons declaration
        new ButtonBuilder.Builder(contentPane, gbc).name("AC").command("ac").
                height(100).width(100).gridX(0).gridY(1).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("< ").command("del").
                height(100).width(100).gridX(1).gridY(1).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("%").command("percent").
                height(100).width(100).gridX(2).gridY(1).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("/").command("div").
                height(100).width(100).gridX(3).gridY(1).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("*").command("mul").
                height(100).width(100).gridX(3).gridY(2).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("-").command("sub").
                height(100).width(100).gridX(3).gridY(3).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("+").command("add").
                height(100).width(100).gridX(3).gridY(4).build();
        new ButtonBuilder.Builder(contentPane, gbc).name(".").command("point").
                height(100).width(100).gridX(2).gridY(5).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("= ").command("equal").
                height(100).width(100).gridX(3).gridY(5).build();

        //Number buttons declaration
        new ButtonBuilder.Builder(contentPane, gbc).name("0").command("0").
                height(100).width(100).gridX(1).gridY(5).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("1").command("1").
                height(100).width(100).gridX(0).gridY(4).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("2").command("2").
                height(100).width(100).gridX(1).gridY(4).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("3").command("3").
                height(100).width(100).gridX(2).gridY(4).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("4").command("4").
                height(100).width(100).gridX(0).gridY(3).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("5").command("5").
                height(100).width(100).gridX(1).gridY(3).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("6").command("6").
                height(100).width(100).gridX(2).gridY(3).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("7").command("7").
                height(100).width(100).gridX(0).gridY(2).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("8").command("8").
                height(100).width(100).gridX(1).gridY(2).build();
        new ButtonBuilder.Builder(contentPane, gbc).name("9").command("9").
                height(100).width(100).gridX(2).gridY(2).build();

    }

}
