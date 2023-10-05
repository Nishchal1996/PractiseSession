package project.lambda;


interface AnonymousDemo{
	public void display();
}

public class LambdaDemo {
	
	//Lambda expression introduced in java 8
	//this is extended version of Anonymous Class So first we need to understand what is an anonymous class.
	//below is sample for anonymous class a class without name.
	//we use lambda expression because to reduce code complexity and improve readability
	public static void main(String[] args) {
	
		AnonymousDemo a=new AnonymousDemo() {
			//this is Anonymous class
			@Override
			public void display() {
				System.out.println("This is Anonymous Class");
				
			}
		};
		
	AnonymousDemo anonymousDemo=()->System.out.println("Hello");
	anonymousDemo.display();
	//Rules for Lambda
			//1.Lambda Work with functional intrerface only.
			//as below
	FunctionalInterfaceDemo functionalInterfaceDemo=()->System.out.println("this is message from functional interface");
	functionalInterfaceDemo.getMessageFromFunctionInterface();
	
	
	//if we want to execute multiple line write that in between braces.
	
	ParamInterface paramInterface=(x,y)->{
		return x+y;
	};
	System.out.println(paramInterface.calculate(13,26));
	}
//		anonymousDemo.display();
		
		
		
		
	
	}

	
	
		
		


