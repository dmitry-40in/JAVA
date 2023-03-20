import java.util.Iterator;

public class WorkerIterator implements Iterator<String> {
    String name;
    String birthday;
    String age;

    public WorkerIterator(String name, String birthday, String age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    int index = 0;
    @Override
    public boolean hasNext() {
        index = index + 1;
        return index < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("firstName: %s", name);
                // break;
            case 2:
                return String.format("firstName: %s", birthday);
                // break;
            // case 3:
            //     return String.format("age: %d", age);
            //     // break;
            default:
                return String.format("age: %s", age);
                
        }
    }
    
    // Думаю, это все таки искусственная итерация, тк мы говорим, что выводим строго 3 раза (от 0 до 2 включительно), за это отвечает метод hasNext()
    // в котором у нас индекс изменяется сколько мы ему позволим изначально.
    // и у нас свич кейз на строго поисанное количество циклов.
    
}
