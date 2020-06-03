package learn.library;

public class StringBuilderTest {

    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append("Java");
        sb.insert(0,"hello ");
        sb.replace(5,6,",");
        sb.delete(5,6);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        //程序通常无须关心capacity属性
        System.out.println(sb.capacity());
        sb.setLength(6);
        System.out.println(sb);

    }
}
