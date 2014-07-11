package javafx8sample;

import java.util.ListResourceBundle;

/**
 *
 * @author tomo
 */
public class Message_en extends ListResourceBundle{
    private static Object[][] contents = {
        {"birthday_label", "BirthDay(M):"},
        {"計算ラベル", "calculate(M)"},
        {"message", "Your age is %d."},
        {"locale_label", "locale:"},
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
