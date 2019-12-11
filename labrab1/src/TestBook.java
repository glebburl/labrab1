import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Моя жизнь", "я", 1, "Проза");
        Book b2 = new Book("Би2", "Я", 289, "Проза");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}