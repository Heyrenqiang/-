package dabaxunlian;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.xml.crypto.Data;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class Huitupanel extends JPanel {
	/**
	 * Create the panel.
	 */
	ImageIcon icon1 = new ImageIcon("image/10_u835.png");// ����
	ImageIcon icon2 = new ImageIcon("image/u686.png");// ��Ա
	ImageIcon icon3 = new ImageIcon("image/_3-10_u844.png");// ����
	ImageIcon icon4 = new ImageIcon("image/10_u835_selected.png");// ѡ��
	ImageIcon icon5 = new ImageIcon("image/_3-10_u842.png");// δ����
	ImageIcon icon6 = new ImageIcon("image/����1-3_u926.png");// ����

	Image image1 = icon1.getImage();
	Image image2 = icon2.getImage();
	Image image3 = icon3.getImage();
	Image image4 = icon4.getImage();
	Image image5 = icon5.getImage();
	Image image6 = icon6.getImage();
	private int[][] datas = new int[1000][5];
	private int nums;
	private int painwitch;

	public int getPainwitch() {
		return painwitch;
	}

	private Tubiao[] tubiaos;
	private Bazhi[] bazhis;
	private Dabarenyuan[] dabarenyuans;

	public void setPainwitch(int painwitch) {
		this.painwitch = painwitch;
	}

	private int shadowx, shadowy, shadowx1, shadowy1;
	private int tlpanex, tlpaney;
	private int bahao;
	private JLabel[] labels = new JLabel[1000];

	public Huitupanel() {
		setLayout(null);
	}

	@Override
	public void paint(Graphics g) {
		// ���õ�super.paint(g),�ø�����һЩ��ǰ�Ĺ�������ˢ����Ļ
//		super.paint(g);
//		removeAll();
//		Graphics2D g2d = (Graphics2D) g;
//		g2d.setColor(Color.black);// ���û�ͼ����ɫ
//		for (int i = 0; i < nums; i++) {
//			// add(jLabel);
//			labels[i] = new JLabel();
//			if (datas[i][2] == 1) {
//				labels[i].setText("�ɼ�:");
//			} else {
//				labels[i].setText("   " + String.valueOf(datas[i][3]));
//			}
//			labels[i].setBackground(SystemColor.inactiveCaption);
//			labels[i].setOpaque(true);
//			labels[i].setBorder(new LineBorder(new Color(0, 0, 0)));
//			switch (datas[i][2]) {
//			case 1: {
//				if (datas[i][6] == 1) {
//					labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//					add(labels[i]);
//					g2d.drawImage(image5, datas[i][0], datas[i][1], null);
//				} else if (datas[i][7] == 1) {
//					labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//					add(labels[i]);
//					g2d.drawImage(image6, datas[i][0], datas[i][1] - 3, null);
//				} else if (datas[i][5] == 1) {
//					labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//					add(labels[i]);
//					g2d.drawImage(image4, datas[i][0], datas[i][1], null);
//				} else if (datas[i][4] == 1) {
//					labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//					add(labels[i]);
//					g2d.drawImage(image3, datas[i][0] + 10, datas[i][1], null);
//				} else {
//					labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//					add(labels[i]);
//					g2d.drawImage(image1, datas[i][0], datas[i][1], null);
//				}
//			}
//				break;
//			case 0: {
//				labels[i].setBounds(datas[i][0] + 5, datas[i][1] - 24, 44, 24);
//				add(labels[i]);
//				g2d.drawImage(image2, datas[i][0] + 10, datas[i][1], null);
//				// }
//			}
//				break;
//			}
//		}
//		revalidate();
//		repaint();
//		if (painwitch == 5) {
//			new Font("����", Font.PLAIN, 12);
//			g2d.setColor(Color.blue);// ���õ�ǰ��ͼ��ɫ
//			g2d.fill3DRect(tlpanex - 3, tlpaney - 60, 60, 60, false);
//			g2d.setColor(Color.black);
//			g2d.drawString("�飺", tlpanex - 3 + 2, tlpaney - 54 + 12 - 6);// �����ı�
//			g2d.drawString("�кţ�" + String.valueOf(bahao), tlpanex - 3 + 2, tlpaney - 54 + 24 + 2 - 6);// �����ı�
//			g2d.drawString("��ѹ��", tlpanex - 3 + 2, tlpaney - 54 + 36 + 4 - 6);// �����ı�
//			g2d.drawString("������", tlpanex - 3 + 2, tlpaney - 54 + 48);// �����ı�
//		}
//		if (painwitch == 6) {
//			new Font("����", Font.PLAIN, 12);
//			g2d.setColor(Color.blue);// ���õ�ǰ��ͼ��ɫ
//			g2d.fill3DRect(tlpanex - 3, tlpaney - 40, 60, 40, false);
//			g2d.setColor(Color.black);
//			g2d.drawString("������", tlpanex - 3 + 2, tlpaney - 40 + 12 + 4);// �����ı�
//			g2d.drawString("��ţ�" + String.valueOf(bahao), tlpanex - 3 + 2, tlpaney - 40 + 12 + 6 + 12 + 2);// �����ı�
//		}
//		Stroke dash = new BasicStroke(2.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 3.5f, new float[] { 15, 10, },
//				0f);
//		g2d.setStroke(dash);
//		if (painwitch == 1) {
//			g2d.drawRect(shadowx, shadowy, shadowx1 - shadowx, shadowy1 - shadowy);
//
//		} else if (painwitch == 2) {
//			g2d.drawRect(shadowx, shadowy1, shadowx1 - shadowx, shadowy - shadowy1);
//		} else if (painwitch == 3) {
//			g2d.drawRect(shadowx1, shadowy1, shadowx - shadowx1, shadowy - shadowy1);
//		} else if (painwitch == 4) {
//			g2d.drawRect(shadowx1, shadowy, shadowx - shadowx1, shadowy1 - shadowy);
//		}
//		this.validate();		
/////////////////////////////////////////////////////////////////////////////
		// ���õ�super.paint(g),�ø�����һЩ��ǰ�Ĺ�������ˢ����Ļ
				super.paint(g);
				removeAll();
				Graphics2D g2d = (Graphics2D) g;
				g2d.setColor(Color.black);// ���û�ͼ����ɫ
				for (int i = 0; i < nums; i++) {
					// add(jLabel);
					labels[i] = new JLabel();
					if (tubiaos[i] instanceof Bazhi) {
						labels[i].setText("�ɼ�:");
					} else if(tubiaos[i] instanceof Dabarenyuan){
						labels[i].setText("   " + String.valueOf(((Dabarenyuan)(tubiaos[i])).getBianhao()));
					}
					labels[i].setBackground(SystemColor.inactiveCaption);
					labels[i].setOpaque(true);
					labels[i].setBorder(new LineBorder(new Color(0, 0, 0)));

					if (tubiaos[i] instanceof Bazhi) {
						if (((Bazhi)(tubiaos[i])).isIsweidazhong()==true) {
							labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
							add(labels[i]);
							g2d.drawImage(image5, tubiaos[i].getPointx(), tubiaos[i].getPointy(), null);
						} else if (((Bazhi)(tubiaos[i])).isIsdazhong()==true) {
							labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
							add(labels[i]);
							g2d.drawImage(image6, tubiaos[i].getPointx(), tubiaos[i].getPointy() - 3, null);
						} else if (((Bazhi)(tubiaos[i])).isIsxuanzhong()==true) {
							labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
							add(labels[i]);
							g2d.drawImage(image4, tubiaos[i].getPointx(), tubiaos[i].getPointy(), null);
						} else if (((Bazhi)(tubiaos[i])).isIsdongzuo()==true) {
							labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
							add(labels[i]);
							g2d.drawImage(image3, tubiaos[i].getPointx() + 10, tubiaos[i].getPointy(), null);
						} else {
							labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
							add(labels[i]);
							g2d.drawImage(image1, tubiaos[i].getPointx(), tubiaos[i].getPointy(), null);
						}
					} else if (tubiaos[i] instanceof Dabarenyuan) {
						labels[i].setBounds(tubiaos[i].getPointx() + 5, tubiaos[i].getPointy() - 24, 44, 24);
						add(labels[i]);
						g2d.drawImage(image2, tubiaos[i].getPointx() + 10, tubiaos[i].getPointy(), null);
					}
				}
				revalidate();
				repaint();
				if (painwitch == 5) {
					new Font("����", Font.PLAIN, 12);
					g2d.setColor(Color.blue);// ���õ�ǰ��ͼ��ɫ
					g2d.fill3DRect(tlpanex - 3, tlpaney - 60, 60, 60, false);
					g2d.setColor(Color.black);
					g2d.drawString("�飺", tlpanex - 3 + 2, tlpaney - 54 + 12 - 6);// �����ı�
					g2d.drawString("�кţ�" + String.valueOf(bahao), tlpanex - 3 + 2, tlpaney - 54 + 24 + 2 - 6);// �����ı�
					g2d.drawString("��ѹ��", tlpanex - 3 + 2, tlpaney - 54 + 36 + 4 - 6);// �����ı�
					g2d.drawString("������", tlpanex - 3 + 2, tlpaney - 54 + 48);// �����ı�
				}
				if (painwitch == 6) {
					new Font("����", Font.PLAIN, 12);
					g2d.setColor(Color.blue);// ���õ�ǰ��ͼ��ɫ
					g2d.fill3DRect(tlpanex - 3, tlpaney - 40, 60, 40, false);
					g2d.setColor(Color.black);
					g2d.drawString("������", tlpanex - 3 + 2, tlpaney - 40 + 12 + 4);// �����ı�
					g2d.drawString("��ţ�" + String.valueOf(bahao), tlpanex - 3 + 2, tlpaney - 40 + 12 + 6 + 12 + 2);// �����ı�
				}
				Stroke dash = new BasicStroke(2.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 3.5f, new float[] { 15, 10, },
						0f);
				g2d.setStroke(dash);
				if (painwitch == 1) {
					g2d.drawRect(shadowx, shadowy, shadowx1 - shadowx, shadowy1 - shadowy);

				} else if (painwitch == 2) {
					g2d.drawRect(shadowx, shadowy1, shadowx1 - shadowx, shadowy - shadowy1);
				} else if (painwitch == 3) {
					g2d.drawRect(shadowx1, shadowy1, shadowx - shadowx1, shadowy - shadowy1);
				} else if (painwitch == 4) {
					g2d.drawRect(shadowx1, shadowy, shadowx - shadowx1, shadowy1 - shadowy);
				}
				this.validate();	
		
	}

	public void display(int[][] data, int num) {
		nums = num;
		datas = data;
		this.repaint();

	}

	public void display2(int x, int y, int x1, int x2, int[][] data) {

		this.shadowx = x;
		this.shadowy = y;
		this.shadowx1 = x1;
		this.shadowy1 = x2;
		datas = data;
		this.repaint();
	}

	public void display3(int x, int y, int[][] data, int z) {

		this.tlpanex = x;
		this.tlpaney = y;
		this.bahao = z;
		datas = data;
		this.repaint();
	}

	public void displayzhengti(Tubiao[] tubiaos,int num) {
		this.tubiaos = tubiaos;
		this.nums=num;
		this.repaint();
	}
	public void displayjuxing(int x, int y, int x1, int x2, Tubiao[] tubiaos) {

		this.shadowx = x;
		this.shadowy = y;
		this.shadowx1 = x1;
		this.shadowy1 = x2;
		this.tubiaos=tubiaos;
		this.repaint();
	}
	public void displayxinxi(int x, int y,Tubiao[] tubiaos,int z) {

		this.tlpanex = x;
		this.tlpaney = y;
		this.tubiaos=tubiaos;
		this.bahao=z;
		this.repaint();
	}
}
