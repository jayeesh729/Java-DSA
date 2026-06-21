import java.util.*;

class Solution {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                al.add("FizzBuzz");
            } else if (i % 3 == 0) {
                al.add("Fizz");
            } else if (i % 5 == 0) {
                al.add("Buzz");
            } else {
                al.add(Integer.toString(i));
            }
        }
        return al;
    }
}