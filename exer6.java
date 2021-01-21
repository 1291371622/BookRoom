package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/21 9:37
 */
public class exer6 {

    public static void main(String[] args) {
        int i,j,k;
        int mi;
        int n = 3;
        double mv,tmp;
        double a[][] = {{0.01,2,-0.5},{-1,-0.5,2},{5,-4,0.5}};
        double b[] = {-5,5,9};
        double[] x = new double[n];
        DecimalFormat df1 = new DecimalFormat("0.00");
        for(k = 0; k < n - 1;k++) {
            mi = k;
            mv = Math.abs(a[k][k]);
            for (i = k + 1; i < n; i++) {
                if (Math.abs(a[i][k]) > mv) {
                    mi = i;
                    mv = Math.abs(a[i][k]);
                }
                if (mi > k) {
                    tmp = b[k];
                    b[k] = b[mi];
                    b[mi] = tmp;
                    for (j = k; j < n; j++) {
                        tmp = a[k][j];
                        a[k][j] = a[mi][j];
                        a[mi][j] = tmp;
                    }
                }
                for (i = k + 1; i < n; i++) {
                    tmp = a[i][k] / a[k][k];
                    b[i] = b[i] - b[k] * tmp;
                    for (j = k + 1; j < n; j++) {
                        a[i][j] = a[i][j] - a[k][j] * tmp;
                    }
                }
            }
        }
                x[n-1]=b[n-1]/a[n-1][n-1];
                for(i=n-2;i>=0;i--){
                    x[i]=b[i];
                    for(j=i+1;j<n;j++){
                        x[i]=x[i]-a[i][j]*x[j];
                    }
                    x[i]=x[i]/a[i][i];
                }
                System.out.println("The result is");
                for (i = 0;i < n;i++){
                    System.out.println("x" + i + "=" +  df1.format(x[i]));
                }
            }
        }

