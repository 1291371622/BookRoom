package src;

import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 21:18
 */
public class Test17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String str = s.next();
            if("GET".equals(str)){
                //math.random()范围是[0.0, 1.0)，那么math.random()*9+1一定是小于10的，(Math.random()*9+1)*100000一定是<10*100000=1000000的一个数
                System.out.println((int)((Math.random()*9+1)*100000));
            }
        }
    }

}
