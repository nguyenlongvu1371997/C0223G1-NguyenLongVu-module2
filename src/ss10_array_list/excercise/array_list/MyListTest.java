package ss10_array_list.excercise.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(0,"Vu");
        myList.add(1,"Vu1");
        myList.add(2,"Vu2");
        myList.add(3,"Vu3");
        myList.add(4,"Vu4");
        System.out.println(myList.remove(2));
        System.out.println(myList.get(2));
        System.out.println(myList.toString());
    }
}
