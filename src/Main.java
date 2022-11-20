public class Main {
    public static void main(String[] args) {
        String example = "Hello, world";
        int midpoint = example.length() / 2;
        String firstHalf = example.substring(0, midpoint);
        String secondHalf = example.substring(midpoint);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}