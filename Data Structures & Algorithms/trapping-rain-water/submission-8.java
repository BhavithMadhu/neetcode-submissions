class Solution {
    public int trap(int[] height) {

        int left = 0;
        int hoz = 0;
        int count = 0;
        int waterCount = 0;

        // First pass: left -> right
        for (int i = left + 1; i < height.length; i++) {

            if (height[left] <= height[i]) {

                count = count + hoz * height[left] - waterCount;

                left = i;
                hoz = 0;
                waterCount = 0;

            } else {

                hoz++;
                waterCount = waterCount + height[i];
            }
        }

        // Remaining unfinished section
        if (hoz > 0) {

            int right = height.length - 1;
            int tempHoz = 0;
            int tempWater = 0;

            // Right -> left
            for (int i = right - 1; i >= left; i--) {

                if (height[right] <= height[i]) {

                    count = count + tempHoz * height[right] - tempWater;

                    right = i;
                    tempHoz = 0;
                    tempWater = 0;

                } else {

                    tempHoz++;
                    tempWater += height[i];
                }
            }
        }

        return count;
    }
}