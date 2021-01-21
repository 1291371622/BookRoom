package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/23 10:47
 */
public class exer11 {
    public static void main(String[] args) {
        int MAX = 100;
        int n = 3;
        double exp = 0.005;
        float temp,s;
        float[][] a = {{10,0,-1},{-2,10,-1},{0,-1,5}};
        float[] b = {9,7,4};
        float[] x = new float[n];
        float[][] B = new float[n][n];
        float[] g = new float[n];
        float[] y = {0,0,0};
        DecimalFormat df1 = new DecimalFormat("0.00000");
        DecimalFormat df2 = new DecimalFormat("0.000000");
        for(int i = 0;i < n;i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = -a[i][j] / a[i][i];
                g[i] = b[i] / a[i][i];
            }
        }
        for(int i = 0;i < n;i++){
            B[i][i] = 0;
        }
        int m = 0;
        do{
            for(int i = 0;i < n;i++) {
                x[i] = y[i];
            }
            for(int i = 0;i < n;i++){
                y[i] = g[i];
                for(int j = 0;j < n;j++){
                    y[i]=y[i]+B[i][j]*x[j];
                }
            }
            m++;
            System.out.println(m + "th result is:");
            System.out.println("x0=" + df1.format(y[0]) + ",x1=" + df1.format(y[1]) + ",x2=" + df1.format(y[2]));
            temp = 0;
            for(int i = 0;i < n;i++){
                s = Math.abs(y[i] - x[i]);
                if(temp < s){
                    temp = s;
                }
            }
            System.out.println("temp=" + df2.format(temp));
        }while(temp >= exp);
        System.out.println();
        System.out.println("The last result is:");
        for(int i = 0;i < n;i++){
            System.out.println("x[" + i + "]=" + df1.format(y[i]));
        }
    }
}
