package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 18:25
 */
public class exer8 {
    public static void main(String[] args) {
        double x0,x1 = 11;
        DecimalFormat df1 = new DecimalFormat("0.00");
        do{
            x0 = x1;
            x1 = x0 - (x0 * x0 - 115)/(2 * x0);
        }while(Math.abs(x1 - x0) >= 0.005);
        System.out.println("x=" + df1.format(x1));
    }
}
