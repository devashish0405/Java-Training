package collectionsjava.list01;

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


public class ListDemo{
    public static void main(String args[])
    {
        ArrayList<Person> A1 = new ArrayList<Person>();
        Person p1 = new Person("Ram","12345","kondapur");
        Person p2 = new Person("shyam","809708","Gachibowli");
        Person p3 = new Person("krishna","696969","kothaguda");
        Person p4 = new Person("Chaitanya","546366","Madhapur");
        A1.add(p1);
        A1.add(p2);
        A1.add(p3);
        A1.add(p4);

        System.out.println();

        Iterator it =A1.iterator();

        int c=0;

        while (it.hasNext()){
            Person pp1=(Person) it.next();
            String name=pp1.getName();
            pp1.setName(name+"-"+String.valueOf(c));
            c+=1;
            System.out.println(pp1.getName()+" "+pp1.getPhone()+" "+pp1.getAddress());
            System.out.println();
        }



        Iterator it1 =A1.iterator();


        while (it1.hasNext()){
            Person pp2=(Person) it1.next();
            System.out.println(pp2.getName()+" "+pp2.getPhone()+" "+pp2.getAddress());
            System.out.println();
        }
    }
}