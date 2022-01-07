package com.company;

public class OneWay {
    public static void main(String[] args) {
        System.out.println(oneWay("pales","pale"));
    }
    public static boolean oneWay(String A, String B) {

        int diff=0;
        int leftIndex=0;
        int rightIndex=0;

        int target = Math.abs(A.length() - B.length());
        if(target > 1)return false;

        char[] AChar = A.toCharArray();
        char[] BChar = B.toCharArray();

        while(diff < 2 && leftIndex <= AChar.length && rightIndex <= BChar.length){

            if(AChar.length-1<leftIndex || BChar.length-1<rightIndex){
                diff++;
                return diff < 2 && diff != 0;
            }
            if(AChar[leftIndex] != BChar[rightIndex]){
                diff++;

                if(AChar[leftIndex + 1] == BChar[rightIndex]){
                    leftIndex++;
                }else if(AChar[leftIndex] == BChar[rightIndex+1]){
                    rightIndex++;
                }
            }
            leftIndex++;
            rightIndex++;
        }
        return diff < 2 && diff != 0;
    }
}

