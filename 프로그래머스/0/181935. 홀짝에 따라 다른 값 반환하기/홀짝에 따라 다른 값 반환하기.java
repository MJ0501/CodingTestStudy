class Solution {
    public int solution(int n) {
        int answer = 0 ;
        switch(n%2){
            case 1:
                for(int i = 1;i <= n;i+=2){
                answer += i;
                }
                break;
            case 0:
                for(int i=0; i<=n ; i+=2){
                answer += i*i;
                }
                break;
            default:
                break;
        }
        return answer;
    }
}