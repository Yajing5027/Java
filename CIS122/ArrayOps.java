package CIS122;

public class ArrayOps {
/*
Complete the method, named sumArray, in the class named ArrayOps.java, so that it sums 
all the integer values in an array. The one parameter coming into the method is an 
array of integers. The integer value returned is the sum of these integers.
*/
    
    public static int sumArray1(int values[]){      // 要求返回int值
        int sum = 0;
        for (int i = 0; i < values.length;i++){
            sum += values[i];
        }
        return sum;
    }

    // 进阶
    public static int sumArray(int values[]){
        int sum = 0;
        for (int each : values){    // enhanced for loop：for (类型 名 : 原数组) {} 只能正序枚举法遍历数组所有元素，无法操作索引
            // Python中的for-in循环：for each in values:  # Python的for-in循环可以直接遍历数组元素
            sum += each;    // 直接对元素进行操作
        }
        return sum;
    }
    



/*
Complete the method named averagePrice, in the program below, named Prices.java, 
so that it accepts an array of prices as a parameter, and returns the average price. 
You may assume all prices are double values.
*/
    public static double averagePrice(double[] priceData){
        double sum = 0;
        for (int i = 0; i < priceData.length;i++){
            sum += priceData[i];
        }
        double ave = sum / priceData.length;
        return ave;
    }


/*
Complete the method, named countOccurs, in the class named ArrayOps.java. There are two 
parameters to this method: the first is an integer array, and the second parameter is a 
single integer. This method counts the number of occurrences of the given integer (second) 
parameter within the array of integers. This integer count is the return value. For example, 
if the array contains four integers: 23, 31, 17, 23, and the second parameter is the value 23, 
then the value returned would be 2, as 23 occurs twice within that array. However, if the 
second parameter is the value 42, the value returned would be zero, as the array does not contain 
the integer 42.
*/

    public static int countOccurs(int[] theArray, int theInt){
        int result = 0;
        for (int i = 0;i < theArray.length;i++){
            result += (theArray[i] == theInt ? 1:0);    // 由于三元运算符运算必须返回值，直接代入要加()
        }
        return result;
    }
        


/*
Your task is to complete a method that swaps adjacent values in an array of integers. 
For example, if the array contains the values
1 4 9 16 25 36
then after calling the method, it should contain the values
4 1 16 9 36 25

If the array contains an odd number of elements, leave the last element in place. For example,
1 4 9 16 25 36 45
becomes
4 1 16 9 36 25 45
*/

    public void swapAdjacentElements(int[] values){
        /* 删删删
        if (values.length % 2 == 0) {
            for (int i = 0; i<values.length;){
                int a = values[i];
                values[i] = values[i+1];
                values[i+1] = a;
                i+=2;
            }
        }else{
            for (int i = 0; i<values.length-1;){
                int a = values[i];
                values[i] = values[i+1];
                values[i+1] = a;
                i+=2;
            }
        }
        */
        // 自己找不同吧，i<values.length-1可以作为通用奇偶条件
        for (int i = 0; i<values.length-1;){
            int a = values[i];
            values[i] = values[i+1];
            values[i+1] = a;
            i+=2;
        }
   }


/*
Your task is to complete a method that swaps the first and second half of an array of integers. 
For example, if the array contains the values
1 4 9 16 25 36
then after calling the method, it should contain the values
16 25 36 1 4 9

If the array contains an odd number of elements, leave the middle element in place. For example,
1 4 9 16 25 36 45
becomes
25 36 45 16 1 4 9
*/

    public void swapFirstAndSecondHalf(int[] values){
        /* 删删删
        if (values.length % 2 == 0){
            for (int i = 0; i < values.length/2;i++){
                int a = values[i];
                values[i] = values[values.length/2 + i];
                values[values.length/2 + i] = a;
            }
        }else{
            for (int i = 0; i < values.length/2;i++){
                int a = values[i];
                values[i] = values[values.length/2+1+i];
                values[values.length/2+1+i] = a;
            }
        }
        */
        // 咱以后找不同 然后拼在一起 好不好
        int offset = values.length % 2==0 ? 0 : 1;

        for (int i = 0; i < values.length/2;i++){
            int a = values[i];
            values[i] = values[values.length/2+offset+i];
            values[values.length/2+offset+i] = a;
        }
    }
}
