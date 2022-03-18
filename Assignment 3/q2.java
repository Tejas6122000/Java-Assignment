// Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;
import java.util.Map;

class q2 {
    public static void main(String[] args)
    {

        String str = "Java Advance Course Java Core Course";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}