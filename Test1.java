package src;

import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 判断一个字符串中的"( )"是否配对
 * @date 2021/1/21 19:43
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int left = 0, right = 0;//定义两个整数分别用来统计左括号或者右括号的数量
        if (str.contains("(") || str.contains(")")) {
            char[] c = str.toCharArray();
            for (int i = 0; i < c.length; ++i) {
                if ('(' == c[i]) {
                    ++left;
                }
                if (')' == c[i]) {
                    ++right;
                }
            }
            //左右括号如果匹配的话数量应该是相同的。
            System.out.println((left - right) == 0 ? "你输入的内容，括号完全配对" : "您输入的内容，括号不配对");
        } else {
            System.out.println("您输入的内容没有括号");
        }
    }

}
