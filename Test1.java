package src;

import java.util.Scanner;
import java.util.Stack;

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

        if (str.contains("(") || str.contains(")")) {
            char[] c = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < c.length; ++i) {
                if(c[i] == '('){
                    stack.push(c[i]);
                }else if(c[i] == ')' && !stack.isEmpty()){
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty() ? "你输入的内容，括号完全配对" : "您输入的内容，括号不配对");
        } else {
            System.out.println("您输入的内容没有括号");
        }
    }

}
