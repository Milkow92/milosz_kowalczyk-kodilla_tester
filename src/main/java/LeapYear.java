public class LeapYear {
public boolean checkIfLeapYear(int year){
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
}
    public static void main (String[] args) {
        LeapYear object = new LeapYear();
    System.out.println(object.checkIfLeapYear(1916));
    }
}
