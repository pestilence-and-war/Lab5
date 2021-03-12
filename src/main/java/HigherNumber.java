/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class HigherNumber {
    public static int higherNumbers(int inputNumber, int [] numberList ){
        int count = 0;
        for (int i = 0; i <= numberList.length-1; i++){
            if (numberList[i]>inputNumber){
                count ++;
            }
            
        }
    return count;
    }
    public static void main(String[] args) {
        int [] list = {0,1,2,3,4,5,6,7,8,9};
        int userInput = 0;
        higherNumbers(userInput, list);
    }
    
}
