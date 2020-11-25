package app;

public class Facade {
	
	
    public Facade(String action) {

        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        
        
        if (action == "watch a movie"){
        	        	
	       	 popper.on();
	       	 popper.pop();
	       	 lights.dim(3); //or whatever is dim enough
	       	 screen.down();
	       	 projector.on();
	       	 projector.wideScreenMode();
	       	 amp.on();
	       	 amp.setDvd(dvd);
	       	 amp.setSurroundSound();
	       	 amp.setVolume(5);
	       	 dvd.on();
	       	 dvd.play("movie");

        }
        
        else if (action == "ready watching the movie"){
        	
        	popper.off();
        	lights.on();
        	screen.up();
        	projector.off();
        	amp.off();
        	dvd.stop();
        	dvd.eject();
        	dvd.off();
        }
        
        else if (action == "listen to the music"){
        	
        	lights.on();
        	amp.on();
        	amp.setVolume(5);
        	amp.setCd(cd);
        	amp.setStereoSound();
        	cd.on();
        	cd.play(0);
        }
        
        else if (action == "ready listening music"){
        	
        	amp.off();
        	amp.setCd(cd);
        	cd.eject();
        	cd.off(); 	
     
        }
        
        else if (action == "listen to the radio"){
        	
        	tuner.on();
        	tuner.setFrequency(1);
        	amp.on();
        	amp.setVolume(5);
        	amp.setTuner(tuner);

        }
        
        else if (action == "ready listening music (radio)"){

        	tuner.on();
        	amp.off();
        	
        }
        
    }

    
}
