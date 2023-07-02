//Формат сдачи: ссылка на подписанный git-проект.
//Задание
//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.


import java.util.*;

public class Main5_Homework_Seminar5 {

    static void  Sort(Map<String, ArrayList> map){


        Set<String> keySet = map.keySet();

        int maxCount = 0;
        int minCount = 1000000;

        for(var item : map.entrySet()){
            if(maxCount < item.getValue().size())
               maxCount = item.getValue().size();
            if(minCount > item.getValue().size())
               minCount = item.getValue().size();


        }

        Stack<String> sta = new Stack<>();
        int number = minCount;
        while (number <= maxCount) {
            //System.out.println(map)
            for (var item : map.entrySet()) {
                if (item.getValue().size() == number) {
                    sta.push(item.getKey());
                }
            }
            number += 1;
        }
        //Распечатываем пары в порядке ключей, находящихся в стеке
        String name;

        for (int i = 0; i < keySet.size(); i++){
            name = sta.pop();
            for(var item : map.entrySet()){
                if (name.equals(item.getKey())) {
                    System.out.println();
                    System.out.println(item.getKey() + " " + item.getValue());
                }
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Map<String, ArrayList> num = new HashMap<>() {
            {
                put("Сергеев", new ArrayList<Integer>() {
                    {
                        add(834597);
                        add(897144);
                        add(923599);
                    }
                });
                put("Семенов", new ArrayList<Integer>() {
                    {
                        add(259597);
                        add(895544);
                        add(773559);
                    }
                });
                put("Шмель", new ArrayList<Integer>() {
                    {
                        add(838732);
                        add(322147);
                    }
                });
                put("Дорогин", new ArrayList<Integer>() {
                    {
                        add(774597);
                        add(812511);
                        add(927239);
                        add(925839);
                    }
                });
            }
        };
        System.out.println();

        System.out.println("Первичные номера: ");
        Sort(num);


        Scanner scan = new Scanner(System.in, "UTF-8");
        Boolean getOut = false;
        String str;

        while (!getOut) {
            System.out.println("Введите действие (1 - добавить номер, 6 - выйти):");
            str = scan.nextLine();
            String name = "";
            String phString;
            switch (str) {
                case "1": {
                    System.out.println("Введите фамилию: ");
                    name = scan.nextLine();
                    if (num.containsKey(name)) {
                        System.out.println("Такая фамилия есть");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номер телефона разделяя пробелом: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(" ");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item : arr) {
                            arrInt.add(Integer.parseInt(item.trim()));
                        }
                        num.put(name, arrInt);
                        System.out.println();
                        Sort(num);
                        break;
                    }
                }
                case "6":  {
                    getOut = true;
                    System.out.println();
                    System.out.println("Всего хорошего");
                    System.out.println();
                    break;
                }


            }

        }

    }

}











