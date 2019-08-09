package Java01;

class TestHelper
{
    static int a=10;
    static {
        System.out.println("static block in Test Helper");
    }
    TestHelper(){
        System.out.println("Constructor in Test Helper");
    }
}

class ReflectionDemo{
    static{
        System.out.println("static block in reflection Demo");
    }
    ReflectionDemo(){
        System.out.println("Constructor in reflection demo");
    }
}
public class ReflectionTest {
    public static void main(String args[]) throws Exception
    {
        System.out.println(TestHelper.a);
       TestHelper th1=new TestHelper();
       TestHelper th2=new TestHelper();

       Class myClass = Class.forName("Java01.ReflectionDemo");
       String d=myClass.getName().toString();
       Object obj =myClass.newInstance();
       System.out.println(d);
    }
}

