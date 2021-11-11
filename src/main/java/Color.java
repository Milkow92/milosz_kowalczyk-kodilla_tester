import java.util.Scanner;
public class Color {

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first color letter");
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