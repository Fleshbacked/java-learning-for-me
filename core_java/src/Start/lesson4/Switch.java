package Start.lesson4;

public class Switch {
    public static void main(String[] args) {
        //1...Понедельник 7... Воскресенье
        int numberDay = 3;

        switch (numberDay) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("вторник");
            case 7 -> System.out.println("воскресенье");
            default -> System.out.println("Такого дня нет");
        }
    }
}
