package Strings_And_StringBuilder;

import java.util.HashMap;

public class Sorting_the_Sentence_LeetCode {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        int i = 0;
        char[] ch = s.toCharArray();
        for (int j = 0; j < ch.length; j++) {
            if (Character.isDigit(ch[j])){
                int c = ch[j];
                map.put( c,s.substring(i,j));
                i = j+2;
            }
        }
        StringBuilder str = new StringBuilder();
        for (int key: map.keySet()){
            str.append(map.get(key));
            str.append(" ");
        }

        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }
}


//  public String sortSentence(String s) {
//        String[] sentenceArr = s.split(" ");
//        String[] finalString = new String[sentenceArr.length];
//
//        for(String word : sentenceArr) {
//            int wordLength = word.length();
//
//            int index = Character.getNumericValue(word.charAt(wordLength - 1));
//            finalString[index - 1] = word.substring(0, wordLength - 1);
//        }
//
//        return String.join(" ", finalString);
//    }