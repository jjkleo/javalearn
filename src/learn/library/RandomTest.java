package learn.library;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

    public static void main(String[] args){
        Random rand=new Random();
        System.out.println("rand.nextBoolean()="+rand.nextBoolean());
        byte[] buffer=new byte[16];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
        System.out.println("rand.nextDouble()="+rand.nextDouble());
        System.out.println("rand.nextFloat()="+rand.nextFloat());
        System.out.println("rand.nextGaussian()="+rand.nextGaussian());
        System.out.println("rand.nextInt()="+rand.nextInt());
        System.out.println("rand.nextInt(26)="+rand.nextInt(26));
        System.out.println("rand.nextLong()="+rand.nextLong());

        //多线程环境
        ThreadLocalRandom random=ThreadLocalRandom.current();
        int val1=random.nextInt(4,20);
        double val2=random.nextDouble(2.0,10.0);
    }
}
