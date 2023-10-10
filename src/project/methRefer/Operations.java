package project.methRefer;

public class Operations {
	
	
	
	public Operations() {
		super();
		System.out.println("This is Method Ref using Constructor");
	}

	public static int doSqaure(int i) {
		return i*i;
	}
	
	public int doCube(int x) {
		System.out.println( x*x*x);
		return 0;
	}

}
