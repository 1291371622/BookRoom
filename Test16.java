package src;

import java.util.HashMap;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description
 * @date 2021/1/22 21:17
 */
public class Test16 {

    public static void main(String[] args) {
        int[] arr = {2,8,6,2,7,3,9,2,8,6,7,9,1};
        int[] num1 = {0};
        int[] num2 = {0};
        FindNumsAppearOnce(arr,num1,num2);
    }

    public  static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < array.length; i++){
            if(map.containsKey(array[i]))
                map.put(array[i],2);
            else
                map.put(array[i],1);
        }
        int count = 0;
        for(int i=0; i < array.length; i++){
            if(map.get(array[i]) == 1){
                if(count == 0){
                    num1[0] =  array[i];
                    count++;
                }else
                    num2[0] =  array[i];
            }
        }
        System.out.println("只出现一次的数字是" + num1[0] + "和" + num2[0]);
    }

}
