package src;

import java.io.File;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/23 10:29
 */
public class Test18 {

    public static void main(String[] args) {
        File f = new File("src");
        //File f = new File("src\\src");
        seekFile(f);
    }

    public static void seekFile(File file) {
        if (file.isDirectory()) {
            //listFile()得到的是一个 File 类型的数组，返回的是该目录中的文件和目录。
            File[] files = file.listFiles();
            for (File f : files) {
                //判断是否是文件对象
                if (f.isFile()) {
                    System.out.println(f.getName());
                } else if (f.isDirectory()) {
                    //是一个目录对象
                    seekFile(f);
                }
            }
        }
    }
}

