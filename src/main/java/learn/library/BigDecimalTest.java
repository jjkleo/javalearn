package learn.library;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args){
        BigDecimal f1=new BigDecimal("0.05");
        BigDecimal f2=BigDecimal.valueOf(0.01);
        System.out.println("0.05+0.01 = "+f1.add(f2));
        System.out.println("0.05-0.01 = "+f1.subtract(f2));
        System.out.println("0.05*0.01 = " + f1.multiply(f2));
        System.out.println("0.05/0.01 = " + f1.divide(f2));
    }
}
