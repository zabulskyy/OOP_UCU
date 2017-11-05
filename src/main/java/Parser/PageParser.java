package Parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

abstract class PageParser {

    String url;
    Document doc;

    PageParser(String url) throws IOException {
        this.url = url;
        try {
            this.doc = Jsoup.connect(this.url).get();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    Elements findElementsWithAttribute(String el, String attr) {
        return this.doc.select(el + attr);
    }

    String[] findAttributesValueInElements(Elements elements, String attr) {
        String urls[] = new String[elements.size()];

        int i = 0;
        for (Element element :
                elements) {
            urls[i] = element.attr("href");
            ++i;
        }

        return urls;
    }

    String findAttributeValueInElement(Element element, String attr) {
        return element.attr(attr);
    }

}
