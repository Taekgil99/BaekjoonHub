import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        
        int sum = 0;
        
        for(int i=0; i < 10; i++) {
            if(!(list.contains(i))) {
                sum += i;
            }
        }
        
        return sum;
    }
}