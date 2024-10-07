import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList= Arrays.asList(

                new Book(800,"Bhagvat Gita"),
                new Book(900,"Java programming"),
                new Book(700,"C Language")
        );

        Library library=new Library(bookList);
        Iterator iterator=library.createIterator();

        while (iterator.hasNext()) {


            Book book= (Book) iterator.next();

            System.out.println(book.getPrice()+" "+book.getBookName());
        }
    }
}