import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class JsoupGoogleSearch {
    public static void main(String[] args) throws IOException {
        String searchString = "usd to inr rate";
        Document document = Jsoup.connect("http://google.com/search?q="+ searchString).get();

        String element = document.getElementsByClass("DFlfde SwHCTb").attr("data-value");
        System.out.println(element);
    }
}
