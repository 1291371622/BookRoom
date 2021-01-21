package src;

import java.text.DecimalFormat;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2020/10/23 11:18
 */
public class exer13 {

    public static void main(String[] args) {
        float x1,x2 = 0f;
        float y1,y2 = 1f;
        float h = 0.2f;
        int i;
        DecimalFormat df1 = new DecimalFormat("0.000");
        for(i = 1;i <= 2;i++){
            x1 = x2;
            y1 = y2;
            x2 = x1 + h;
            y2 = y1 + h * f(x1,y1);
            y2 = (float) (y1 + 0.5 * h * (f(x1,y1) + f(x2,y2)));
            System.out.println("y" + i + "=" + df1.format(y2));
        }
    }
    public static float f(float x, float y){
        return (x + y);
    }

}
