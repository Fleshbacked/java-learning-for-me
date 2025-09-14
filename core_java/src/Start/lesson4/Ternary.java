package Start.lesson4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 20;
        int moneyAfterForShop = money - breadPrice;
        int childMoney = moneyAfterForShop >= 50 ? 10 : 5;
        moneyAfterForShop -= moneyAfterForShop >= 50 ? 10 : 5;

        System.out.println(childMoney);
        System.out.println(moneyAfterForShop);
//        if (moneyAfterForShop >= 50) {
//            childMoney = 10;
//            moneyAfterForShop -= 10;
//        }else {
//            childMoney = 5;
//            moneyAfterForShop -= 5;
//        }
    }
}
