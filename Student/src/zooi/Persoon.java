package zooi;
public class Persoon {
	
protected static String Naam;
protected static Integer studentid;
protected static Integer favoriteCourse;
	

	public static void main(String[] args)  
	{  
		printshit();
	} 

	public static void printshit() {
		
		System.out.print("Persoon 1: \n");
		System.out.print(Tim.Naam + "\n"); 
		System.out.print(Tim.favoriteCourse + "\n"); 
		System.out.print(Tim.studentid + "\n \n"); 
		
		System.out.print("Persoon 2: \n");
		System.out.print(Bobby.Naam + "\n"); 
		System.out.print(Bobby.favoriteCourse + "\n"); 
		System.out.print(Bobby.studentid); 
	}
}
