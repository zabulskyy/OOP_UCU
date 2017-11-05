package Parser;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ReviewsPageParser extends PageParser {
    ReviewsPageParser(String url) throws IOException {
        super(url);
    }

    String parseCommentsPage() {
        Element spanContainer = null;
        StringBuilder feedback = new StringBuilder("Camera: ");

        try {
            feedback.append(this.doc.select("h2.detail-title").text());
        } catch (NullPointerException e){
            return " ";
        }

        feedback.append("\n");

        Elements spanElements = doc.select("span");
        for (Element element :
                spanElements) {
            if (element.attr("itemprop").equals("aggregateRating")) {
                spanContainer = element;
                break;
            }
        }

        if (spanContainer != null) {
            for (Element element :
                    spanContainer.children()) {
                if (element.attr("itemprop").equals("ratingValue")) {
                    feedback.append("Avr rating: ").append(element.attr("content")).append("*\n");
                } else if (element.attr("itemprop").equals("bestRating")) {
                    feedback.append("Best rating: ").append(element.attr("content")).append("*\n");
                } else if (element.attr("itemprop").equals("worstRating")) {
                    feedback.append("Worst rating: ").append(element.attr("content")).append("*\n");
                } else if (element.attr("itemprop").equals("ratingCount")) {
                    feedback.append("Rated ").append(element.attr("content")).append(" times\n");
                }
            }
        }

        return feedback.toString() + "\n";
    }

}
