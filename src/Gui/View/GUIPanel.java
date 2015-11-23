package Gui.View;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout; //For layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.*;
import java.awt.Color;
import Gui.Controller.GUIAppController;

/** 
 * @author rbar3155
 * @version 0.1 Nov 9, 2015
 * 
 */
public class GUIPanel extends JPanel
{
	private GUIAppController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("Words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -24, SpringLayout.EAST, this);
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random()* 256);
		
		this.setBackground(new Color(red, green, blue));
	}
		
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow, this is the most amazing click event ever! WOW!");
			}
		});
		
		this.addMouseListener(new MouseListener()
		
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			
			public void mouseReleased(MouseEvent released)
			{
				changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			
			public void mouseEntered(MouseEvent entered)
			{
	
			}	
			
			public void mouseExited(MouseEvent exited)
			{

			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				if(moved.isAltDown())
				{
					changeRandomColor();
				}
				

			}
			
			public void mouseDragged(MouseEvent dragged)
			{
				changeRandomColor();
			}
		});
	}
}

