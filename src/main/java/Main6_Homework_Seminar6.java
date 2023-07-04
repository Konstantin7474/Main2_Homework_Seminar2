
import java.util.ArrayList;
import java.util.List;

public class Main6_Homework_Seminar6 {
    //Объявление приватного поля класса
    private List<Integer> numbers;

    //Иницилизация конструктора
    public Main6_Homework_Seminar6() {
    //Присвоение переменной
        numbers = new ArrayList<>();
    }

    //Добавляет элемент в коллекцию
    public void add(Integer number){
        if(!check(number)){
            numbers.add(number);
        }
    }

    //Проверяет наличие элемента
    public boolean check(Integer number){
        return numbers.contains(number);
    }

    //Возвращает элемент по указанному индексу
    public Integer get(int index){
        if (index >= 0 && index < numbers.size()){
            return numbers.get(index);
        }
        throw new IndexOutOfBoundsException("Index out of range: " + index);
    }

    //Возвращает строку со всеми элементами коллекции
    public String toString(){
        return numbers.toString();
    }


    public static void main(String[] args){
        Main6_Homework_Seminar6 set = new Main6_Homework_Seminar6();
        //Добавление элементов
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);//Вывод всех элементов
        System.out.println(set.get(2));// Выводит 3 элемент
        System.out.println(set.get(5));// Вызывает исключение


    }
}
