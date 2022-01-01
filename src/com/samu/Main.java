package com.samu;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //String[] input = { "1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85" };
        String[] input = {"1 imported box of chocolates at 10.00", "1 imported bottle of perfume at 47.50"};
        //String[] input = {"1 imported bottle of perfume at 27.99", "1 bottle of perfume at 18.99", "1 packet of headache pills at 9.75", "1 box of imported chocolates at 11.25"};
        Article article = new Article();

        double totalTax = 0;
        double totalPrice = 0;

        for (String string : input) {
            String[] result = string.split(" ");

            article.amount = Integer.parseInt(result[0]);

            String sub1 = string.substring(2);
            article.product = sub1.substring(0, sub1.indexOf(" at"));

            article.price = Double.parseDouble(result[result.length - 1]);

            article.isImported = string.contains("imported");

            article.tax(article);
            article.printOrder();

            totalTax = article.totalSalesTaxes();
            totalPrice = article.total();

        }

        System.out.println("Sales Taxes: " + String.format("%.2f", totalTax));
        System.out.println("Total: " + String.format("%.2f", totalPrice));
    }


}
