package com.company;

public class CheckPermutation {

    boolean isPermutation(String str1, String str2){
        if(!(str1.length() == str2.length()))return false;

        int[] letters  = new int[128];
        char[] a_array = str1.toCharArray();
        for (char c : a_array){
            //a in ASCII is 97 so 97 in letters will plus 1
           letters[c]++;
        }
        for (int i=0; i<str2.length();i++){
            int c = str2.charAt(i);
            //a in ASCII is 97 so 97 in letters will minus 1
            letters[c]--;
            //if b has char which doesn't exist in a it will be -1
            if(letters[c] < 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CheckPermutation permutation = new CheckPermutation();
        System.out.println(permutation.isPermutation("abcd","bcad"));
    }
}
