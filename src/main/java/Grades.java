public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        if (size > 0) {
            return grades[size - 1];
        } else {
            return 0;
        }
    }

    public double average() {
        double sum = 0d;
        for (int i = 0; i <= size; i++) {
            sum += grades[i];
        }
        return sum / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(7);
        grades.add(2);
        grades.add(2);
        System.out.println(grades.average());
    }
}