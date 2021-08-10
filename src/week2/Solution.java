package week2;

class Solution {
    public String solution(int[][] scores) {
        //학점을 담을 문자열 배열
        char[] credit = new char[scores.length];
        
        for(int i=0; i<scores.length; i++){
            int sum = 0;
            //받은 점수를 모두 더함
            for(int j=0; j<scores.length; j++){
                sum += scores[j][i];
            }
            
            //스스로의 점수를 체크해서 유일한 최대,최소 값이면 제외 후 평균값을 학점으로 변환
            if(checkSelfScore(scores, i)){
                sum -= scores[i][i];
                credit[i] = conversion(sum*1.0/(scores.length-1));
            }else{
                credit[i] = conversion(sum*1.0/scores.length);
            }
        }
        //문자열 배열을 문자열로 변경하여 리턴
        return String.copyValueOf(credit);
    }
    
    //스스로의 점수가 유일한 최대, 최소인지 확인
    private boolean checkSelfScore(int[][] scores, int stuNo){
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        
        //자신이 받은 점수 중 최대, 최소 점수를 찾음
        for(int i=0; i<scores.length; i++){
            maxScore = Math.max(maxScore, scores[i][stuNo]);
            minScore = Math.min(minScore, scores[i][stuNo]);
        }
        
        //스스로의 점수가 최대이거나 최소인 경우
        if(scores[stuNo][stuNo] == maxScore || scores[stuNo][stuNo] == minScore){
            int onlyChk = 0;
            
            //스스로의 점수와 같은 점수의 수를 확인
            for(int i=0; i<scores.length; i++){
                if(scores[stuNo][stuNo] == scores[i][stuNo]) onlyChk++;
            }
            
            //1개면 보인이 준 점수이므로 제외시키기 위한 true 반환
            if(onlyChk == 1) return true;
        }
        return false;
    }
    
    //평균을 학점으로 변환하여 문자로 리턴
    private char conversion(double avgScore){
        if(avgScore >= 90) return 'A';
        else if(avgScore >= 80) return 'B';
        else if(avgScore >= 70) return 'C';
        else if(avgScore >= 50) return 'D';
        else return 'F';
    }
}