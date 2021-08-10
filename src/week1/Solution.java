package week1;

class Solution {
    public long solution(int price, int money, int count) {
        //count횟수만큼 놀이기구를 탄 금액에서 가진 금액을 뺀 값을 할당
    	long answer = calculator(price, count) - money;
        
    	//answer가 0보다 작으면 돈이 남았다는 의미로 0을 리턴 아닌경우 answer를 리턴
        return answer < 0 ? 0 : answer;
    }
    
    //count를 1씩 빼면서 값을 누적하는 재귀함수를 생성 
    private long calculator(int price, int count){
        if(count == 1) return price;
        return price * count + calculator(price, count-1);
    }
}