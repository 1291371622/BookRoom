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
 * @date 2021/1/23 18:37
 */
public class Test19 {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String word = s.next();
        findWord(word);

    }

    public static void findWord(String word) throws IOException {
        File file1 = new File("C:\\Users\\fish\\Desktop\\Test.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file1));
        String line = "";
        int cou = 0;
        while ((line = buffer.readLine()) != null) {
            String reg1 = "\\W+";//用非单词符来做分割，分割出来的就是一个个单词
            String[] str = line.split(reg1);
            for (String s : str) {
                if (word.equals(s)) {
                    ++cou;
                }
            }
        }
        System.out.println(word + "在文件中出现了" + cou + "次");
    }
}
