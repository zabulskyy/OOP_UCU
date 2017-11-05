package Parser;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class CategoryPageParser extends PageParser {

    CategoryPageParser(String url) throws IOException {
        super(url);
    }

    ArrayList<String> commentsPages(){
        ArrayList<String> urls = new ArrayList<String>();
        Elements aElements = this.findElementsWithAttribute("a", ".responsive-img");
        for (Element element:
             aElements) {
            urls.add(this.findAttributeValueInElement(element, "href") + "comments/");
        }
        return urls;
    }



}
