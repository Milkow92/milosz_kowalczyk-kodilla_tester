import javax.xml.namespace.QName;

public class Application {
    public static void main(String[] args) {
        Person adam = new Person("adam", 40.5, 178);
        if (adam.hasName()) {
            System.out.println(adam.checkAgeAndHeight());
        }
    }
}

class Person {
    String name;
    double age;
    double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String checkAgeAndHeight() {
        if (age > 30 && height > 160) {
            return "User is older than 30 and higher than 160cm";
        } else {
            return "User is 30 (or younger) or 160cm (or shorter)";
        }
    }


    public boolean hasName() {
        return name != null;
    }
}

