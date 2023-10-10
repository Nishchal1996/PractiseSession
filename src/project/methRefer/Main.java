package project.methRefer;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//we use conventional lambda for functional interface to perform some task ,but what if we have already one method to do
		//that task, to use that method we use method reference
		/*
		 * we can apply method reference on Static method, Instance method and constructors.
		 * static method---->ClassName::methodName;
		 * instance method-->ObjectName::methodName;
		 * constructor------>ClassName::new;
		 * */
		//arguments and the parameters should be the same of method we have to refer
		Operate operate=(p1)->Operations.doSqaure(p1);
		System.out.println(operate.operate(5));
		//reference::methodName  thats how instead of lambda we use meth ref  w already have doSquare method 
		//we can assign method as value as below----code reduce and more simple
		//static method --> ClassName::methodName;
		Operate operate2=Operations::doSqaure;
		System.out.println(operate2.operate(7));
		
		/*
		 * instance method-->ObjectName::methodName;
		 * */
		System.out.println("Cube by using list and meth reff-Instance Method");
		Operations operations=new Operations();
		Operate operate4=operations::doCube;
		operate4.operate(4);
		
		List<Integer> list1=Arrays.asList(2,33,5,7,9,12);
		System.out.println("square by using list and meth reff");
		list1.forEach(c->{
			Operate operate3=Operations::doSqaure;
			System.out.println(operate2.operate(c));
		});
		
		
		/*
		 * constructor------>ClassName::new
		 * */
		
		ConstroctorMethRef constroctorMethRef=Operations::new;
		constroctorMethRef.showConstrMethRefMsg();
		
	}
}
