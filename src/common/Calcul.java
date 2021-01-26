package common;

public class Calcul {
	
	public Integer addition(Integer val1, Integer val2) {
		return val1+val2;
	}
	
	public Integer multiplication(Integer val1, Integer val2) {
		return val1*val2;
	}
	
	public Integer substraction(Integer val1, Integer val2) {
		return val1-val2;
	}
	
	public Integer division(Integer val1, Integer val2) {
		return val1/val2;
	}
	
	public Integer square(Integer val) {
		return val * val;
	}
	
	public Integer sqrt(Integer val) {
		return (new Double(Math.sqrt(val))).intValue();
	}

	public Integer factorial(Integer val) {
		int res = 1;
		for (int i=1;i<=val;i++) {
			res = res*i;
		}
		return res;
	}
	
	public Integer power(Integer val, Integer puiss) {
		int res = val;
		for (int i=1;i<puiss;i++) {
			res = res*val;
		}
		return res;
	}

}
