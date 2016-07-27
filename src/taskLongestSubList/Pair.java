package taskLongestSubList;

public class Pair<T extends Number> {

	private T firstNumber;
	private T secondNumber;

	public Pair(T firstNumber, T secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public T getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(T firstNumber) {
		this.firstNumber = firstNumber;
	}

	public T getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(T secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public String toString() {
		return "(" + firstNumber + ", " + secondNumber + ")";
	}

}
