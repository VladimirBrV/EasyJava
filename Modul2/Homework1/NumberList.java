package HomeWork.Modul2.Homework1;

import java.lang.reflect.Array;
import java.util.*;

public class NumberList <T> implements List <T> {

    private T[] array;
    private int size;
    private T Double;

    public NumberList(Class<T> clazz) {

        this.array = (T[]) Array.newInstance(clazz, 4);
    }

    @Override
    public boolean add(T t) {

        if (size >= array.length) {
            array = Arrays.copyOf(array, (int) (array.length * 1.5));
        }
        size++;
        for (int i = size-1; i >0 ; i--) {
            array[i]=array[i-1];
        }
        array[0]=t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean result = false;
        int count = 0;
        for (int i=0; i<size; i++) {
            if (o.equals(array[i])) {
                array[i] = null;
                result=true;
                count++;}
         else if (count>0) {
                array[i - count] = array[i];
                array[i] = null;
            }
         }
         size-=count;
        return result;
    }
    @Override
    public boolean contains(Object o) {
        int result = 0;
        for (T t : array) {
            if (t.equals(o)) {
                result++;
            }
        }
        return result >= 2;
    }
   public Integer sumInteger () throws Exception {
       int result = 0;
       for (int i = 0; i < size; i++) {
           if (!(array[i] instanceof Integer)) {
               throw new Exception("Ошибка число содержит другой тип");
           }
           result += ((Integer) array[i]).intValue();
       }
       return result;
   }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (T t : array) {
            if (t != null) {
                result += t.toString() + " ";
            }
        }
        return "NumberList{" +
                "array=" + result +
                ", size=" + size +
                '}';

    }
    }



