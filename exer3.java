package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 8:59
 */
public class exer3 {

    public static void main(String[] args) {
        int i = 0;
        double x,a = 1,b = 1.5,y = f(a);
        double e = 0.005;
        DecimalFormat df1 = new DecimalFormat("0.0000");
        DecimalFormat df2 = new DecimalFormat("0.00");
        if(y * f(b) >= 0){
            System.out.println("The range is error");
            return;
        }else {
            do{
                x = (a + b) / 2;
                System.out.println("x" + i + "=" + df1.format(x));
                i++;
                if(f(x) == 0){
                    break;
                }
                if(y * f(x) < 0){
                    b = x;
                }else {
                    a = x;
                }
            }while (Math.abs(b - a) > e);
            System.out.println("x" + i + "=" + df2.format(x));
        }
    }
    private static double f(double data){
        return ((data * data - 1) * data - 1);
    }

}
