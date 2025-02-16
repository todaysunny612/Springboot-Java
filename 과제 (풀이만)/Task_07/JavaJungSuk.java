package Task_07;

public class JavaJungSuk extends Book{
    public int edition;

    public JavaJungSuk(String author, String isbn, int price, String title){
        super(author, isbn, price, title);
    }

    public int getEdition(){
        return edition;
    }
    public void setEdition(int edition){
        this.edition = edition;
    }
}
