import java.util.ArrayList;

public class Javabrushup2 {

	public static void main(String[] args) {
		
		
		ArrayList <String> a = new ArrayList  <String> ();
		a.add("Saurabh");
		a.add("Choudhary");
		a.add("New");
//		System.out.println(a.get(2)); (We can use this to print an specific value)
		
		for(String b:a)
		{
			
			System.out.println(b);
		}
		
		//To check item presence in the ArrayList
		
		a.contains("Choudhary");
		System.out.println(a.contains("Choudhary"));
		
		
		System.out.println("***************");
		
		//String concept and declaration and then after splitting, stored those String into the Array
		
		String s2 = new String ("Welcome");     //This is one way to create string called String literally 
		String s3 = new String ("Welcome");
		
		
		
		String s = "Saurach Choudhary new";
		String [] splittedString=  s.split("Choudhary");
		
		for(String c:splittedString) {
			
			c.trim();
			
			System.out.println(c);
		}
		
		for(int i=0; i<s.length(); i++) {
			
			System.out.println(s.charAt(i));
		}
		
		//Want to print string in reverse order 
		
		for(int i=s.length()-1; i>=0; i--) {
			
			System.out.println(s.charAt(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
