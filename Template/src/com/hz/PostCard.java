package com.hz;

public class PostCard extends Card{

	public PostCard(Printer printer) {
		
		super(printer);
	}
		
	 public void print() {

	        this.printHeader();
	        this.printMessage();
	        this.printImage();
	        this.printFooter();
	    }

	    private void printHeader() {
	        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

	        this.printer.printLine(header);
	    }

	    private void printMessage() {
	        String msg = "Greetings from the netherlands!";
	        this.printer.printLine(msg);
	    }

	    private void printImage() {

            this.printer.printLine("        Art by Hayley Jane Wakenshaw");
            this.printer.printLine("");
            this.printer.printLine("             /)  (\\");
            this.printer.printLine("        .-._((,~~.))_.-,");
            this.printer.printLine("         `=.   99   ,='");
            this.printer.printLine("           / ,o~~o. \\");
            this.printer.printLine("          { { .__. } }");
            this.printer.printLine("           ) `~~~\' (");
            this.printer.printLine("          /`-._  _\\.-\\");
            this.printer.printLine("         /         )  \\");
            this.printer.printLine("       ,-X        #   X-.");
            this.printer.printLine("hjw   /   \\          /   \\");
            this.printer.printLine("     (     )| |  | |(     )");
            this.printer.printLine("      \\   / | |  | | \\   /");
            this.printer.printLine("       \\_(.-( )--( )-.)_/");
            this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
            this.printer.printLine("           /_,\\  /._\\");    

	    }

	    private void printFooter() {
	        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";

	        this.printer.printLine(footer);
	    }

}
