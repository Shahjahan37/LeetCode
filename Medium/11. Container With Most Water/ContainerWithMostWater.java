class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0;
        int j=height.length-1;
        while(i <= j){
            int max1 = (j-i)*Math.min(height[i],height[j]);
            if(height[i]<height[j]) i++;
            else if(height[i]>height[j]) j--;
            else{
                i++;
                j--;
            }
            if(max < max1) max=max1;
        }
        return max;
    }
}