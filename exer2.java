package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 8:52
 */
public class exer2 {

    public static void main(String[] args) {
        double x0,x1 = 0.5;
        int i = 1;
        DecimalFormat df1 = new DecimalFormat("0.00000");
        DecimalFormat df2 = new DecimalFormat("0.000");
        do{
            x0 = x1;
            x1 = Math.exp(-x0);
            System.out.println("x" + i + "=" + df1.format(x1));
            i++;
        }while (Math.abs(x1 - x0) > 0.001);
        System.out.println("x=" + df2.format(x1));
    }

}
