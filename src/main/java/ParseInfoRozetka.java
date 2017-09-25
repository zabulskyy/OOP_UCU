import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class ParseInfoRozetka {
    public static void main(String[] args) throws IOException {

        Document doc;
        try {

            doc = Jsoup.connect("https://rozetka.com.ua/ua/photo/c80001/filter/").get();
            System.out.println(doc.title());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
