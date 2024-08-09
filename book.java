public class book {
    public static void main (String args[]) {
        
        bookInfo bookInfo = new bookInfo();
        bookInfo.stockStatus(true);
        bookInfo.changeName("The Great Gorilla");
        bookInfo.printStats();
      
    }
}
class bookInfo{
    String name = "The Great Gatsby";
    double price = 17.99;
    String author = "F. Scott Fitzgerald";
    boolean sold = false;

    public void stockStatus (boolean Newsold) {
        sold = Newsold;
}
    public void changeName (String newName) {
        name = newName;
}
    public void printStats () {
        System.out.println(name + " " + price + " " + author + " " + sold);
}
}
