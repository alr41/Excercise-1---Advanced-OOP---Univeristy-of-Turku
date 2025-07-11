class NegativeNumberException extends Exception {
  private final List<Integer> negativeIndices; // Stores the negative numbers' indices

  public NegativeNumberException(List<Integer> negativeIndices) {
    super("Negative numbers were found at indices: " + negativeIndices);
    this.negativeIndices = negativeIndices;
  }

  public List<Integer> getNegativeIndices() {
    return negativeIndices;
  }
}
