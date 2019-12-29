import javax.swing.*;
import java.awt.*;
//builder class to create buttons
public class ButtonBuilder {
    private final Container contentPane;
    private final GridBagConstraints gbc;
    private final String name;
    private final String command;
    private final int height;
    private final int width;
    private final int gridX;
    private final int gridY;
    private Listener listener;
    private KeyboardListener keyboardListener;

    public static class Builder {
        //required params
        private final Container contentPane;
        private final GridBagConstraints gbc;

        //optional param - init to default
        private String name = "";
        private String command = "default";
        private int height = 100;
        private int width  = 100;
        private int gridX  = 0;
        private int gridY  = 0;

        public Builder(Container contentPane, GridBagConstraints gbc) {
            this.contentPane    = contentPane;
            this.gbc            = gbc;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder command(String command) {
            this.command = command;
            return this;
        }
        public Builder height(int height) {
            this.height = height;
            return this;
        }
        public Builder width(int width) {
            this.width = width;
            return this;
        }
        public Builder gridX(int gridX){
            this.gridX = gridX;
            return this;
        }
        public Builder gridY(int gridY) {
            this.gridY = gridY;
            return this;
        }

        public ButtonBuilder build() {
            return new ButtonBuilder(this);
        }
    }

    private ButtonBuilder(Builder builder) {
        contentPane     = builder.contentPane;
        gbc             = builder.gbc;
        name            = builder.name;
        command         = builder.command;
        height          = builder.height;
        width           = builder.width;
        gridX           = builder.gridX;
        gridY           = builder.gridY;
        //initialize listeners
        listener = new Listener(contentPane);
        keyboardListener = new KeyboardListener();
        createButton();
    }

    private void createButton() {
        //declare and initialize button
        JButton button = new JButton(this.name);
        //set position i grid bag layout
        gbc.gridx = gridX;
        gbc.gridy = gridY;
        //set text on button and its size
        button.setName(name);
        Font font = new Font("Verdana", Font.BOLD, 30);
        button.setFont(font);
        //button.setSize(new Dimension(width, height));

        //set action command to make it easier to write event listener
        button.setActionCommand(command);

        //add button and keyboard listeners
        button.addActionListener(this.listener);
        button.addKeyListener(keyboardListener);

        //makes button transparent, pane will be colored, so no need to color buttons
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        //button.setBorderPainted(false);

        //add button to pane
        contentPane.add(button, gbc);
    }
}
