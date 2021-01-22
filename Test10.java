package src;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description .
 * @date 2021/1/22 19:33
 */
public class Test10 {

    public static void main(String[] args) {
        int score = 369;
        int CutLine = 451;
        System.out.println("您的高考总分:" + 369);
        System.out.println("第一批本科录取分数线:" + 451);
        System.out.println("高考结果:" + (score > CutLine ? "通过一本录取分数线" : "未通过一本录取分数线"));
    }

}
