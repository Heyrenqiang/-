package dabaxunlian;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guanlifenzu {
	private static int zushu = 0;
	private static DefineJpanel[] defineJpanels = new DefineJpanel[1000];
	private static Bazhiz[] bazhizs = new Bazhiz[100];

	public static void creatnewpanel() {

		defineJpanels[zushu] = new DefineJpanel(zushu, bazhizs[zushu]);
		defineJpanels[zushu].getButton_1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int i;
				for (i = 0; i < zushu; i++) {
					if (defineJpanels[i + 1].getButton_1() == e.getSource()) {
						break;
					}
				}
				Guanlifenzu.deletefenzhu(i);
				Guanlifenzu.deletepanel(i);
				// Guanlifenzu.deletepanel(Integer.parseInt(e.getActionCommand()));
				Guanlifenzu.showpanel();
			}
		});
	}

	public static void creatfenzu(Bazhi[] bazhis) {
		bazhizs[zushu + 1] = new Bazhiz(zushu + 1, bazhis);
		zushu++;
	}

	public static void showpanel() {
		Daba1.tmuiControlPanel.getPanel_7().removeAll();
		Daba1.tmuiControlPanel.getPanel_7().repaint();
		for (int i = 0; i < zushu; i++) {
			Daba1.tmuiControlPanel.getPanel_7().setPreferredSize(new Dimension(0, (zushu) * 63 + 5));
			Daba1.tmuiControlPanel.getPanel_7().add(defineJpanels[i + 1]);
			Daba1.tmuiControlPanel.getScrollPane().setViewportView(Daba1.tmuiControlPanel.getPanel_7());
		}
		Daba1.tmuiControlPanel.getPanel_7().repaint();

	}

	public static void deletefenzhu(int a) {
		for (int i = a; i < zushu; i++) {
			bazhizs[i] = bazhizs[i + 1];
		}
		bazhizs[zushu] = null;
		zushu--;
	}

	public static void deletepanel(int a) {
		for (int i = a; i < zushu + 1; i++) {
			defineJpanels[i] = defineJpanels[i + 1];
			defineJpanels[i].getLabel().setText("组" + String.valueOf(i) + ":");
			defineJpanels[i].repaint();
		}
		defineJpanels[zushu + 1] = null;
	}

	// @Override
	public static void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
//		int i;
//		for (i = 0; i < zushu; i++) {
//			if (defineJpanels[i + 1].getButton() == e.getSource()) {
//				for (int j = 0; j < Daba1.pointnum; j++) {
//					if (Daba1.data[j][2] == 1) {
//						for (int k = 0; k < bazhizs[i+1].getBazhisnum().length; k++) {
//							if ((Daba1.data[j][3] == bazhizs[i+1].getBazhisnum()[k])&&(Daba1.data[j][8]!=0)) {
//								Daba1.data[j][4] = 1;
//								Daba1.data[j][5] = 0;
//								Daba1.data[j][6] = 0;
//								Daba1.data[j][7] = 0;
//								Daba1.data[j][8] = 0;
//								//System.out.println("dads");
//							}
//						}
//					}
//				}
//				Daba1.huitupanel.display(Daba1.data,Daba1.pointnum);
//				break;
//			}
//		}
		//System.out.println(i);
//		if (i < zushu) {
//			for (int j = 0; j < Daba1.pointnum; j++) {
//				if (Daba1.data[j][2] == 1) {
//					for (int k = 0; k < bazhizs[i+1].getBazhisnum().length; k++) {
//						if ((Daba1.data[j][3] == bazhizs[i+1].getBazhisnum()[k])&&(Daba1.data[j][8]!=0)) {
//							Daba1.data[j][4] = 1;
//							Daba1.data[j][5] = 0;
//							Daba1.data[j][6] = 0;
//							Daba1.data[j][7] = 0;
//							Daba1.data[j][8] = 0;
//							//System.out.println("dads");
//						}
//					}
//				}
//			}
//		}
		
		// Guanlifenzu.deletepanel(i);
		// Guanlifenzu.deletepanel(Integer.parseInt(e.getActionCommand()));
		//Guanlifenzu.showpanel();
//////////////////////////////////////////////////////////////////////////////		
		int i;
		for (i = 0; i < zushu; i++) {
			if (defineJpanels[i + 1].getButton() == e.getSource()) {
				for(int j=0;j<bazhizs[i+1].getBazhis().length;j++){
					if(bazhizs[i+1].getBazhis()[j].getSuodingyf()!=0){
						bazhizs[i+1].getBazhis()[j].setIsdongzuo(true);
						bazhizs[i+1].getBazhis()[j].setIsweidazhong(false);
						bazhizs[i+1].getBazhis()[j].setIsxuanzhong(false);
						bazhizs[i+1].getBazhis()[j].setIsdazhong(false);
						bazhizs[i+1].getBazhis()[j].setSuodingyf(0);
					}
				}
				Daba1.huitupanel.displayzhengti(Daba1.tubiaos,Daba1.pointnum );
				break;
			}
		}
	}
}
