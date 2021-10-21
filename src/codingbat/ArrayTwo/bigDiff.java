package codingbat.ArrayTwo;

public class bigDiff {
    public static int bigDiff(int[] nums) {
        int lowNum = 0;
        int highNum = 0;
        if(nums.length == 1) {
            return 0;
        }
        for(int i = 0; i < 3; i++) {
            lowNum = Math.min(i, (i + 1));
        }
        for(int i = 0; i < 3; i++) {
            highNum = Math.max(i, (i + 1));
        }
        System.out.println(nums.length);
        System.out.println(Math.min(10, 3));
        System.out.println(Math.max(10, 3));
        System.out.println(highNum - lowNum);
        return highNum - lowNum;
    }

    public static void main(String[] args) {
        bigDiff(new int[] {10, 3, 5, 6});
    }
}
