package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 8:28
 */
public class exer1 {

    public static void main(String[] args) {
        double x0,x1 = 1;
        int i = 1;
        DecimalFormat df = new DecimalFormat("#0.0000");
        do{
            x0 = x1;
            x1 = Math.log10(x0 + 2);
            System.out.println("x" + i + "=" + df.format(x1));
            i++;
        }while(Math.abs(x1 - x0) >= 0.00005);
        System.out.println("x=" + df.format(x1));
        System.out.println("f(x)=" + df.format(Math.abs(x1 - Math.pow(10,x1) + 2)));
    }

}
