import java.util.Scanner;
public class Color {
    public static String color() {

        String a = "Red";
        String b = "Blue";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first color letter");
        }
    }
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color(R-Red, B-Blue):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "R":
                    System.out.println("Red");
                    break;
                case "B":
                    System.out.println("blue");
                    break;
                default:
                    System.out.println("Try again.");
            }
            }
        }
    }