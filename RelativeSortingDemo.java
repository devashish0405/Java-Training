package relativesorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
    String name;
    int rollno;
    String city;
    Person(String name,int rollno,String city){
        this.name=name;
        this.rollno=rollno;
        this.city=city;
    }
}

class ObjectSorting implements Comparator<Person>
{
    public int compare(Person a,Person b){
        return a.rollno-b.rollno;
    }

}

class ObjectSortingByName implements Comparator<Person>
{
    public int compare(Person a,Person b){
        return a.name.compareTo(b.name);
    }

}
public class RelativeSortingDemo {
    public static void main(String[] args) {
        Person p1=new Person("Ram",1,"Hyderabad");
        Person p2=new Person("shyam",3,"Delhi");
        Person p3=new Person("krishna",2,"Mumbai");
        Person p4=new Person("sai",10,"Bangalore");
        ArrayList<Person>persons=new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        Collections.sort(persons,new ObjectSorting());
        for(int i=0;i<persons.size();i++)
        {
            System.out.println(persons.get(i).name+" "+persons.get(i).rollno+" "+persons.get(i).city+" ");
        }
        Collections.sort(persons,new ObjectSortingByName());
    }
}
