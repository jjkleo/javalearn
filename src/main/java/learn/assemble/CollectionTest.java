package learn.assemble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {

    public static void main(String[] args){
        Collection c=new ArrayList();
        c.add("纪姿含");
        c.add(6);
        System.out.println("c集合中元素的个数："+c.size());
        c.remove(6);
        System.out.println(c.contains("纪姿含"));
        c.clear();
        System.out.println(c);

        Collection books=new HashSet();
        books.add("红楼梦");
        books.add("三国演义");
        books.add("西游记");
        books.forEach(obj-> System.out.println(obj));

        Iterator it=books.iterator();
        while(it.hasNext()){
            String book=(String)it.next();
            System.out.println(book);
            if(book.equals("红楼梦")){
                it.remove();
            }
            //使用Iterator迭代过程中，不可修改集合元素
            //books.remove(book);
        }
        System.out.println(books);
        it=books.iterator();
        it.forEachRemaining(obj-> System.out.println("迭代集合元素:"+obj));
    }
}
