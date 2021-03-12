/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class ArrayFunctions {
    
    public static double getTotal(double [] arrIn){
        double total = 0;
        for (int i = 0; i < arrIn.length; i ++){
            total += arrIn[i];
        }
    return total;
    }
    public static double getAverage(double [] arrIn){
        double average = 0;
        double total = 0;
        double count = 0;
        for (int i = 0; i < arrIn.length; i++){
            total += arrIn[i];
            count += 1;
        }
        average = total/count;
    return average;
    }
    public static double getHighest(double [] arrIn){
        double highest = 0;
        for (int i = 0; i < arrIn.length; i++){
            if (arrIn[i]>highest){
                highest = arrIn[i];
            }
        }
    return highest;
    }
    public static double getLowest(double [] arrIn){
        double lowest = arrIn[0];
        for (int i =  0; i < arrIn.length; i++){
            if (arrIn[i]<lowest){
                lowest = arrIn[i];
            }
        }
    return lowest;
    }
    
    public static void main(String[] args) {
        
    }
}
