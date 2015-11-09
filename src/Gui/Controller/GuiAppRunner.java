package Gui.Controller;

/**
 * Starts the Simple GUI Program
 * @author rbar3155
 * @0.1 Nov 9, 2015
 * 
 */
public class GuiAppRunner
{
	
	/**
	 * @param args Unused as this is a GUI
	 */
	public static void main (String [] args)
	{
		GUIAppController myController = new GUIAppController();
		myController.start();
	}
}