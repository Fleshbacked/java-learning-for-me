package Start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
//        Сынок купи хлеба
        boolean isBougtBread = true;
//        Сынок купил молоко
        boolean isBoughtMilk = false;

//        And = логическое И, если два значения true, то тогда true, иначе false
        boolean isBoughtMilkAndBread = isBougtBread && isBoughtMilk;
//        boolean isBoughtMilkAndBread = true && true;
//        boolean isBoughtMilkAndBread = true && true;

//        boolean isBoughtMilkAndBread = false && true;
//        boolean isBoughtMilkAndBread = false;

        if (isBougtBread && isBoughtMilk) {
            System.out.println("Сынок ты молодец!");
        } else if (isBoughtMilk) {
            System.out.println("Сынок ты молодец купил хотяб молоко!");
        }else if (isBougtBread) {
            System.out.println("Сынок ты молодец купил хотяб хлеб!");
        }
        else {
            System.out.println("Сынок ты не молодец ты забыл хлеб и молоко");
        }
//        Or = логическое или, если хотябы одно значение true, то тогда true, только все значения false, то тогда false
//        boolean isBoughtMilkOrBread = true || true;
//        boolean isBoughtMilkOrBread = true
//        boolean isBoughtMilkOrBread = true || false;
//        boolean isBoughtMilkOrBread = true
//        boolean isBoughtMilkOrBread = false || false;
//        boolean isBoughtMilkOrBread = false;
//        Купил сладость или нет
        boolean isBoughtCandy = false;

//        Not = логическое не (!), которое переворачивает true на false и наоборот
        if (!isBoughtCandy) {
            System.out.println("Мама хвалит сына!");
        }
    }
}
