package javafx8sample;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.chrono.Chronology;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author tomo
 */
public class Sample extends VBox{
    @FXML
    private Label localeLabel;
    @FXML 
    private DatePicker datePicker;
    @FXML
    private Label messageLabel;
    @FXML
    private Button calculateButton;
    
    public void loadFxml(Locale locale, Chronology chronology) {
        ResourceBundle propBundle = ResourceBundle.getBundle("resources/Label", locale);        
        ResourceBundle javaBundle = ResourceBundle.getBundle("javafx8sample.Message", locale);        
        URL url = getClass().getResource("Sample.fxml");
        FXMLLoader loader = new FXMLLoader(url, propBundle);
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.<VBox>load();
        } catch (IOException ex) {
            Logger.getLogger(Sample.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ロケールラベルを設定
        this.localeLabel.setText(String.format("%s%s(%s)"
                , javaBundle.getString("locale_label")
                , locale.getDisplayLanguage(locale)
                , locale.getDisplayCountry(locale)));
        // カレンダ
        this.datePicker.setChronology(chronology);
        // 計算ボタン
        this.calculateButton.setOnAction(event -> {
            this.messageLabel.setText("");
            LocalDate localDate = this.datePicker.getValue();
            if (localDate != null) {
                LocalDate now = LocalDate.now();
                int age = localDate.until(now).getYears();
                String messageLabelText = javaBundle.getString("message");
                this.messageLabel.setText(String.format(messageLabelText, age));
            }
        });
    }
    
}
