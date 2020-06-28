import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupBodyAndLinks {
    public static void main(String[] args) throws IOException {
        String url = "https://timesofindia.indiatimes.com/briefs";
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();
//      System.out.println(doc.body().text());
        Elements links = doc.select("a[href]");
        for(Element el: links){
            System.out.println(el.attr("href"));
        }
    }
}
