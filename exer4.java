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
public class exer4 {

    public static void main(String[] args) {
        double x = 0,a = 1,b = 1.5,y = f1(a);
        DecimalFormat df1 = new DecimalFormat("0.0000");
        DecimalFormat df2 = new DecimalFormat("0.00");
        if(y * f1(b) >= 0){
            System.out.println("The range is error");
            return;
        }else {
            for(int i = 0;i <= 6;i++){
                x = (a + b) / 2;
                System.out.println("x" + i + "=" + df1.format(x));
                if(f1(x) == 0){
                    break;
                }
                if(y * f1(x) < 0){
                    b = x;
                }else {
                    a = x;
                }
            }
            System.out.println("x" + "=" + df2.format(x));
    }
}

    private static double f1(double a) {
        return ((a * a - 1) * a - 1);
    }
    }
