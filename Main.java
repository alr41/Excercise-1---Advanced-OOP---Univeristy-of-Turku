import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[] {-1, 1, 2};
    Float result;
    
    try {
      result = avg(nums);
      System.out.println(result);
    } catch (EmptyArray e) {
      System.out.println("Array is empty.");
    } catch (NegativeNumberException e) {
      for (int index : e.getNegativeIndices()) {
        int value = nums[index];
        int position = index + 1;
        System.out.println("The " + position + ordinal(position) +
          " number " + value + " in your array is invalid");
      }
    }
  }
    public static float avg(int[] nums) throws EmptyArray, NegativeNumberException {
    int sum = 0;
    if (nums == null || nums.length == 0)
      throw new EmptyArray();
    List<Integer> negativeIndices = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        negativeIndices.add(i);
      }
    }

    if (!negativeIndices.isEmpty()) {
      throw new NegativeNumberException(negativeIndices);
    }

    for(int n: nums) {
      sum += n;
    }
    return (float) sum / nums.length;
  }
    public static String ordinal(int n) {
    if (n % 100 >= 11 && n % 100 <= 13) {
        return "th";
    } else if (n % 10 == 1) {
        return "st";
    } else if (n % 10 == 2) {
        return "nd";
    } else if (n % 10 == 3) {
        return "rd";
    } else {
        return "th";
    }
  }
}
  
 
