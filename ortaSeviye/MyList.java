import java.util.ArrayList;
import java.util.Arrays;

public class MyList<T> {
    private T[] arry;
    private int size = 0;
    private int capacity;

    // Boş constructor, varsayılan kapasiteyi 10 olarak ayarlar
    @SuppressWarnings("unhecked")
    public MyList() {
        this.capacity = 10;
        this.arry = (T[]) new Object[capacity];
    }

    // Kapasiteyi belirten constructor
    @SuppressWarnings("unhecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.arry = (T[]) new Object[capacity];
    }

    // Dizideki eleman sayısını döndürür
    public int size() {
        return this.size;
    }

    // Dizinin kapasitesini döndürür
    public int getCapacity() {
        return this.capacity;
    }

    // Diziye eleman ekler
    public void add(T data) {
        if (size == capacity) {
            growArry();
        }
        arry = Arrays.copyOf(arry, capacity);
    }

    // Diziyi 2 katına çıkarır
    @SuppressWarnings("unchecked")
    private void growArry() {
        capacity *= 2;
        arry = Arrays.copyOf(arry, capacity);
    }
    // Verilen indisteki değeri döndürür, geçersizse null döndürür
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return arry[index];
    }

    // Verilen indisteki veriyi siler, geçersizse null döndürür
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedValue = arry[index];
        for (int i = index; i < size - 1; i++) {
            arry[i] = arry[i + 1];
        }
        arry[--size] = null;
        return removedValue;
    }

    // Verilen indisteki veriyi değiştirir, geçersizse null döndürür
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldValue = arry[index];
        arry[index] = data;
        return oldValue;
    }

    // Listeyi string olarak döndürür
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arry[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Verilen öğenin ilk bulunduğu indeksi döndürür, yoksa -1 döndürür
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (arry[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Verilen öğenin son bulunduğu indeksi döndürür, yoksa -1 döndürür
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (arry[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Listenin boş olup olmadığını kontrol eder
    public boolean isEmpty() {
        return size == 0;
    }

    // Listedeki öğeleri bir dizi olarak döndürür
    public T[] toArray() {
        return Arrays.copyOf(arry, size);
    }

    // Listeyi temizler, elemanları sıfırlar
    public void clear() {
        for (int i = 0; i < size; i++) {
            arry[i] = null;
        }
        size = 0;
    }

    // Verilen indeks aralığındaki listeyi döndürür
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(arry[i]);
        }
        return subList;
    }

    // Listenin belirtilen öğeyi içerip içermediğini kontrol eder
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

}
