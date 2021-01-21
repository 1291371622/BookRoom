package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 9:25
 */
public class exer5 {

    public static void main(String[] args) {
        double[] a = {2.1296,1.912,1.215,0.425,0.0625};
        double y;
        int i;
        double x = 1.0;
        DecimalFormat df1 = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.0000");
        y = a[4];
        for(i = 3;i >= 0;i--){
            y = y * x + a[i];
        }
        System.out.println("x=" + df1.format(x) + "," + "y=" + df2.format(y));
    }

}
