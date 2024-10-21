public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // array multidimensional

        String[][] array2 = {{"123", "123"},{"123","123"}};


        // Desafio TWO SUMS do LeetCode
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j< nums.length; j++ ){
                int total = nums[i] + nums[j];
                if (total == target) {
                    int[] response = {nums[i], nums[j]};
                    System.out.print(nums[i]);
                    System.out.print(nums[j]);
                }

            }
        }
    }
}
