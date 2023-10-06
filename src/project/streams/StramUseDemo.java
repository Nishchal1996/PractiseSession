package project.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class StramUseDemo {
	
	public static void main(String[] args) {
		
		//this is how we can create Immutable List using ListOf, If we add element then it will throw an exception
	List<Integer> list1=Arrays.asList(12,34,54,55,35,44,28,87,57);
	List<Integer> updatedList=new ArrayList<>();
	    
	 //now if We want to seprate out the even nos before stream then we have to do like
	   for(Integer listNew:list1) {
		   if(listNew%2==0) {
			  updatedList.add(listNew); 
		   }
	   }
	   System.out.println(updatedList);
	   
	
	   
	   //to reduce no of line of code we use stream method,for that we have to convert list1 into stream as follows.
	 List<Integer> streamedList=  list1.stream().filter(i->i%2==0).sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
	 System.out.println("Streamed List"+streamedList);
	 
	 
		//stream.map() function works for each element in the list as belows
		//does not need predicates--(boolean valued function)
			 List<String> name=Arrays.asList("abc","xyz","Nishchal");
			 List<String> name2= name.stream().map(e->e.concat(" Ji")).collect(Collectors.toList());
			 System.out.println(name);//here proved that stream doesnot modify original one
			 System.out.println("Updated List of name"+name2);
			 
	
	}

}
