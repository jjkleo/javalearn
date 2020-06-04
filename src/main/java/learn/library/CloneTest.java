package learn.library;


import java.util.Collection;

class Address{
    String detail;
    public Address(String detail){
        this.detail=detail;
    }
}

class CloneTest_User implements Cloneable{
    int age;
    Address address;
    public CloneTest_User(int age){
        this.age=age;
        address=new Address("浙江杭州");
    }
    public CloneTest_User clone() throws CloneNotSupportedException {
        return (CloneTest_User) super.clone();
    }
}


public class CloneTest {


    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest_User u1=new CloneTest_User(29);
        CloneTest_User u2=u1.clone();
        //浅克隆
        System.out.println(u1==u2);
        System.out.println(u1.address==u2.address);
    }
}

