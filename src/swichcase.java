import java.util.Scanner;

public class swichcase {
    public static void  main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        switch (a){
            case "USD":
            System.out.println("98.2");
            break;

            case "EUR":

                System.out.println("2.21");
                break;

            case "RUB":
                System.out.println("21.1");
                break;

            case "LIRA":
                System.out.println("2.23");
                break;
            default:
                System.out.println("MYNDAI VALUTA JOK:" );
                break;
        }
    }
}
