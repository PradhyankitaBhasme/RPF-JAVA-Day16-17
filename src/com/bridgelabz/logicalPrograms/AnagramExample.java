package com.bridgelabz.logicalPrograms;

public class AnagramExample {
    public static void main(String[] args) {
        AnagramExample anagramExample=new AnagramExample();

        String str1="earth";
        String str2="heart";

        boolean isAnagram=anagramExample.checkAnagram(str1,str2);

        if (isAnagram){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Strings are not Anagram");
        }
    }
    public boolean checkAnagram(String str1,String str2){
        if (!(str1.length() == str2.length())){
            return false;
        }
        Boolean isAnagram=true;
        for (char c:str1.toCharArray()) {
            if (!str2.contains(String.valueOf(c))){
                isAnagram=false;
            }
        }
        return isAnagram;
    }
}
