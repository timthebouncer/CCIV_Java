package com.company;

public class PalindromePermutation {

    boolean isPalindromePermutation(String str){
        int[] c_array = new int[128];

        for (int i=0;i<str.length();i++){
            c_array[str.charAt(i)]++;
        }
//        for (char c:str.toCharArray()){
//            c_array[c]++;
//        }

        int count = 0;
        for (int i=0; i<128; i++){
            count += c_array[i] % 2;
        }
        System.out.println(count);
        return count <= 1;
    }


    public static void main(String[] args) {
        PalindromePermutation ppmutation = new PalindromePermutation();
        System.out.println(ppmutation.isPalindromePermutation("racecar"));
    }
}
