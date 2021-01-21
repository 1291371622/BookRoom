package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/23 11:34
 */
public class exer15 {

    public static void main(String[] args) {
        float[] x = {0.4f,0.55f,0.8f,0.9f,1.0f};
        float[] y = {0.41075f,0.57815f,0.88811f,1.02652f,1.17520f};
        int i,k;
        float c,p;
        DecimalFormat df1 = new DecimalFormat("0.000000");
        DecimalFormat df2 = new DecimalFormat("0.00");
        for(k = 1;k <= 4;k++){
            System.out.println(k + "th is:");
            for(i = 4;i >= k;i--){
                y[i] = (y[i] - y[i - 1]) / (x[i] - x[i - k]);
                System.out.println(df1.format(y[i]));
            }
        }
        c = 0.5f;
        System.out.println("p[" + df2.format(c) + "]=" + df1.format(y[0]+y[1]*(c-x[0])+y[2]*(c-x[0])*(c-x[1])+y[3]*(c-x[0])*(c-x[1])*(c-x[2])+y[4]*(c-x[0])*(c-x[1])*(c-x[2])*(c-x[3])));
        p = y[4];
        for(i = 3;i >= 0;i--){
            p = p * (c - x[i]) + y[i];
        }
        System.out.println("Qinjiushaofangfa:p[" + df2.format(c) + "]" + df1.format(p));
    }

}
