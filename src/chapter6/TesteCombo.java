package chapter6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class TesteCombo extends JFrame implements ActionListener {
	private JComboBox mainComboBox;
	private JComboBox subComboBox;
	private Hashtable subItems = new Hashtable();
	public String ds;
	protected String dds;

	public TesteCombo() {
		String[] items = { "Select Item", "Color", "Shape", "Fruit" };
		mainComboBox = new JComboBox(items);
		mainComboBox.addActionListener(this);

		// In JDK1.4 this prevents action events from being fired when the
		// up/down arrow keys are used on the dropdown menu

		mainComboBox.putClientProperty("JComboBox.isTableCellEditor",
				Boolean.TRUE);
		getContentPane().add(mainComboBox, BorderLayout.WEST);

		// Create sub combo box with multiple models
		subComboBox = new JComboBox();
		subComboBox.setPrototypeDisplayValue("XXXXXXXXXXXX"); // JDK1.4
		getContentPane().add(subComboBox, BorderLayout.EAST);

		String[] subItems1 = { "Select Color", "Red", "Blue", "Green" };
		subItems.put(items[1], subItems1);

		String[] subItems2 = { "Select Shape", "Circle", "Square", "Triangle" };
		subItems.put(items[2], subItems2);

		String[] subItems3 = { "Select Fruit", "Apple", "Orange", "Banana" };
		subItems.put(items[3], subItems3);
	}

	public void actionPerformed(ActionEvent e) {
		String item = (String) mainComboBox.getSelectedItem();
		Object o = subItems.get(item);

		if (o == null) {
			subComboBox.setModel(new DefaultComboBoxModel());
		} else {
			subComboBox.setModel(new DefaultComboBoxModel((String[]) o));
		}

		// make sure popup is closed when 'isTableCellEditor' is used
		mainComboBox.hidePopup();
	}

	public static void main(String[] args) {
		JFrame frame = new TesteCombo();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}