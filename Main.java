public class Main {
  public static void main(String[] args) {
    //
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
