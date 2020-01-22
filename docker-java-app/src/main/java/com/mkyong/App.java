package com.mkyong;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            System.err.println("[Usage] jar -jar find-links.jar <url>");
            return;
        }

        String url = args[0];

        for (String link : findLinks(url)) {
            System.out.println(link);
        }

    }

    private static Set<String> findLinks(String url) throws IOException {

        Document doc = Jsoup.connect(url)
                .data("query", "Java")
                .userAgent("Mozilla")
                .cookie("auth", "token")
                .timeout(3000)
                .get();

        Set<String> links = new HashSet<>();

        Elements elements = doc.select("a[href]");

        for (Element element : elements) {
            links.add(element.attr("href"));
        }

        return links;
    }
}
