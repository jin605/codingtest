import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Deque <Integer> que = new ArrayDeque<>();
        // deque 초기화 큐 특성상 사이즈가 없음
        
        for(int i = 0; i <bridge_length; i++) {
            que.offerLast(0);
        }
        // bridge_length 사이즈로 0으로 초기화
        
        int time = 0;
        // 답을 위한 변수
        int curWeight = 0;
        // 다리 위에 있는 트럭 변수
        int truckIdx = 0;
        // truck_weights 배열의 index
        
        while (!que.isEmpty()) {
        // que가 없을 때까지 반복
            
            time ++;
            curWeight -= que.pollFirst();
            // 시간이 돌떄마다 하나씩 들어와야 하기 떄문에 pollFirst
            
            if (truckIdx < truck_weights.length) {
            // 남아있는 트럭 확인(index와 배열의 길이 비교)
                
                int curtruck = truck_weights[truckIdx];
                // 현재 트럭의 무게 설정
                
                if (curWeight + curtruck <= weight) {
                // if 다리 전체의 무게 + 현재 트럭까지 들어 올 수 잇으면 
                    
                    curWeight += curtruck;
                    // 다리 전체 무게 + 현재 트럭 무게 ++
                    que.offerLast(curtruck);
                    // 큐 마지막에 트럭 넣기
                    truckIdx++;
                    // 트럭 배열의 인덱스 ++
                    
                } else {
                // 만약 다리 전체 무게보다 크면 배열에서 추가 안하고
                    que.offerLast(0);
                    // 그냥 0만 추가 (이렇게 다 돌면 마지막에 마지막엔 큐만 준다.)
                }
            }
            
        }
           
        int answer = time;
        return answer;
    }
}
