package src;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 19:15
 */
public class Test7 {

    public static void main(String[] args) {
        new Demo().Countmax(6, 12);
        new Demo().Countmax(6, 12, 10);
        new Demo().Countmax(19.35, 28.99, 65.99);
        new Demo().Countmax(9.58, 18.65);
    }

}

class Demo {
    public Demo() {

    }


    public void Countmax(int a, int b) {
        System.out.println(a + "," + b + "的最大值为：" + Math.max(a, b));
    }

    public void Countmax(int a, int b, int c) {
        System.out.println(a + "," + b + "," + c + "的最大值为：" + Math.max(Math.max(a, b), c));

    }

    public void Countmax(double a, double b) {
        System.out.println(a + "," + b + "的最大值为：" + Math.max(a, b));

    }

    public void Countmax(double a, double b, double c) {
        System.out.println(a + "," + b + "," + c + "的最大值为：" + Math.max(Math.max(a, b), c));

    }
}