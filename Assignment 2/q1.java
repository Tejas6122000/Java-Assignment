// Write a program that prints its arguments  in random order. 
// Do not make  a copy of the argument array. Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.

import java.util.*;

public class q1 {

    public static void main(String[] args) {
        
        
        List<String> argument = Arrays.asList(args);
        Collections.shuffle(argument);

        argument.stream()
        .forEach(a->System.out.format("%s ",a));

    }
}
