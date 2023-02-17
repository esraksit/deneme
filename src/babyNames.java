import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class babyNames {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("babyNames.txt");
	    Scanner input = new Scanner(file); 
	 
	       
	     
	      
		int date=1900;
		String name,word;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter name");
		name=scan.next();
		name= name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
		
		while(input.hasNext()) {
			word  = input.next();
			if(word.equals(name)) {
				for(int i =0; i<10;i++) {
					word  = input.next();
					date+=10;
					System.out.println(date + "  :  "+  word );
				}
				
			}
		}
		
			
			
			
		}
		 
	      
		
		
		
		

	}




