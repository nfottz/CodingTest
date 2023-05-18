class Solution {
    public int solution(String my_string) {
		for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 65){
                my_string = my_string.replace(my_string.charAt(i)+"", " ");
            }
        }
		String[] arr = my_string.split(" ");
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].isEmpty() == false) answer += Integer.parseInt(arr[i]);
		}
        return answer;
    }
}