package Gui.View;

import javax.swing.JFrame;
import Gui.Controller.GUIAppController;

/**
 * @author rbar3155
 * @version 0.2 Nov 9, 2015 updated the setupFrame to load the contentPane with a GUIPanel.
 * 
 */
public class GUIFrame extends JFrame
{
	private GUIAppController baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(GUIAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); //Must be a first line of setupFrame!
		this.setSize(400,400); //Find a good size for the app.
		this.setResizable(false); //Advisable, not required.
		this.setVisible(true); //Must be the last line of setupFrame!
	}
	
	public GUIAppController getBaseController()
	{
		return baseController;
	}
}
