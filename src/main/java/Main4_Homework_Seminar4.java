//Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//1.вывод в формате Фамилия И.О. возраст пол
// 2.добавить возможность выхода или вывода списка отсортированного по возрасту!)
// 3.*реализовать сортировку по возрасту с использованием индексов
// 4.*реализовать сортировку по возрасту и полу с использованием индексов



import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import java.util.Comparator;
import java.util.LinkedList;

public class Main4_Homework_Seminar4
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> people = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> malefemale = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String text = " ";
        FileReader reader = new FileReader("HW4.sql");
        while (reader. ready ()) {
            text += (char) reader. read();
        }
        reader.close();
        String [] str = text.split("\r\n");
        for (int i = 1; i < str.length; i++){
            String [] sb = str[i].split(" ");

            people.add(sb[0] + " ");
            name.add(sb[1].substring(0, 1) + ".");
            lastname.add(sb[2].substring(0, 1) + "." + " ");
            age.add(Integer.valueOf(sb[3]));
            malefemale.add(sb[4] == "M" ? true : false);
            index.add(i);
        }
        
        // new *
        //index. sort(new Comparator<Integer>() {
        //   new *
        //   @Override
        //   public int compare(Integer o1, Integer o2)  {
        //       return o2-o1;
        //   }        
        //});

        for (int i = 0; i < index.size(); i++){
            System.out.printf(people.get(i));
            System.out.printf(name.get(i));
            System.out.printf(lastname.get(i));
            System.out.printf(age.get(i).toString());
            System.out.printf((malefemale.get(i) ? " M" : " Ж"));
            System.out.println();
        }

            // System.out.println(family); 

            // System.out.println(sb[0] + " " + sb[1].charAt(0) + "." + sb[2].charAt(0) + "." + " " + sb[3] + " " + sb[4]);
        
    }
    
}