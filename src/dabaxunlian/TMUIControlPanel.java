package dabaxunlian;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TMUIControlPanel extends JPanel {
	private JTextField textField;
	public JPanel panel_1 = new JPanel();
	private JPanel panel_7;
	private JScrollPane scrollPane;
	DefineJpanel defineJpanel;
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	public JPanel getPanel_7() {
		return panel_7;
	}
	public void setPanel_7(JPanel panel_7) {
		this.panel_7 = panel_7;
	}
	/**
	 * Create the panel.
	 */
	public TMUIControlPanel() {
		setBorder(BorderFactory.createLineBorder(Color.white));// …Ë÷√√Ê∞Â±ﬂøÚ—’…´
		setLayout(new BorderLayout(0, 0));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new LineBorder(Color.WHITE));
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		add(tabbedPane, BorderLayout.CENTER);
		
		//tabbedPane.setMargin(new Insets(top, left, bottom, right));
		
		tabbedPane.addTab("    \u5206  \u7EC4    ", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		panel_7=new JPanel();
		scrollPane.setViewportView(panel_7);
		
		JButton btnNewButton_1 = new JButton("\u6DFB\u52A0\u5206\u7EC4");
		panel_1.add(btnNewButton_1, BorderLayout.SOUTH);
		//pa
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("    \u4EBA  \u5458    ", null, panel, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("    \u9776  \u5B50    ", null, panel_2, null);
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("");
		panel_2.add(textArea);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.WEST);
		
		JPanel panel_4 = new JPanel();
		add(panel_4, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		add(panel_5, BorderLayout.SOUTH);
		
		JPanel panel_6 = new JPanel();
		add(panel_6, BorderLayout.EAST);

	}
}
