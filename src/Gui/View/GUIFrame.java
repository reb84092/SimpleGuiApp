package Gui.View;

import javax.swing.JFrame;
import Gui.Controller.GUIAppController;

/**
 * @author rbar3155
 * @version 0.x Nov 9, 2015
 * 
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}
	
}
