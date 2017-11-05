//import org.jsoup.HttpStatusException;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//
//public class ParseInfoRozetka {
//
//    private static String parseCategoryPage(String url) {
//
//        Document doc;
//        StringBuilder feedback = new StringBuilder("");
//
//        try {
//            doc = Jsoup.connect(url).get();
//            Elements aElements = doc.select("a.responsive-img");
//            for (Element element :
//                    aElements) {
//                feedback.append(parseReviewsPage(element.attr("href") + "comments/"));
//            }
//
//            return feedback.toString();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return " ";
//    }
//
//
//    private static String parseReviewsPage(String url) throws IOException {
//        try {
//            Document doc;
//            Element spanContainer = null;
//            doc = Jsoup.connect(url).get();
//            StringBuilder feedback = new StringBuilder("");
//            feedback.append(
//                    "Camera: " + doc.select("h2.detail-title").text() + "\n"
//            );
//
//            Elements spanElements = doc.select("span");
//            for (Element element :
//                    spanElements) {
//                if (element.attr("itemprop").equals("aggregateRating")) {
//                    spanContainer = element;
//                    break;
//                }
//            }
//
//
//            if (spanContainer != null)
//                for (Element element :
//                        spanContainer.children()) {
//                    if (element.attr("itemprop").equals("ratingValue")) {
//                        feedback.append("Avr rating, " + element.attr("content") + "\n");
//                    } else if (element.attr("itemprop").equals("bestRating")) {
//                        feedback.append("Best rating, " + element.attr("content") + "\n");
//                    } else if (element.attr("itemprop").equals("worstRating")) {
//                        feedback.append("Worst rating, " + element.attr("content") + "\n");
//                    } else if (element.attr("itemprop").equals("ratingCount")) {
//                        feedback.append("Rated, " + element.attr("content") + "\n");
//                    }
//
//                }
//
//            System.out.println(feedback.toString() + "-------------------------------\n");
//
//            return feedback.toString() + "\n";
//
//        } catch (HttpStatusException e) {
//            System.out.println(" ");
//        }
//        return " ";
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        PrintWriter printWriter = new PrintWriter("cameras.csv", "UTF-8");
//
//        String result = parseCategoryPage("https://rozetka.com.ua/ua/photo/c80001/filter/");
//
//        printWriter.println(result);
//        printWriter.close();
//    }
//}
