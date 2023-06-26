//Формат сдачи: ссылка на подписанный git-проект.
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main3_Homework_Seminar3 {

// 1.Здесь создаем произвольный список с заданными параметрами
    public static List<Integer> list_numbers(int size, int min, int max) {
        return IntStream
                .generate(() -> min + new Random().nextInt(max - min + 1))
                .limit(20)
                .boxed()
                .collect(Collectors.toList());
    }
//2. Создаем метод удаления четных чисел
    public static void delChetn(List<Integer> a){
        for (int i = a.size() - 1; i >= 0; i--){
            if (a.get(i) % 2 == 0){
                a.remove(i);
            }
        }
        System.out.println("Список после удаления четных чисел: " + a);
    }

//3. Создаем метод нахождения минимального числа.
    static  Integer minNum(List<Integer> a) {
        int min = a.get(0);
        for (int i = 0; i < a.size() - 1; i++){
            if(a.get(i) < min) {
                min = a.get(i);
            }
        }
        return min;
    }
//4. Создаем метод нахождения максимального числа.

    static  Integer maxNum(List<Integer> a) {
        int max = a.get(0);
        for (int i = 0; i < a.size() - 1; i++){
            if(a.get(i) > max) {
                max = a.get(i);
            }
        }
        return max;
    }
//5. Создаем метод нахождения среднего числа.
    static Double MidleNum(List<Integer> a){
        double sum = 0;
        double midle = 0;
        for(int i = 0; i < a.size() - 1; i++){
            sum += a.get(i);
        }
        midle = sum / a.size();
        return midle;
    }


    public static void main(String[] args) {
        List<Integer> a = list_numbers(20, 0, 101);
        System.out.println("Изначальный список: " + a);
        delChetn(a);
        System.out.println("Максимальное значение списка: " + maxNum(a));
        System.out.println("Минимальное значение списка: " + minNum(a));
        System.out.println("Среднее значение списка: " + MidleNum(a));


    }
}




