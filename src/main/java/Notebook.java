public class Notebook {
        int weight;
        int price;
        int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkWeight(){
     if (this.weight > 600) {
         System.out.println("this notebook is light");

        } else if (this.weight >600 && this.weight < 1200){
         System.out.println("this notebook is not so heavy");
        } else {
         System.out.println("this notebook is heavy");
        }
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");

        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("this price is good");

        } else{
            System.out.println("This notebook is quite expensive");
        }
    }
    public void checkYear(){
        if (this.year > 2020) {
            System.out.println("this notebook is brand new");

        } else if (this.year > 2015 && this.year < 2020) {
            System.out.println("this notebook is not so new");
        } else {
            System.out.println("this notebook is old");
        }
    }
}