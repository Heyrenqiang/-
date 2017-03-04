package dabaxunlian;

import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextPane;
//import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;

public class TMUITargetStatusPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JScrollPane scrollPane;
	private JList list;

	/**
	 * Create the panel.
	 */
	public TMUITargetStatusPanel() {
		setBorder(BorderFactory.createLineBorder(Color.white));// 设置面板边框颜色
		setLayout(new GridLayout(0, 2, 0, 0));
		setPreferredSize(new Dimension(0, 150));
		
		JPanel panel = new JPanel();
		add(panel);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel.setBorder(BorderFactory.createTitledBorder("系统消息"));
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createLineBorder(Color.white, 1, true));
		panel.add(scrollPane, BorderLayout.CENTER);
		
		list = new JList();
		list.setFont(new Font("宋体", Font.PLAIN, 20));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"8\uFF1A00", "9\uFF1A00", "10\uFF1A00", "11\uFF1A00", "12\uFF1A00", "8\uFF1A00", "9\uFF1A00", "10\uFF1A00", "11\uFF1A00", "12\uFF1A00"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
//		list.setCellRenderer(new DefaultListCellRenderer() {
//            public void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.setColor(Color.black);
//                g.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
//            }
//        });
		scrollPane.setViewportView(list);
		MatteBorder border=new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY);
		panel_1.setBorder(BorderFactory.createTitledBorder("成绩"));
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField = new JTextField();
		panel_1.add(textField);
		//textField.setColumns(10);
		textField.setBorder(border);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		//textField_4.setColumns(10);
		textField_4.setBorder(border);
		
		textField_6 = new JTextField();
		panel_1.add(textField_6);
		//textField_6.setColumns(10);
		textField_6.setBorder(border);		
		textField_7 = new JTextField();
		panel_1.add(textField_7);
		//textField_7.setColumns(10);
		textField_7.setBorder(border);
	}

}
