package Gui.View;

import javax.swing.JPanel;
import Gui.Controller.GUIAppController;

/** 
 * @author rbar3155
 * @version 0.1 Nov 9, 2015
 * 
 */
public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
	}
	
}
