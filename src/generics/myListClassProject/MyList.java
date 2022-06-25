package generics.myListClassProject;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class MyList<T> {
    private T[] print;
    private T[] temp;
    private T[] list;
    private T[] arr;
    private int capacity;
    private int size;

    public boolean contains(T data) {
        for (T w : this.list) {
            if (w == data || data.equals(w)) {
                return true;
            }
        }
        return false;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> altlistem = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            altlistem.add(this.list[i]);
        }
        return altlistem;
    }

    public void clear() {
        this.list = (T[]) new Object[10];
        this.size = 0;
    }

    public T[] toArray() {
        //T [] arr = (T[]) new Object[this.size];
        arr = (T[]) new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            arr[i] = this.list[i];
        }
        return arr;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int lastIndexOf(T data) {
        for (int i = this.size - 1; i >= 0; i--) {
            if (this.list[i] == data || this.list[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i] == data || this.list[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public String set(int index, T data) {
        if (index >= this.size || index < 0) {
            return null;
        } else {
            this.list[index] = data;
        }
        return "Yeni Değer Set Edildi.";
    }

    public String remove(int index) {
        if (index >= this.size || index < 0) {
            return null;
        } else {
            this.temp = (T[]) new Object[this.capacity];
            int remainingElements = this.capacity - (index + 1);
            System.arraycopy(this.list, 0, this.temp, 0, index);
            System.arraycopy(this.list, index + 1, this.temp, index, remainingElements);
            this.size--;
            this.list = this.temp;
        }
        /*
        System.arraycopy(Kaynak dizi, Kaynak dizi’nin başlangıç index’i, Hedef dizi, Hedef dizi’nin başlangıç index’i,  Adedi);
        Kaynak dizi: Kaynak dizinin adı yazılır.
        Kaynak dizi’nin başlangıç index’i: Kaynak dizi’nin kaçıncı indexten itibaren eleman kopyalanacağı belirtilir.
        Hedef dizi: Hangi diziye kopyalanacaksa o dizinin adı yazılır.
        Hedef dizi’nin başlangıç index’i: Kaynak dizi’nin, hedef dizi’nin kaçıncı index elemanından itibaren kopyalanacağı belirtilir.
        Adedi: Kopyalanacak olan elemanların sayısı belirtilir.
         */
        return "Silme İşlemi Başarılı.";
    }

    public T get(int index) {
        if (index >= this.size || index < 0) {
            return null;
        } else {
            return this.list[index];
        }
    }

    public MyList() {
        this.list = (T[]) new Object[10];
        this.capacity = 10;
    }

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public void add(T data) {
        if (this.size == this.capacity) {
//          CAPACİTY'Yİ OTOMATİK ARTIRIYOR VE YENİ ARRAY OLUŞTURUYOR;
            this.capacity += 10;
            this.list = Arrays.copyOf(this.list, this.capacity);
        }
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == null) {
                this.list[i] = data;
                this.size++;
                break;
            }
        }
    }

    public int size() {
        int count = 0;
        for (T w : list) {
            if (w != null) {
                count++;
            }
        }
        this.size = count;
        return size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

