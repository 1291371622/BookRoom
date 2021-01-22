package src;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 19:23
 */
public class Test9 {

    public static void main(String[] args) {
        int num = 0,sum = 0;
        while(num <= 1000){
            if(num == 40 || num == 48){
                ++num;
                continue;
            }
            if((num & 1) == 0){
                sum += num;
                if(sum >= 25000){
                    break;
                }
            }
            ++num;
        }
        System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为：" + sum);
    }

}
