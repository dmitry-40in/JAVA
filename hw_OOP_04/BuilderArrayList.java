import java.util.ArrayList;
import java.util.List;

public class BuilderArrayList<T> {
    public List<T> array;

    public BuilderArrayList() {
        this.array = new ArrayList<T>();
    }

    // ??????how
    // public BuilderArrayList(T[] data) {
    //     // super();
    // }

    public void addData(T data) {
        array.add(data);
    }

    public void removeElementIndex(int index) {
        array.remove(index); 
    }

    public int lengthArray() {
        return this.array.size();
    }





    public T getElement(List<T> array, int index) {
        return array.get(index);
    }

    public void removeElementsData(T data) {
       for (int i = 0; i < array.size(); i++) {
        if (array.get(i).equals (data)) {
            array.remove(i);
            i--;
        }
       }
    }

    @Override
    public boolean equals(Object obj) {
        // 
        return super.equals(obj);
    }






    public void printData() {
        for (T t : this.array) {
            System.out.println(t.getClass().getName());
        }
    }

}
