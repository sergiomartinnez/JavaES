import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Choose the number of wished option");
            System.out.println("1 movies");
            System.out.println("2 series");
            System.out.println("0 exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("thank you for visiting us");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("choose a correct option");
            }

        }while (response != 0);

        System.out.println("the program has ended");
    }
}
