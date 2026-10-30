import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10); // hộp chứa: xếp các thẻ từ trên xuống, cách nhau 10px
        root.setPadding(new Insets(20));

        // ===== BẮT ĐẦU: viết code demo vào đây =====

        
        // ===== KẾT THÚC =====

        stage.setScene(new Scene(root, 520, 400));
        stage.setTitle("Demo JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
