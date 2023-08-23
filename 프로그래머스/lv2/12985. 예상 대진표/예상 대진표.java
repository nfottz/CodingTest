class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        while(min % 2 == 0 || max - min != 1){
            answer++;
            min = (min + 1) / 2;
            max = (max + 1) / 2;
        }
        return answer;
    }
}