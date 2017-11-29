package andycpp;

public class Calulator {
	private static int result;
	public void add(int n) {
		result=result+n;
	}
	public void substract(int n) {
		result=result-n;
	}
	public void multiply() {

	}
	public void divide(int n) {
		result=result/n;
	}
	public void square(int n) {
		result=n*n;
	}
	public void squareRoot(int n) {
		for(;;);
	}
    public void clear() {
    	result=0;
    }
    public int getResult() {
    	return result;
    }
}
