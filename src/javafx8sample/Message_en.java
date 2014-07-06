package javafx8sample;

import java.util.ListResourceBundle;

/**
 *
 * @author tomo
 */
public class Message_en extends ListResourceBundle{
    private static Object[][] contents = {
        {"message", "Your age is %d."},
        {"locale_label", "locale:"},
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
