class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i<array.length;i++){
            int k = array[i];
            int j = i - 1;
            while(j>=0&&array[j]>k){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=k;
        }
        answer = array[array.length/2] ;
        return answer;
    }
}