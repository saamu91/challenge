package com.samu;

public class Article {

        int amount;
        String product;
        double price;
        boolean isImported;

        double taxPrice = 0.0;
        double sumOfTaxPrices = 0.0;
        double total = 0.0;

        void printOrder()
        {
            System.out.println(amount + " " + product + ": " + String.format("%.2f",(price + taxPrice) ));
        }

        double roundUp(double price, double tax)
        {
            double val;
            val = Math.ceil((price * tax) * 20);
            val = val / 20;

            return val;
        }


        void tax(Article a) {
            if (this.isImported && this.product.contains("perfume"))
            {
                a.taxPrice = roundUp(price, 0.15);
            }
            else if (this.isImported)
            {
                a.taxPrice = roundUp(price, 0.05);
            }
            else if (this.product.contains("music") | this.product.contains("perfume"))
            {
                a.taxPrice = roundUp(price, 0.10);
            }
            else
            {
                a.taxPrice = 0;
            }
        }


        double totalSalesTaxes()
        {
            return sumOfTaxPrices += taxPrice;
        }


        double total()
        {
            return total += (price + taxPrice);
        }
}
