import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Javastream {

	public static void main(String[] args) {
		
		
		
		// Count the number of names starting with alphabet A
		
	
		ArrayList<String> name = new ArrayList<String>();
		name.add("Arun");
		name.add("Ram");
		name.add("Abhi");
		name.add("nico");
		name.add("Ako");
		
		int count=0;
		
		for(int i=0;i<name.size();i++) {
			
			
			String actual = name.get(i);
			if(actual.startsWith("A")) {
				
				count++;
				
			}
		}
		
		System.out.println(count);
			

	}
	
	// How we can do the same thing through java stream by optimizing the code 
	
	
	public void  streamFilter() {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Arun");
		name.add("Ram");
		name.add("Abhi");
		name.add("nico");
		name.add("Ako");
		
		//There is no life for intermediate operation (Filter) without terminal operation (Count)
		//Terminal operation will execute only when intermediate operation returns true
		//We can create stream instead of declaring array
		//How to use filter in stream API
		
		long c= name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//OR
		
		long d=Stream.of("Arun","Ram","Abhi","nico","Ako").filter(s->
		{
			s.startsWith("A");
			return true;
			
		}).count();
		
		System.out.println(d);
		
		//Above method will also work as we have optimized  the code in further level
		
		
		name.stream().filter(s->s.length()>2).forEach(s->System.out.println(s)); // Want to print the names which has length greater than 2
		name.stream().filter(s->s.length()>2).limit(1).forEach(s->System.out.println(s)); // Want to print only one name having length more than 2 (First number name)
	
	
	
//	// Now will learn Steam map
//		
//		public void streamMap() {
//			
//			// Wants to print the names which ends with letter "A" and in upper case
//			Stream.of("Arun","Ram","Abhi","nico","Ako").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//					
//		}
//	
	
	//>> Now if we want to print the name has first letter as "A" with upper case and sorted
		
		// So to make it easy first, we change arrays into arraylist 
		
//		public void streamArray() {
//		
//		List <String> names =Arrays.asList("Arun","Ram","Abhi","nico","Ako");
//		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//	
//	
//		}
	
	//>> Now if we want to merge 2 array list 
		
//		public void streamMerge() {
//			
//			List <String> names =Arrays.asList("Arun","Ram","Abhi","nico","Ako");
//			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//			
//			
//			List <String> names1 =Arrays.asList("Guy","Boy","Girl","Reh","Duke");
//			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//			
//			
//			Stream <String> newStream= Stream.concat(names.stream(), names1.stream());
//			//newStream.sorted().forEach(s->System.out.println(s));
//			
//			
//			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Girl")); // IF we want to match any text between the 2 streams
//			System.out.println(flag);
//			Assert.assertTrue(flag);
//			
//		}
	
	//>> Now will create a new list from the existing list and then use the latest list into a method 
		
//		public void streamCollect() {
//		
//			
//	List <String> ls =Stream.of("Arun","Ram","Abhi","nico","Ako").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());	
//		// In above line, we have converted the Stream into the list and then we are using that list 	
//			System.out.println(ls.get(0)); // If we want to print first letter of the list 
//			
//			
//			// Now if we want to print unique numbers and then sort the list 
//			
//			list <Interger> values =  Arrays.asList("1","2","3","4","5");
//			values.stream().distinct().sort().forEach(s->system.out.println(s));
//			
//			//Now again we need to convert this into list and then get the 3rd value to print 
//			
//			List <Interger> li = values.stream().distinct().sort().collect(Collectors.toList())
//					System.out.println(li.get(2));
//			
//			
//		
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
