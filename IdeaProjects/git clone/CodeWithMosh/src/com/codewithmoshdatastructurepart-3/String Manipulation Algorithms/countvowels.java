package StringManipulationAlgorithms;

import java.util.*;

import static java.util.Map.of;


public class countvowels{
    //countvowels
    public static int countVowels(String str){
        if(str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";
        for(var ch: str.toLowerCase().toCharArray())
            if(vowels.indexOf(ch) != 1)
                count++;
        return count;
    }

    //Reverse A String
    public static String reverse(String str){
        if(str == null)
            return "";
        StringBuilder reversed = new StringBuilder();
        for (var i = str.length()-1; i >= 0; i--)
            reversed.append(str.charAt(i));
        return reversed.toString();
    }

    //ReverseSentence
    public static String reverseWords(String sentence){
        if(sentence == null )
            return "";
        String [] words = sentence.trim().split( " ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    //Rotation Words
    public static boolean AreRotations(String str1, String str2){
         if(str1.length() != str2.length())
             return false;
         if(!(str1 + str2).contains(str2))
             return false;
         return true;
//        if(str1 == null || str2 == null )
//            return false;
//        return (str1.length() ==
//        str2.length() && (str1 + str2).
//        contains(str2)); CONTAINS//
    }
    //RemovingDuplicats
    public static String removeDuplicate(String str){
        if(str == null)
            return "";
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (var ch: str.toCharArray()){
            if(!seen.contains(ch)){
                seen.add(ch);
            output.append(ch);
            }
        }
        return output.toString();
    }
    //MostRepeatedCharacter
    public static char getMaxOccuringchar  (String str){
        if(str == null || str.isEmpty())
            throw new IllegalArgumentException();
        final int ASCIISIZE = 256;
        int[] frequencies = new int[ASCIISIZE];
        for(var ch: str.toCharArray())
            frequencies[ch]++;
        int max =0;
        char result = ' ';
        for(var i = 0; i< frequencies.length; i++)
            if(frequencies[i]> max){
                max = frequencies[i];
                result =(char) i  ;
            }
        return result;

    }
    //Sentenc Capitalization
    public static String capitalize(String sentences){
        if(sentences == null || sentences.trim().isEmpty())
            return "";
        String[] words = sentences.trim().split(" ");
        for(var i = 0; i < words.length; i++){
            words[i] = words[i].
                    substring(0, 1).
                    toUpperCase().
                    toLowerCase();
        }
        return String.join(" ", words);
    }

    //AnagramsUsingSorting
    public static boolean areAnagrams(String first, String second){
        if(first == null || second == null)
            return false;
        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);
        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    //Anagrams-Using Histogramming
    public static boolean areAnagramsHistogram(String first, String second){
        if(first  == null || second == null)
            return false;
        int ENGLISH_ALPHABET = 26;
        int [] frequencies = new int[ENGLISH_ALPHABET];
        first= first.toLowerCase();
        for(var i = 0; i < first.length(); i++)
            frequencies [first.charAt(i) - 'a']++;
        second = second.toLowerCase();
        for(var i =0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if(frequencies[index] == 0)
                return false;
            frequencies[ index]--;
        }
        return true;
    }
    //Palindrome
    public static boolean isPalindrome(String word){
                if(word ==null)
                    return false;
                int left = 0;
               int right = word.length()-1;
               while(left < right)
                   if(word.charAt(left++) != word.charAt(right--))
                       return false;
               return true;



    }
}