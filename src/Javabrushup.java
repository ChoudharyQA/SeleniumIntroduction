
public class Javabrushup {

	public static void main(String[] args) {
		
		
		
		/* int myNum = 5;  (This is how, we declare an variable)

String website = "Rahul Shetty Academy"; (This is how, we declare an variable)

char letter = 'r'; (This is how, we declare an variable)

double dec = 5.99; (This is how, we declare an variable)

boolean myCard = true; (This is how, we declare an variable)



System.out.println(myNum+"is the value stored in the myNum variable");

System.out.println(website);




        Arrays -

int[] arr = new int[5];// 5, 10  (This is how, we create an object and definining multiple values called array)

arr[0] = 1;

arr[1] = 2;

arr[2]= 4;

arr[3]= 5;

arr[4]= 6;





int[] arr2 = {1,2,4,5,6}; (Standard method to declare an array)

System.out.println(arr2[0]);




		for loop arr.length - 5

for(int i = 0; i< arr.length; i++) //4

{

System.out.println(arr[i]);

}



for (int i =0;i<arr2.length; i++)

{

System.out.println(arr2[i]);

}



String[] name = {"rahul", "shetty", "selenium"};



for(int i =0; i<name.length;i++)

{

System.out.println(name[i]);

}



for( String s: name) (Another standard form to represent an "for" loop)

{

System.out.println(s);

}*/
		
		
		
		
		
		
		
		int [] array = {1,2,3,4,5,6,7,8,9,10}; //Defining that we are using multiple value to represent an array
		
		for(int a:array) { // From the array, we are saving value in "a" variable 
			
			if(a% 2==0) {
				
				System.out.println(a);
			}
			
			else {
				
				System.out.println(a+"This is not multiple of 2");
			}
			
			
		}
		
		
		

	}

}
