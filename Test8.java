package src;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 19:18
 */
public class Test8 {

    public static void main(String[] args) {
        int cou = 30,count = 0;
        while(count <= 11){
            if((cou & 1) == 1){
                System.out.println(cou);
                ++count;
            }
            --cou;
        }
    }

}
