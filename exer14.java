package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/23 11:24
 */
public class exer14 {

    public static void main(String[] args) {
        float[] x = {1.1275f,1.1503f,1.1735f,1.972f};
        float[] y = {0.1191f,0.13954f,0.15932f,0.17903f};
        int i,j;
        float c,f,t;
        DecimalFormat df1 = new DecimalFormat("0.0000");
        c = 1.13f;
        f = 0;
        for(i = 0;i <= 3;i++){
            t = 1;
            for(j = 0;j <= 3;j++){
                if(j!=i){
                    t = t * (c - x[j])/(x[i] - x[j]);
                }
            }
            f = f + t * y[i];
        }
        System.out.println("f" + "(" + df1.format(c) + ")"+ "=" + df1.format(f));
    }

}
