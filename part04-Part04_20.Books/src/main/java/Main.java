import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String title;
        int pages;
        int year;
        String query;
        
        while(true){
            //System.out.println("Title: ");
            title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            //System.out.println("Pages: ");
            pages = Integer.valueOf(scanner.nextLine());
            
            //System.out.println("Publication year: ");
            year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages ,year));
        }
        
        //System.out.println("What information will be printed? ");
        query = scanner.nextLine();
        
        if(query.equals("everything")){
            for(Book book : books){
                System.out.println(book.printAll());
            }
        }
        else{
            for(Book book : books){
                System.out.println(book.printName());
            }
        }

    }
}
