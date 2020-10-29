package ADS.base;

public class CustomArrayIndexOutOfBoundException extends RuntimeException {
    public CustomArrayIndexOutOfBoundException(int index, int size) {
        super(String.format("Некорректный индекс %d для массива длинной %d", index, size));
    }
}
