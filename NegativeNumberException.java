import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class NegativeNumberException extends Exception {
  private final List<Integer> negativeIndices; // Stores the negative numbers' indices

  public NegativeNumberException(List<Integer> negativeIndices) {
    super("Negative numbers were found at indices: " + negativeIndices);
    this.negativeIndices = new ArrayList<>(negativeIndices);
  }

  public List<Integer> getNegativeIndices() {
    return Collections.unmodifiableList(negativeIndices);
  }
}
