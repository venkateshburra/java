package loops;
public class enhanceLoop {
    public static void main(String args[]) {

        int nums1[] = {2,4,6};
        int nums[] = new int[3];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;

        for(int num : nums)
        {
            System.out.println(num);
        }
        for(int num2 : nums1)
        {
            System.out.println(num2);
        }
    }
}
