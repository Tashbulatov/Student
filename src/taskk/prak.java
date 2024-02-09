package taskk;

public class prak {
    public static void main(String[] args) {
        int sum = sun(1, 300);
        System.out.println("1-ден 300-ге чейинген сандардын арасында 3ке, 4ке жана 5ке калдыксыз болунгон сандардын суммасы: " + sum);
    }
    public static int sun(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
