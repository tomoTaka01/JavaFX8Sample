/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafx8sample;

import java.net.URL;
import java.text.NumberFormat;
import java.time.chrono.HijrahChronology;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author tomo
 */
public class DemoController implements Initializable {
    @FXML
    private DatePicker datePicker;
    @FXML
    private VBox vbox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setDatePicker();
        formatNumber(new Locale("th"));
        formatNumber(new Locale("th", "TH"));
        formatNumber(new Locale("th", "TH", "TH"));
        formatNumber(new Locale("fr", "FR"));
    }    

    private void formatNumber(Locale locale) {
        NumberFormat fm = NumberFormat.getNumberInstance(locale);
        String formatVal = fm.format(1234567.89);
        Text text = new Text(String.format("locale:%s, Number:%s", locale, formatVal));
        vbox.getChildren().add(text);
    }

    private void setDatePicker() {
        this.datePicker.setChronology(HijrahChronology.INSTANCE);
    }
    
}
