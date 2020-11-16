public class Main {
    public static void main(String[] args) {
        //Student student = new Student("Bob", 99, 13212312,"Kaas");
    	Console console = new Console();
    	
    	
    	System.out.println("Sup");
    	
    	Student persoon1 = new Student("Bob", 99, 13212312,"Kaas");
    	Student persoon2 = new Student("Karel", 22, 11,"Uhh");
    	console.print("Es ist Zeit für brad wurst");
    	console.print("Er zijn studenten: " + persoon1.getName() + " & " + persoon2.getName());
    	console.print("Es ist Zeit für brad wurst");
    	
    	School school = new School("HZ");
    }
}
