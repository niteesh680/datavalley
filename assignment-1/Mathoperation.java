class MathOperations {

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of integers: " + sum);
    }

    public static void add(double a, double b, double c) {
        double sum = a + b + c;
        System.out.println("Sum of doubles: " + sum);
    }

    public static void add(String str1, String str2) {
        String combinedString = str1.concat(str2);
        System.out.println("Combined string: " + combinedString);
    }
}
public class Main{
    public static void main(String[] args) {
        MathOperations m= new MathOperations();
        m.add(5, 3);
        m.add(2.5, 4.7, 1.8);
        m.add("Hello ", "World!");
    }
}