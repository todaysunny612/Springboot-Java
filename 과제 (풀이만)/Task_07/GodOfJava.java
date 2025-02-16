package Task_07;

public class GodOfJava extends Book{
    public String contents;

    public GodOfJava(String author, String isbn, int price, String title) {
        super(author, isbn, price, title);
    }

    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
}
