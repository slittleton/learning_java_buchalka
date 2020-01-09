package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private TextField nameField;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread()? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: " + s);
                    Thread.sleep(4000);
                    Platform.runLater(new Runnable() { // this second runnable ensures that the update occurs on the ui
                        // thread you you don't update from the ui thread theny ou will get an IllegalStateException
                        // since other threads are not allowed to update because it could lead to a race condition
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread()? "UI Thread" : "Background Thread";
                            System.out.println("I'm updateing the label on the: " + s);
                            ourLabel.setText("We did something");
                        }
                    });
                } catch (InterruptedException event) {
                    // we don't care about this
                }
            }
        };

        new Thread(task).start();


        if (ourCheckBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }


    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }

}
