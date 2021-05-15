package ua.training;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
    /*
    Сделать массив int. Из него получить IntStream. Для него
    1. Найти среднее значение элементов массива
    2. Найти минимальный элемент, значение и индекс
    3. Посчитать количество элементов равных нулю
    4. Посчитать количество элементов больше нуля
    5. Помножить элементы массива на число
     */
        int array [] = {5, 7, 3, 2, 8, 1};
        Arrays.stream(array);
        OptionalDouble avg = Arrays.stream(array).average();
        System.out.println("Average is " + avg);
        int min = IntStream.of(5, 7, 3, 2, 8, 1).min().getAsInt();
        //It can be easy solved using takeWhile() method from Java9
        int index =
                IntStream.of(5, 7, 3, 2, 8, 1).boxed().collect(Collectors.toList()).indexOf(min);
        System.out.println("Minimum is " + min + " ,minimum index is " + index);
        long zero = IntStream.of(5, 7, 3, 0, 8, 1).filter(x -> x == 0).count();
        System.out.println("Are equal to zero " + zero);
        long positive =
                IntStream.of(5, 7, 3, 2, -8, 1).filter(x -> x > 0).count();
        System.out.println("Are positive " + positive);
        IntStream.of(5, 7, 3, 2, 8, 1).map(x -> x * 5).forEach(x -> System.out.print(x + " "));

    }
}
