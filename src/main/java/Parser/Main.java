package Parser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("cameras.csv", "UTF-8");
        String result;

        CategoryPageParser cpParser = new CategoryPageParser("https://rozetka.com.ua/ua/photo/c80001/filter/");
        ReviewsPageParser rpParser;
        ArrayList<String> commentPages = cpParser.commentsPages();


        for (String commentPage : commentPages) {
            rpParser = new ReviewsPageParser(commentPage);
            result = rpParser.parseCommentsPage();
            System.out.println(result);
            printWriter.println(result);
        }

        printWriter.close();
    }
}
