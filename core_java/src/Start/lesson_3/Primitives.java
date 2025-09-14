package Start.lesson_3;

public class Primitives {
    public static void main(String[] args) {
        //Логический значения (булевы значения)
        //ИСТИНА -> true -> Да -> 1
        boolean answerSanya = true;
        //ЛОЖЬ -> false -> Нет -> 0
        boolean answerAndrew = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число состоящее из 2 байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        //Double - число с плавающей точкой, 64bit
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32bit
        float CocaCola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;
       // System.out.println(doubleNumber);
       // System.out.println(floatNumber);

        //Char - character - Символ состоящий из 16 bit
        char letter = 70;
        System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);

    }
}
