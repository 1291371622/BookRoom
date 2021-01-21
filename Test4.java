package src;

import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 数组元素交换
 * @date 2021/1/21 21:07
 */
public class Test4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.next().split(",");
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length - 1; i >= 0; --i) {
            if (i == 0) {
                buffer.append(str[i]);
            } else {
                buffer.append(str[i] + ",");
            }
        }
        System.out.println(buffer.toString());
    }

}
