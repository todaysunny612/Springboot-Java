package Task_07;

import java.util.Scanner;

public class BookTest {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("======= 책 정보를 입력하세요 =======");

        System.out.println("책 제목 : ");
        String title = scan.nextLine();

        System.out.println("저자 : ");
        String author = scan.nextLine();

        System.out.println("출판사 : ");
        String isbn = scan.nextLine();

        System.out.println("가격 : ");
        int price = scan.nextInt();

        Book bookinfo = new Book(author, isbn, price, title);
        System.out.println("================================");
        System.out.println("책" + bookinfo.getTitle() + "의 저자는" + bookinfo.getAuthor() + "이고");
        System.out.println("출판사와 각격은 각 각 "+ bookinfo.getIsbn()+", "+bookinfo.getPrice());
    }
}
