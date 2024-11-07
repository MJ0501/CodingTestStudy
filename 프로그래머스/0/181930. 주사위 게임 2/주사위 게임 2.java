class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        int dsum = a*a+b*b+c*c;
        int tsum = a*a*a+b*b*b+c*c*c;
        boolean allT = (a==b)&&(b==c);
        boolean t = (a==b)||(b==c)||(a==c);
        answer = allT ? (sum*dsum*tsum) : t ? (sum*dsum) : sum;
        return answer;
    }
}