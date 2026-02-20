package CIS122;

import java.util.ArrayList;

public class ArrList {

    public int[] evenOdds(int[] values){
    /*
    Count the number of even and odd elements in an array of integers. 
    Since you must return two counts, place them into an array of length 2. 
    For example, if you are given the array
    1, 4, 9, 16, 25
    you return the array with elements
    2, 3
    since there were two even and three odd elements.
    */
        int odd = 0;
        int even = 0;

        for (int each : values){
            if (each%2==0){
                even += 1;
            } else {
                odd += 1;
            }
        }
        
        int[] result = {even,odd};

        return result;
    }




    public static ArrayList copyReverse(int[] anArray){
    /*
    Consider an array of integers. We need to copy that array into an ArrayList, 
    in reversed order. There is only one parameter to this method: the original 
    array of integers. The method returns the new ArrayList, with the contents 
    reversed in order from the original array.
    For example, consider the following array of integers:
    [3, 9, 27, 81]
    When you call the copyReverse method with this array, the return value should 
    be a new ArrayList containing the same elements, but in reversed order:
    [81, 27, 9, 3]
    */
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = anArray.length-1; i>=0; i--) {     // 玛雅大哥，中间是维持运行条件，不是终止条件！！！
            result.add(anArray[i]);
        }

        return result;
    }




    public static ArrayList copyArray(int[] anArray){
    /*
    This method goes through the array of integers identified by
    the only parameter, creating a new ArrayList from the array,
    eliminating duplicates from the original array.
    @param theArray, an array of integer
    @return uniqueIntAL, the new ArrayList
    */

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int each1 : anArray){
            int counter = 0;
            for (int each2 : result){
                if (each1 == each2){     // 不等于是!=只有一个=
                    counter+=1;
                }
            }
            if (counter == 0){
                result.add(each1);
            }
            counter = 0;
        }

        return result;
    }




    public ArrayList<String> shortWords(String[] words){
    /*
    You want to collect all “short” words in an array of words, that is, 
    words with at most three characters. Since you don't know in advance 
    how many short words there are, collect them in an array list, not 
    an array.
    For example, if you are passed an array containing the words
    "Mary", "had", "a", "little", "lamb"
    you would return an array list containing the words
    "had", "a"
    */
        ArrayList<String> result = new ArrayList<>();
        for (String each : words) {
            if (each.length()<=3){
                result.add(each);
            }
        }
        
        return result;
    }



    
    public int sameEnds(int[] values){
    /*
    Your task is to determine whether an array has the same sequence 
    of numbers at the beginning and the end, and if so, how long that 
    sequence is.
    For example, the array
    1 4 9 10 11 12 1 4 9
    has the same sequence 1 4 9 at the left and the right, and it 
    has length 3.

    If the array doesn't have a common sequence at the left and the 
    right, such as
    1 4 9 16 25
    return 0.

    The two sequences cannot overlap. For example, in the array
    1 1 1 1
    the sequence 1 1 occurs at the left and the right, and your method 
    should return 2.
    */
        if (values.length == 0) {
            return 0;
        }

        int result = 0;
        int offsetbyodd = values.length%2==0? 0 : 1;
        int offsetbyposition = 0;

        while (result == 0 && offsetbyposition < values.length) {

            for (int i=0; i<values.length/2; i++){      // 不能套两个循环
                int compare = values.length/2+offsetbyodd+offsetbyposition+i;
                if( compare >= values.length && compare > 0){
                    break;
                }
                if (values[i] == values[compare]){
                    result += 1;
                }
            }
            
            offsetbyposition++;
        }
        return result;
    }
}
