package project.lambda;

///@FunctionalInterface//it will give an error if we create new method when we create new method without declaration.
public interface FunctionalInterfaceDemo {
	/*
	 * functional interface is an interface which have a single method without
	 * declaration.
	 * It can contain many static or default method but only one method without declaration.
	 * we can annotated FI with @functionalInterface 
	 * it we provide annotation then it will give an error if you try to create another non declaration method.
	 * 
	 */
	public void getMessageFromFunctionInterface();//only one method without declaration is allowed.
	//public void getAnotherMessage();
	
	public static void getStaticMethod() {
	}
	
	public default void getDefaultMessage() {
		
	}

}
