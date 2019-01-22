package exercises.comparableAndComparator.example;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
        products[1] = new Product("Amino", "Zupa ogorkowa", "Zupy");
        products[2] = new Product("Winiary", "Zupa pomidorowa", "Zupy");
        products[3] = new Product("Winiary", "Zupa pomidorowa", "Zupy blyskawiczne");
        products[4] = new Product("Winiary", "Rosol", "Zupy");
        products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");

        System.out.println("Nieposortowane: ");
        for(Product p: products) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Posortowane po calosci czyli z uzyciem Comparable: ");
        Arrays.sort(products);
        for(Product p: products) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Posortowane tylko po name czyli z uzyciem Comparator: ");
        Arrays.sort(products, new Product.ProductNameComparator());
        for(Product p: products) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Klasa anonimowa po producencie: ");
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        for(Product p: products) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Zastosowanie zwyklej odrebnej klasy i sortowanie po kategorii: ");
        Arrays.sort(products, new ProductCategoryComparator());
        for(Product p: products) {
            System.out.println(p);
        }
    }
}
