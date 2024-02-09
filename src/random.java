import java.util.Random;

public class random{
    public static void main(String[]ags){
        Random random = new Random();
        int a = random.nextInt(1,1000);
        System.out.println(a);
    }

    public static class phone1 {

            String name;

            String model;

            String colour;

            double price;

            public void sendMessage(String message){
                System.out.println(message);

            }
        }
}
