package javafx8sample;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author tomo
 */
public class DemoMain extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Locale locale = new Locale("ar", "SA");
        ResourceBundle propBundle = ResourceBundle.getBundle("resources/Label", locale);        
//        ResourceBundle javaBundle = ResourceBundle.getBundle("javafx8sample.Message", locale);        
        URL url = getClass().getResource("Demo.fxml");
        FXMLLoader loader = new FXMLLoader(url, propBundle);
//        FXMLLoader loader = new FXMLLoader(url, javaBundle);
        AnchorPane node = loader.<AnchorPane>load();
        Scene scene = new Scene(node);
        stage.setScene(scene);
        stage.setTitle("Demo");
        stage.show();
    }
    
}
