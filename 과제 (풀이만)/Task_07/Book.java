// 실습 7 (문제는 이미지 참고)

package Task_07;

public class Book {
    String author;
    String isbn;
    int price;
    String title;

    public Book(String author, String isbn, int price, String title){
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getPrice(){
        return price;
    }
    public String getTitle(){
        return title;
    }

    void setAuthor(String author){
        this.author = author;
    }
    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setPrice(int price){
        this.price = price;
    }
    void setTitle(String title){
        this.title = title;
    }

}
