import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {5, -10, 8, 12, 2, -6, 0};
        int[] squares = ArrayAlgorithms.squares(nums);
        System.out.println(Arrays.toString(squares));

        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));
    }
}
