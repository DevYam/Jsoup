import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupGetAllImages {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://timesofindia.indiatimes.com/briefs").get();
        Elements imgs = document.getElementsByTag("img");

        for (Element img:imgs) {
            System.out.println(img.attr("src"));
        }
    }
}
