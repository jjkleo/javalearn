package learn.library;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

class User{
    String name;
    static int MAX_AGE;
}

public class VarHandle {
    public static void main(String[] args) throws Throwable{
        var sa=new String[]{"Java","Kotlin","Go"};
        var avh= MethodHandles.arrayElementVarHandle(String[].class);
        var r=avh.compareAndSet(sa,2,"Go","Lua");
        System.out.println(r);
        System.out.println(Arrays.toString(sa));
        System.out.println(avh.get(sa,1));
        System.out.println(avh.getAndSet(sa,2,"Swift"));
        System.out.println(Arrays.toString(sa));

        var vhl=MethodHandles.lookup().findVarHandle(User.class,"name", String.class);
        var user=new User();
        System.out.println(vhl.get(user));
        vhl.set(user,"纪姿含");
        System.out.println(user.name);

        var vh2=MethodHandles.lookup().findStaticVarHandle(User.class,"MAX_AGE",int.class);
        System.out.println(vh2.get());
        vh2.set(100);
        System.out.println(User.MAX_AGE);
    }
}
