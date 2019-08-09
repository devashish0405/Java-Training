package queue_01;

import java.util.*;

class Person{
    private String name;
    private String phone;
    private String address;

    Person(String name,String phone,String address)
    {
        this.name=name;
        this.phone=phone;
        this.address=address;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setPhone(String phone)
    {
        this.phone=phone;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}



public class Dequeue {
    public static void main(String[] args) {


        Person p1 = new Person("Ram", "12345", "kondapur");
        Person p2 = new Person("shyam", "809708", "Gachibowli");
        Person p3 = new Person("krishna", "696969", "kothaguda");
        Person p4 = new Person("Chaitanya", "546366", "Madhapur");
        Deque<Person> d1 = new LinkedList<Person>();
        d1.add(p1);
        d1.addFirst(p2);
        d1.add(p3);
        d1.add(p4);
        System.out.println(d1 + "\n");


        Iterator it1 =d1.iterator();


        while (it1.hasNext()){
            Person pp2=(Person) it1.next();
            System.out.println(pp2.getName()+" "+pp2.getPhone()+" "+pp2.getAddress());
            System.out.println();
        }

        Iterator reverse = d1.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());


    }
}