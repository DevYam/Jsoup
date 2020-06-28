import com.gargoylesoftware.htmlunit.html.HtmlInput;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupClickElement {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://www.google.com").get();
        Element inputElement = document.getElementsByClass("gLFyf gsfi").get(0);
        // Only used for parsing i guess
    }
}
