package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 18:29
 */
public class exer9 {
    public static void main(String[] args) {
        double x0,x1 = 4;
        int i = 0;
        DecimalFormat df1 = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.000");
        System.out.println("x" + i + "=" + df2.format(x1));
        i++;
        do{
            x0 = x1;
            x1=x0-((((x0-2)*x0-4)*x0)-7)/((3*x0-4)*x0-4);
            System.out.println("x" + i + "=" + df2.format(x1));
            i++;
        }while(Math.abs(x1 - x0) >= 0.01);
        System.out.println("x" + i + "=" + df1.format(x1));
    }
}
