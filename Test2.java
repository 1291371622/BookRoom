package src;

/**
 * @author xu yan
 * @version V1.0.0
 * @projectName idea
 * @package src
 * @description 数组元素交换
 * @date 2021/1/21 19:55
 */
public class Test2 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 8, 0, 4, 6, 7};
        swap(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);//91387460 不知道这样对不对，没看懂示例啥意思
        }
    }

    public static void swap(int[] arr1) {
        int max = arr1[0],min = arr1[0];//设置两个计数器
        int ax = 0,in = 0;//定位数据在数组的位置
        for(int i = 0;i < arr1.length;++i){
            if(max < arr1[i]){
                max = arr1[i];
                ax = i;
            }
            if(min > arr1[i]){
                min = arr1[i];
                in = i;
            }
        }
        int maxtemp = arr1[ax];
        arr1[ax] = arr1[0];
        arr1[0] = maxtemp;

        int mintemp = arr1[in];
        arr1[in] = arr1[arr1.length - 1];
        arr1[arr1.length - 1] = mintemp;
    }
}
