import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a movie rating: ");
        double rating = sc.nextDouble();
        System.out.println("Rating rounded: " + (int)(rating + 0.5));
        sc.close();
    }
}