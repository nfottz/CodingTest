import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
		BigInteger a = new BigInteger("1");
		for(int i = 1; i <= share; i++) {
			BigInteger ballsBig = new BigInteger(balls--+"");
			a = a.multiply(ballsBig);
		}
		
		BigInteger b = new BigInteger("1");
		for(int i = 1; i <= share; i++) {
			BigInteger iBig = new BigInteger(i+"");
			b = b.multiply(iBig);
		}
		
		int answer = (a.divide(b)).intValue();
        
        return answer;
    }
}