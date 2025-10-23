public class Book {
    String title;
    String author;
    double price;

    public Book(){

        title = " ";
        author = " ";
        price = 0;

    }
    public Book(String title, String author, double price){

        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void showDetails(){
        System.out.println(title + " " + author + " " + price );


    }

}