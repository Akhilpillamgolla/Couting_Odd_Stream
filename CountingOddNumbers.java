package assignment_2;

import java.util.stream.IntStream;

public class CountingOddNumbers {
    public static void main(String[] args) {
        
    	long count = IntStream.rangeClosed(10, 100).filter(n -> n % 2 != 0).count();

        System.out.println("Counting  of odd numbers: " + count);
    }
}
