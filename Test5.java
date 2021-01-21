package src;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 模拟用户登录
 * @date 2021/1/21 21:21
 */
public class Test5 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("admin","admin@123");
        map.put("guess","123456");
        map.put("my","my_666");
        Scanner s = new Scanner(System.in);
        System.out.print("请输入账号:");
        String username = s.next();
        System.out.print("请输入密码:");
        String password = s.next();
        if(map.containsKey(username) && password.equals(map.get(username))){
            System.out.println("登陆成功");
        }else {
            System.out.println("你输入的账号或密码不正确");
        }
    }

}
