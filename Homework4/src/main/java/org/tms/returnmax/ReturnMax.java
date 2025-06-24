package org.tms.returnmax;

public class ReturnMax {
    public int returnMax(int value1, int value2){
        int max = value1;
        if(value1 > value2){
            return max;
        }
        else{
            max = value2;
        }
        return max;

    }


        public static void main(String[] args){

            ReturnMax Max = new ReturnMax();
            int result = Max.returnMax(30, 20);
            System.out.println(result);
        }


}
