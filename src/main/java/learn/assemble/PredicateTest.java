package learn.assemble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PredicateTest{
    public static void main(String[] args){
        Collection books=new HashSet();
        books.add(new String("轻量级JAVAEE企业应用实战"));
        books.add(new String("Vue.js实战"));
        books.add(new String("博弈论"));
        books.add(new String("SysML DISTILLED"));
        books.add(new String("Webpack 深入浅出"));
        books.removeIf(ele->((String)ele).length()<10);
        System.out.println(books);
    }
}
