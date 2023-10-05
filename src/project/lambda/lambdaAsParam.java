package project.lambda;

interface Operation{
	public int getCalculate(int x, int y);
}
//we can also pass lambda expression as a parameter
public class lambdaAsParam {
     public static void result(int x,int y, Operation operation) {
    	System.out.println(operation.getCalculate(x,y));
     }
     public static void main(String[] args) {
		result(15, 32, (x,y)->{
			return x+y;
		});
	}
}
