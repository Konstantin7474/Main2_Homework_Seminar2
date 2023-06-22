// Формат сдачи: ссылка на подписанный git-проект.
// Задание
//Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
import java.util.HashMap;
import java.util.Map;

public class Main2_Homework_Seminar2 {
    //1. Формируем строку, используя структуру данных HashMap,   из параметров фильтрации и печатаем методом select.
    public static void main(String[] args) {
        Map<String, String> parametr = new HashMap<String, String>();
        parametr.put("name", "Ivanov");
        parametr.put("country", "Russia");
        parametr.put("city", "Moscow");
        parametr.put("age", "null");
        System.out.println(select(parametr));
    }

    //2. Метод select ,с помощью которого происходит соединение параметров из заданной строки.
    public static String select(Map<String, String> parametrs) {
        StringBuilder s = new StringBuilder();

        for (Map.Entry<String, String> pair : parametrs.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = '" + pair.getValue() + "'  ");
            }
        }
        s.delete(s.toString().length() - 2, s.toString().length());
        return s.toString();
    }
}



