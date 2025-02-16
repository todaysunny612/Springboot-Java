package Task_07;

public class HeadFirstJava extends Book{
    public String review;

    public HeadFirstJava(String author, String isbn, int price, String title) {
        super(author, isbn, price, title);
    }

    public String getReview() {
        return review;
    }
    void setReview(String review){
        this.review = review;
    }
}
