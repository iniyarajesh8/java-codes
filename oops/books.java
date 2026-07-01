package oops;

public class books {
    String title;
    String author;
    double price;
    public books(String t,String a,double p)
    {
        this.title=t;
        this.author=a;
        this.price=p;
    }
    public void showbookdetails()
    {
        System.out.println("book title: "+title);
        System.out.println("book title: "+author);
        System.out.println("book title: "+price);
    }
    public static void main(String[] args) {
        books obj=new books("harry potter","jk rowling",80);
        obj.showbookdetails();
    }
}
