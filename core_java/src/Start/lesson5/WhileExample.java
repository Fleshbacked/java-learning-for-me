package Start.lesson5;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count < 100) {
            System.out.println(count);
            count++;
        } System.out.println("Закончилось");
        while (true) {
            count++;
            System.out.println(count);
            if (count == 120) {
                break;
            }
        }
    }
}
