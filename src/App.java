import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double m = sc.nextDouble();
        double c = m * 100;

        System.out.print(m + "m equivale a " + c + "cm");

        sc.close();

    }

}
