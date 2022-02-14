package lesson;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        //Create a new Book by reading from standard in
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        Book bk = new Book();
        bk.setTitle(title);
        bk.setAuthor(author);
        
        //Create a new Fiction book by reading from standard in
        title = scanner.nextLine();
        author = scanner.nextLine();
        String genre = scanner.nextLine();
        String ISBN = scanner.nextLine();
        Fiction fiction = new Fiction(ISBN);
        fiction.setTitle(title);
        fiction.setAuthor(author);
        fiction.setGenre(genre);

        //Print both books to standard out
        System.out.println(bk.getBookInfo());
        System.out.println(fiction.getBookInfo());
      }
}
