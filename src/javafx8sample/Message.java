package javafx8sample;

import java.util.ListResourceBundle;

/**
 *
 * @author tomo
 */
public class Message extends ListResourceBundle{
    private static Object[][] contents = {
        {"birthday_label", "誕生日(M)"},
        {"計算ラベル", "計算(M)"},
        {"message", "あなたの年齢は%dです。"},
        {"locale_label", "ロケール："},
    };
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
