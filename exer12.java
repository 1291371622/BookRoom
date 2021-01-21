package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/23 10:53
 */
public class exer12 {

    public static void main(String[] args) {
        int i,j,k,r;
        int n = 3;
        float s;
        float[][] a = {{1,2,-1},{1,-1,5},{4,1,2}};
        float[] b = {3,0,2};
        float[] x = new float[n];
        float[] y = new float[n];
        float[][] l = new float[n][n];
        float[][] u = new float[n][n];
        DecimalFormat df1 = new DecimalFormat("0.000");

        for(i = 0;i < n;i++){
            l[i][i] = 1;
        }
        for(k = 0;k < n;k++){
            for(j = k;j < n;j++){
                s = 0;
                for(r = 0;r < k;r++){
                    s = s + l[k][r] * u[r][j];
                }
                u[k][j] = a[k][j] - s;
            }
            for(i = k + 1;i < n;i++){
                s = 0;
                for(r = 0;r < k;r++){
                    s = s + l[i][r] * u[r][k];
                }
                l[i][k] = (a[i][k] - s) / u[k][k];
            }
        }
        for(i = 0;i < n;i++){
            s = 0;
            for(j = 0;j < i;j++){
                s = s + l[i][j] * y[j];
            }
            y[i] = b[i] - s;
        }
        for(i = n - 1;i >= 0;i--){
            s = 0;
            for(j = n - 1;j >= i + 1;j--){
                s = s + u[i][j] * x[j];
            }
            x[i] = (y[i] - s)/u[i][i];
        }
        System.out.println("The result is:");
        for(i = 0;i < n;i++){
            System.out.println("x" + i + "=" + df1.format(x[i]));
        }
    }

}
