import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        // Foo x = new Foo() {
        //     @Override
        //     public void method() {
        //         System.out.println("Anonimus inner type");
        //     }
        // };

        // x.method();

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(111);
        arr.add(34);
        arr.add(555);

        Iterator<Integer> it = arr.iterator(); // на экземпляр нашей коллекции метод итератор и приводим к типу итератор...
        // это как создали ссылку на объект в памяти или создали еще объект, что значит привели???
        // вот так работает Iterator. 
        // вот так работает Iterator. hasNext(), next() и еще пара методов - это все для жтого 
        // 
        // public interface Iterator <E>{
     
        //     E next();
        //     boolean hasNext();
        //     void remove();
        // }

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //         
        // 
        // 

        
        System.out.println("Работа со своим классом");

        ArrayList<Worker> work = new ArrayList<Worker>();

        Worker w1 = new Worker("Max", 28);
        Worker w2 = new Worker("Inna", 18);
        Worker w3 = new Worker ("Puppy", 4);
        
        work.add(w1);
        work.add(w2);
        work.add(w3);

        Iterator<Worker> itWork = work.iterator();
        while (itWork.hasNext()) {
            System.out.println(itWork.next().name);
        }

        // Выдает имя и хеш адреса как есть в методе toString(); для объекта, пока его не переопределили.

        // А вот ходить по полям класса Iterator не может так

        // Work w4 = new Worker("iMax", 18);
        // Iterator<Worker> itW = itW.iterator(); - тут ошибка, но это и понятно
        // Получается нам нужно пройти по полям класс -для этого использовать интерфейс
        // для чего на классе где предусматриваем проход по полям имплипент интерфейс с типом через какой будем работать <String> или другой
        System.out.println();
        // Попробуем после добавления интерфейса в класс
        WorkerIterator worker = new WorkerIterator("Plum", "XXX", "18");
        Iterator<String> itW = worker;
        while (itW.hasNext()) {
            System.out.println(worker.next());
        }

        //Попробуем сортировать сохаднный аррейлист
        // Но сначала сделаем коллекцию чисел и отсортируем ее:
        ArrayList<Integer> col = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            col.add(r.nextInt(1, 100));
        }
        
        System.out.println(col);
    
        // for (Integer integer : col) {
        //     System.out.println(integer);
        // }

        Collections.sort(col); // Когда нам про Collections рассказывали?
        System.out.println(col);
        
        // Для чисел все сработало, пробуем длоя объектов
        System.out.print(work);
        // Collections.sort(work);
        
        
        
        
        
        
        // System.out.println();
        // work.sort(null); - не работает такая сортировка объектов

        // Collections.sort(arr);


    }

}
