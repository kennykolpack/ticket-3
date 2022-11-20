public class Main {
    public static void main(String[] args) {
        String example = "Hello, world";
        int midPoint = example.length() / 2;
        String firstHalf = example.substring(0, midPoint);
        String secondHalf = example.substring(midPoint);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}