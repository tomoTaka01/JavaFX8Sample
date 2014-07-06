package javafx8sample;

import java.util.ListResourceBundle;

/**
 *
 * @author tomo
 */
public class Message extends ListResourceBundle{
    private static Object[][] contents = {
        {"message", "あなたの年齢は%dです。"},
        {"locale_label", "ロケール："},
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
