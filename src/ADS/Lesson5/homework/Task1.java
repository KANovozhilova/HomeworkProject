package ADS.Lesson5.homework;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(exponentiation(5, 3));     // 125
        System.out.println(exponentiation(0, 3));     // 0
        System.out.println(exponentiation(2, -4));    // 0,0625
        System.out.println(exponentiation(0, -10));   // выдавать ошибку
    }

    private static double exponentiation(double digit, int rank) {
        if (digit == 0) {
            if (rank > 0)
                return 0;
            else
                throw new IllegalArgumentException("Некорректная степень " + rank + " для 0!");
        }
        if (rank < 0) {
            return 1 / (digit * exponentiation(digit, -rank - 1));
        }
        else if (rank > 0) {
            return digit * exponentiation(digit, rank - 1);
        }
        else {
            return 1;
        }
    }
}
