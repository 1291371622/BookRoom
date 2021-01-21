package src;

import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 回文数
 * @date 2021/1/21 20:40
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(str.equals(buffer.reverse().toString()) ? "该字符串是一个回文数" : "该字符串不是一个回文数");
    }

}
