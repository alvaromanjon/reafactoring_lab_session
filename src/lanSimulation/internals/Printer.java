package lanSimulation.internals;

public class Printer extends Node {

	public Printer(byte type, String name) {
		super(type, name);
	}
	
	public void printOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");	
	}
	
	public void printHTMLOn(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}

	public void printXMLOn(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}
}
