package CIS122;

import java.util.ArrayList;
import java.util.Scanner;

class Startup {
    private ArrayList<int> dotCom = new Arraylist<>();

    
}

class StartupGame {
    checkUserGuess(String userGuess){
        System.out.println("Please enter your guess:");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        

        ArrayList<Startup> Dotcoms = new ArrayList<>();
        Startup DotCom1 =  new Startup();
        Dotcoms.add(Dotcom1);

        for (Startup eachDotcom : Dotcoms){
            int counter = 0;
            for (String eachCell : eachDotcom){
                String result = input.equals(eachCell)?"hit":"miss";
                System.out.println(result);

                if (result.equals(result)){
                    counter += 1;
                    
                }else{
                    System.out.println("Please enter your guess:");
                    String input = in.next();
                }

            }
        }
    }

        

}


class StartupTestDrive {
    StartupGame = new 
}