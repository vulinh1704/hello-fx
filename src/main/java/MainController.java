import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField nameField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleGreet() {
        messageLabel.setText("Xin chào, " + nameField.getText() + "!");
    }
}
