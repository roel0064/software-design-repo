package app;

public class Main {
	
	static String action;

    public static void main(String[] args) {
    	
    	//Kinda ghetto but it serves it purpose
    	    	
    	action = "watch a movie";
//    	action = "ready watching the movie";
//    	action = "listen to the music";
//    	action = "ready listening music";
//    	action = "listen to the radio";
//    	action = "ready listening music (radio)";
    	
        Facade facade = new Facade(action);
        
    }
}
