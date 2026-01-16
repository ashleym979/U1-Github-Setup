import java.util.Arrays;

public class ArrayAlgorithms
{
    /** Prints each String in wordList, on its own line, followed by “!”.
     *  Does NOT mutate (modify) wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList)
    {
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i]+"!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {  for (int i = 0; i < wordList.length; i++) {
        wordList[i]=wordList[i]+"!";
        }

    }

    public static int sum(int[] numList)
    {
        int sum=0;
        for (int i = 0; i < numList.length; i++) {
            sum+=numList[i];
        }

        return sum;

    }

    public static double average(int[] numList)
    {
        int sum= sum(numList);
        double avg= ((double) sum)/numList.length;
        return avg;
    }

    public static int minimum(int[] numList)
    {
        int minimum=numList[0];
        for (int i = 0; i < numList.length; i++) {
            int temp=numList[i];
            if (temp<minimum){
                minimum=temp;
            }
        }

        return minimum;
    }

    public static int maximum(int[] numList)
    {
        int maximum =numList[0];
        for (int i = 0; i < numList.length; i++) {
            int temp=numList[i];
            if (temp> maximum){
                maximum =temp;
            }
        }

        return maximum;
    }

    public static void multiplyBy(int[] numList, int multiplier)
    {
        for (int i = 0; i < numList.length; i++) {
            numList[i]=numList[i]*multiplier;
        }
    }

    public static int[] squares(int[] numList)
    {
        int[] nums2 = Arrays.copyOf(numList,numList.length);
        for (int i = 0; i < numList.length; i++) {
            nums2[i]=nums2[i]*nums2[i];
        }

        return nums2;
    }
}
