package CIS122;

import java.util.Scanner;


public class GetVowels {
/**
   Reads a string and prints out all vowels contained in that string.
   Vowels are A E I O U a e i o u. 

   Input: the value of s, a string
   Output: a string containing all the vowels in s,
      in the order in which they appear in s
*/
    public static void main(String[] args) {
        String r = "";      //local变量使用前必须初始化；字符串可以用+累加

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        in.close();

        char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};      //下面的word.charAt(i)会将String转化成char，所以上面的数组定义直接用char

        for (int i = 0; i < word.length(); i++){        //字符串length多个()，是.length()；数组的是.length
            for (char each : vowels){       //foreach只能对数组
                r += (word.charAt(i) == each) ? each : "";      //三元表达式加（）才能做加法
            }
        }

        System.out.println(r);
    }
}






class ReverseString{
/**
   Reads a string, reverses the order the characters within the
   string, and prints out the result.
   Input: the value of s, a string
   Output: the string reversed
*/
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        in.close();

        String reversed = "";

        for (int i=0; i<userInput.length();i++) {
            reversed += userInput.charAt(userInput.length()-1-i);
        }

        System.out.println(reversed);
    }
}





class PalFind{
/**
   Reads a string, checks to see if it is a palindrome, and prints
      "Yes" or "No", accordingly. 
   Input: the value of s, a string
   Output: "Yes" or "No"
*/
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        userInput = userInput.toLowerCase();        // .toLowerCase所有转小写
        in.close();

        boolean flat = true;

        for (int i=0; i<userInput.length()/2;i++) {
            flat = userInput.charAt(i) == userInput.charAt(userInput.length()-1-i);
            if (flat == false){
                break;
            }
        }

        System.out.println(flat?"Yes":"No");
    }
}





class ColorCodes {
/*
Consider an image that is composed of a number of colored small squares, each colored in one 
of these 8 colors: red, green, blue, cyan, magenta, yellow, black, white. The colors are stored 
in a String using the first letter of each color (R, G, B, C, M, Y, K, W). Each row in the 
image is terminated by a newline character ('\n'). Here is an example of an image:

String imageCode = "RRR\nRGR\nRRR\n";
This is a green square surrounded by red squares.

Your task is to write a method that doubles the image in size, making each square twice as 
large in each direction. For example, when calling doubleImage with imageCode, the returned image is

"RRRRRR\nRRRRRR\nRRGGRR\nRRGGRR\nRRRRRR\nRRRRRR\n"

Returns the code of the given image when doubled in size
@param img the codes of an image
@return the color codes of the doubled image
*/
   public String doubleImage0(String img)
   {   
        String result = "";
        String part = "";
        for (int i = 0; i < img.length(); i++)
        {
            char each = img.charAt(i);
            if (each == '\n'){    // 在 Java 字符串中\n 会被识别为只占一个字符的位置
                part += each;
                result += part + part;
                part = "";
            }else{
                part += each + "" + each;       // 对char用运算符时，Java会将其转换为对应的ASCII数值后进行计算，所以注意隐式转换
            }          
        }
        return result;
   }  

// 优化优化
   public String doubleImage(String img)
   {   
        String result = "";
        String part = "";
        for (int i = 0; i < img.length(); i++)
        {
            char each = img.charAt(i);
            if (each == '\n'){    // 在 Java 字符串中\n 会被识别为只占一个字符的位置
                part += each;
                result += part + part;
                part = "";
            }else{
                part += each + "" + each;       // 对char用运算符时，Java会将其转换为对应的ASCII数值后进行计算，所以注意隐式转换
            }          
        }
        return result;
   }  
}



class Compressor
{
/*
A simple technique for compressing an image is run-length encoding. The color 
of each pixel or area is specified for an image. The color pallette can be 
specified by the first letter of each color (R, G, B, C, M, Y, K, W) - red, 
green, blue, cyan, magenta, yellow, black, white. An example 6 by 4 image is:

    RRRGGGYYYYWBWWRGBBBBBRRR

Run-length encoding counts the number of each color in a group and replaces 
the individual color values by a number and the color. For our example, this 
would give:

   3R3G4Y1W1B2W1R1G5B3R
Complete the compressImage method to run-length compress a string of characters.
*/
    public String compressImage(String imageColors){

        String result = "";
        int recoder = 1;
        if (imageColors.length()==1){
            result += "1" + imageColors.charAt(0);
        }else{
            for (int i=1; i<imageColors.length(); i++){
                if (imageColors.charAt(i) == imageColors.charAt(i-1)){
                    recoder += 1;
                    result += (i == imageColors.length()-1? recoder + "" + imageColors.charAt(i) : "");
                } else {
                    result += recoder + "" + imageColors.charAt(i-1);
                    recoder = 1;
                }
            }
        }
        return result;
    } 
}