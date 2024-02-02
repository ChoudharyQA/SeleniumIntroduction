
public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo d= new MethodDemo();
		
		d.getdata();// If the method returns an void
		String name = d.getdatas(); // If the method returns an string then we need to store string into an variable
		System.out.println(name);
		
		MethodsDemo2 d1= new MethodsDemo2(); //Method of another call which we will use in this current class
		d1.getuserdata();
		
		getstaticdata(); //Using this static method without creating object because this method belongs to own current class
		
		
		
		
		
		
		
	
	}
	
	
	// We need to create method outside the class as we are declaring methods  not executing (Only execution code comes inside the class)
	
	
	
	public void getdata() // This method returns void 
	{
		
		System.out.println("Hello Saurabh"); 
	}
	
	
	
	
	public String getdatas() // This method returns String  
	{
		System.out.println("Hello choudhary");
		return "Saurabh Choudhary";
		
	}
	
	//If the method belongs to your own current class them we can use method without creating the object by declaring method as static 
	
	public static void getstaticdata() 
	{
		System.out.println("Hello choudhary new"); // Static method
		
		
	}
	
	
	

}
