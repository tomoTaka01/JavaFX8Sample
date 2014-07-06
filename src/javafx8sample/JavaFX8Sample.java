package javafx8sample;

import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.util.Locale;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author tomo
 */
public class JavaFX8Sample extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        HBox root = new HBox();
        Sample sampleJa = new Sample();
        Sample sampleEn = new Sample();
        sampleJa.loadFxml(Locale.JAPAN, JapaneseChronology.INSTANCE);
        sampleEn.loadFxml(Locale.US, IsoChronology.INSTANCE);
        root.getChildren().addAll(sampleJa, sampleEn);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
