package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 18:33
 */
public class exer10 {

    public static void main(String[] args) {
        int MAX = 100;
        int n = 3;
        double exp = 0.005;
        float temp,s;
        float[][] a = {{10,0,-1},{-2,10,-1},{0,-1,5}};
        float[] b = {9,7,4};
        float[] x = {0,0,0};
        float[][] B = new float[n][n];
        float[] g = new float[n];
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
                temp = 0.0f;
                for(int i = 0;i < n;i++){
                    s=x[i];
                    x[i]=g[i];
                    for(int j = 0;j < n;j++){
                        x[i]=x[i]+B[i][j]*x[j];
                    }
                    if (Math.abs(x[i]-s)>temp){
                        temp=Math.abs(x[i]-s);
                    }
                }
                m++;
                System.out.println(m + "th result is:");
                System.out.println("x0=" + df1.format(x[0]) + ",x1=" + df1.format(x[1]) + ",x2=" + df1.format(x[2]));
                System.out.println("temp=" + df2.format(temp));
            }while(temp >= exp);
            System.out.println();
            System.out.println("The last result is:");
            for(int i = 0;i < n;i++){
                System.out.println("x[" + i + "]=" + df1.format(x[i]));
            }
        }
    }
