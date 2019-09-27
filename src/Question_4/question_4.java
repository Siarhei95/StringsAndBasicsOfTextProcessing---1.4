package Question_4;//В строке найти количество чисел.
import java.util.*;


public class question_4 {
    public static void main(String[] args) {
        String someWords = ";21-car; 23-motors; 302 - bicycles ant etc.(5)";
        int count = 0;
        Integer i1[] = new Integer[someWords.length()];
        for (int i = 0; i < someWords.length(); i++) {   //через метод Character.isDigit() — определим, является ли указанное значение типа char цифрой.
            if (Character.isDigit(someWords.charAt(i))) {    //метод charAt() — возвратит символ, расположенный по указанному индексу (i) строки.
                i1[i] = Character.getNumericValue(someWords.charAt(i)); //переводим char в int, c использованием метода getNumericValue, класса Character
            }
        }
            Set<Integer> deleter = new HashSet<>(Arrays.asList(i1)); //удаленим дубликаты
            System.out.println(deleter);    //выводим числа без повторений

    }
}
