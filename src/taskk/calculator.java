package taskk;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sun, sun2, result = 0;
        char operator, choice = 'y';
        while(choice == 'y') {
            Label: System.out.print("Введите два числа: ");
            sun = sc.nextDouble();
          sun2  = sc.nextDouble();
            System.out.print("Введите операцию, которую необходимо выполнить ( +, -, *, /, %, ^ ): ");
            operator = sc.next().charAt(0);
            switch(operator) {
                case '+':
                    result = sun + sun2;
                    break;
                case '-':
                    result = sun - sun2;
                    break;
                case '*':
                    result = sun * sun2;
                    break;
                case '/':
                    result = sun / sun2;
                    break;
                case '%':
                    result = sun % sun2;
                    break;
                case '^':
                    result = Math.pow(sun, sun2);
                    break;
                default:
                    System.out.println("\nМетод... ");
                    System.exit(0);
            }
            System.out.println("\n" + sun + " " + operator + " " + sun2 + " = " + result);
            System.out.print("\nВы хотите продолжить?( y / n): ");
            choice = sc.next().charAt(0);
            System.out.println();
        }
    }
}