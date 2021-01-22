package src;

import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 21:05
 */
public class Test15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String str = "";
            str += s.next();
        String[] split = str.split(",");
        int a = Integer.valueOf(split[0]);
        int b = Integer.valueOf(split[1]);
        try {
            int i = a / b;
            System.out.println(i);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}
