class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = wallpaper.length, luy = wallpaper[0].length(), rdx = 0, rdy = 0;
        for(int i = 0, length = wallpaper.length; i < length; i++){
            if(wallpaper[i].contains("#")){
                lux = Math.min(lux, i);
                luy = Math.min(luy, wallpaper[i].indexOf("#"));
                rdx = Math.max(rdx, i + 1);
                rdy = Math.max(rdy, wallpaper[i].lastIndexOf("#") + 1);
            }
        }
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }
}