import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // List list = new ArrayList();
        
        // for (int i = 0; i < 10; i++) {
        //     list.add(String.format("list %d", i));
        // }
        // // а если добавим число, то получится, что внутри арейлиста будут содержаться как строки так и числаж:
        // list.add(12345);
        // list.add(5);

        // System.out.println(list);
        // Замечание IDE-> Type safety: The method add(Object) belongs to the raw type List. References to generic type List<E> should be parameterized
        // То что может встетится разный тип, это не хорошо для последжующий работы
        // Защитились от такой потенциальной ошибки (работаем с котиками а пришел другой тип данных) - работа с обощениями
        // Пишем каким конкретным типом закрывается наш интерфейс (откуда такая терминология???)
        // List<String> = list = new ArrayList();
        // List<E> -> <E> - означает наперед неизвестный тип
        /// Класс тоже закрываем конкретным типом. И в JAVA можно описывать, можно не описывать:
        // List<String> list = new ArrayList<String>();
        // и 
        // List<String> list = new ArrayList<>();
        // ЭТО ОДНО ОДИНАКОВАЯ ЗАПИСЬ для JAVA
        // Но не тоже самое, что List<String> list = new ArrayList(), <> не поставлено

        Account user_one = new Account(1, 1000);

        System.out.printf("id: %s, sum: %s", user_one.getId(), user_one.getSum());
        
    }
}