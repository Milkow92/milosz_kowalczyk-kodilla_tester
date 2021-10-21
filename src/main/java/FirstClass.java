public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]

        Notebook notebook = new Notebook(600,1000 , 2021);
        System.out.println(notebook.weight + " " +  notebook.price + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        // [3]
   Notebook hevyNotebook = new Notebook(2000,1500 , 2016);
   System.out.println(hevyNotebook.weight + " " + notebook.price + notebook.year);
   notebook.checkPrice();
   notebook.checkYear();
   notebook.checkWeight();

   Notebook oldNotebook = new Notebook(1200,500 , 2000);
   System.out.println(oldNotebook.weight + " " + notebook.price + notebook.year);
   notebook.checkPrice();
   notebook.checkWeight();
   notebook.checkYear();
    }
}