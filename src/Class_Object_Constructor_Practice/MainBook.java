package Class_Object_Constructor_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> Books = new ArrayList<>();

        while (true) {
            System.out.println("What is the title of the book?");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {
                break;
            }

            System.out.println("How many pages are in the book?");
            Integer numOfPagesInBook = Integer.valueOf(scanner.nextLine());

            System.out.println("What year was the book published?");
            Integer bookPublicationYear = Integer.valueOf(scanner.nextLine());


            Books.add(new Book(bookTitle));
            Books.add(new Book(numOfPagesInBook, bookPublicationYear));
        }
        while (true) {
            System.out.println("What information will be printed? Everything or Name");
            String infoToBePrinted = scanner.nextLine();
            if (infoToBePrinted.equals("")){
                break;
            }
            if (infoToBePrinted.equalsIgnoreCase("Everything")) {
                for (Object Book : Books) {
                    System.out.println(Book.toString());

                }
               break;
            }
            if (infoToBePrinted.equalsIgnoreCase("Name")) {
                for (Book Book : Books) {
                    System.out.println(Book.getBookTitle());

                }
                break;
            }
        }
    }
}
