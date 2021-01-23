package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/23 19:15
 */
public class Test20 {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String IP = s.next();
        wlist(IP);

    }

    public static void wlist(String IP) throws IOException {
        File file1 = new File("C:\\Users\\fish\\Desktop\\white_list.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file1));
        String line = "";
        int cou = 0;
        boolean flag = false;
        while ((line = buffer.readLine()) != null) {
            if (IP.equals(line)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "该IP地址可以访问网络" : "该IP地址不允许访问网络");
    }

}
