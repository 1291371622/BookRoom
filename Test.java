package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 判断字符串中出现次数最多的字符
 * @date 2021/1/21 20:23
 */
public class Test {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] str2 = s.next().split("");
        HashMap<String, Integer> map = new HashMap<>();
        String str1 = "";
        int max = 0;
        for (String str : str2) {//map去重
            map.put(str, map.getOrDefault(str, 0));
            str1 += str;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            for (int i = 0; i < str2.length; ++i) {
                if (entry.getKey().equals(str2[i])) {
                    int cou = entry.getValue();
                    cou++;
                    map.put(entry.getKey(), cou);//统计字符出现的次数
                }
            }
            max = Math.max(max, entry.getValue());//得到一个出现最多的次数
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                str1 = str1.replace(entry.getKey(), "");//比对去除字符
            }
        }
        System.out.println(str1);
    }
}