class Solution {
    public String solution(String polynomial) {
        
        String[] polyArr = polynomial.split(" ");
		
        int coeff = 0; int cons = 0;
		for(int i = 0; i < polyArr.length; i++) {
			if(polyArr[i].contains("x")) {
				if(polyArr[i].equals("x")) {
                    coeff ++;
                } else {
                    coeff += Integer.parseInt(polyArr[i].substring(0, polyArr[i].indexOf("x")));		
			    }
            } else if(!polyArr[i].equals("+")){
				cons += Integer.parseInt(polyArr[i]);
			}
		}
        
		String answer = "";
		String coeffStr = coeff + "";
		if(coeffStr.equals("1")) coeffStr = "";
		if(cons == 0) answer = coeffStr + "x";
        else if(coeffStr.equals("0")) answer = cons + "";
        else answer = coeffStr +"x + " + cons;
        
        return answer;
    }
}