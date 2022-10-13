package HomeWork.Modul2.Homework1;

import HomeWork.Modul2.Homework1.NumberList;

public class MyNumberList  {

    public static void main(String[] args) {

        NumberList<String> myList = new NumberList<>(String.class);
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");

        System.out.println(myList);

        NumberList<Integer> myList2 = new NumberList<>(Integer.class);

        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(3);
        myList2.add(3);

        System.out.println(myList2.remove(3));
        System.out.println();

        NumberList<String> myList3 = new NumberList<>(String.class);
        myList3.add("1");
        myList3.add("2");
        myList3.add("3");
        myList3.add("4");
        System.out.println(myList3.remove(myList3));
        System.out.println();

    }
}
