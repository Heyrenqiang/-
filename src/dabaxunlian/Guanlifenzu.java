package dabaxunlian;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Guanlifenzu {
	private static int zushu = 0;
	private static int[] groupedbazhis = new int[1000];
	private static int groupedbazhinum;
	public static int[] getGroupedbazhis() {
		return groupedbazhis;
	}

	public static void setGroupedbazhis(int[] groupedbazhis) {
		Guanlifenzu.groupedbazhis = groupedbazhis;
	}

	public static int getGroupedbazhinum() {
		return groupedbazhinum;
	}

	public static void setGroupedbazhinum(int groupedbazhinum) {
		Guanlifenzu.groupedbazhinum = groupedbazhinum;
	}

	public static Bazhiz[] getBazhizs() {
		return bazhizs;
	}

	public static void setBazhizs(Bazhiz[] bazhizs) {
		Guanlifenzu.bazhizs = bazhizs;
	}

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
				//System.out.println(zushu);
				//System.out.println(i);
				Guanlifenzu.deletefenzhu(i);
				Guanlifenzu.deletepanel(i);
				// Guanlifenzu.deletepanel(Integer.parseInt(e.getActionCommand()));
				Guanlifenzu.showpanel();
			}
		});
	}
	
	public static void updatepanel(int a){
		defineJpanels[a] = new DefineJpanel(a, bazhizs[a]);
		defineJpanels[a].getButton_1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				int i;
				for (i = 0; i < zushu; i++) {
					if (defineJpanels[i + 1].getButton_1() == e.getSource()) {
						break;
					}
				}
				System.out.println(i);
				Guanlifenzu.deletefenzhu(i);
				Guanlifenzu.deletepanel(i);
				// Guanlifenzu.deletepanel(Integer.parseInt(e.getActionCommand()));
				Guanlifenzu.showpanel();
			}
		});
		
	}

	public static void creatfenzu(Bazhi[] bazhis) {		
		Definedata definedata;
		definedata=Toolsfunction.splitGroupedornot(bazhis);
		if(definedata.getYesorno()==0||definedata.getExistednum()==0){
			//点击messagebox的确定或者没有选择到重复的靶子时
			bazhizs[zushu+1]=new Bazhiz(zushu+1,definedata.getBazhis3());
			for(int i=0;i<definedata.getBazhis3().length;i++){
				definedata.getBazhis3()[i].setGroup(zushu+1);
			}
			zushu++;
			creatnewpanel();
		}else{
			
		}
	}
	public static void tianjiaDaozu(int a,Bazhi[] bazhis){
		Definedata definedata;
		definedata=Toolsfunction.splitGroupedornot(bazhis);
		if(definedata.getYesorno()==0||definedata.getExistednum()==0){
			bazhizs[a].addBazhis(definedata.getBazhis3());
			for(int i=0;i<definedata.getBazhis3().length;i++){
				definedata.getBazhis3()[i].setGroup(a);
			}
			updatepanel(a);
		}else{
			
		}
		
	}

	public static int getZushu() {
		return zushu;
	}

	public static void setZushu(int zushu) {
		Guanlifenzu.zushu = zushu;
	}

	public static String num2str(int[] a, int b) {
		String str = "";
		for (int i = 0; i < b; i++) {
			str = str + String.valueOf(a[i]) + ",";
		}
		return str.substring(0, str.length() - 1);
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
		///注意：bazhizs[]是从bazhizs[1]开始的
		boolean existed=false;
		int w=0;
		for(int k=0;k<groupedbazhinum;k++){
			for(int j=0;j<bazhizs[a+1].getBazhis().length;j++){
				if(groupedbazhis[k]==bazhizs[a+1].getBazhis()[j].getBianhao()){
					existed=true;
					break;
				}else{
					
				}
			}
			if(existed){
				existed=false;
			}else{
				groupedbazhis[w]=groupedbazhis[k];
				w++;
			}	
		}
		groupedbazhinum=w;
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
		int i;
		for (i = 0; i < zushu; i++) {
			if (defineJpanels[i + 1].getButton() == e.getSource()) {
				for (int j = 0; j < bazhizs[i + 1].getBazhis().length; j++) {
					if (bazhizs[i + 1].getBazhis()[j].getSuodingyf() != 0) {
						bazhizs[i + 1].getBazhis()[j].setIsdongzuo(true);
						bazhizs[i + 1].getBazhis()[j].setIsweidazhong(false);
						bazhizs[i + 1].getBazhis()[j].setIsxuanzhong(false);
						bazhizs[i + 1].getBazhis()[j].setIsdazhong(false);
						bazhizs[i + 1].getBazhis()[j].setSuodingyf(0);
					}
				}
				Daba1.huitupanel.displayzhengti(Daba1.tubiaos, Daba1.pointnum);
				break;
			}
		}
	}
}
