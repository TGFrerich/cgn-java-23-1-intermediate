package org.example;

public class Hundred {



    public void printZahlen(){
        for(int i = 1; i <= 100;i++){
            if(i % 3 ==0){
                if(i % 5 ==0){
                    System.out.println("#$"+i);
                }
                else {
                    System.out.println("#" + i);
                }
            }
            else if (i % 5 == 0){
                System.out.println("$"+i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
