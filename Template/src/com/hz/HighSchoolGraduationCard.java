package com.hz;

public class HighSchoolGraduationCard extends Card{

	public HighSchoolGraduationCard(Printer printer) {
		
		super(printer);

	}
	
    public void print() {

        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

	
	private void printHeader() {
		
        String header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);
    }

    private void printMessage() {
    	
        String msg = "This calls for celebrating! Congratulations!";
        this.printer.printLine(msg);
    }

    private void printImage() {

        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");

    }

    private void printFooter() {
    	
        String footer = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(footer);
        
    }
}
