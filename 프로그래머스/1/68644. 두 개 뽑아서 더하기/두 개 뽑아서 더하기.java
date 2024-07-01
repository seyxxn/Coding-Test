import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                resultSet.add(sum);
        
            }
        }
        
        int [] answer = new int[resultSet.size()];
        int idx = 0;
        for(int num : resultSet){
            answer[idx++] = num;
        }
        
        return answer;
    }
}