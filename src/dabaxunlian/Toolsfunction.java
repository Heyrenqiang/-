package dabaxunlian;

import javax.swing.JOptionPane;

public class Toolsfunction {
	private Definedata definedata;

	public Definedata getDefinedata() {
		return definedata;
	}

	public void setDefinedata(Definedata definedata) {
		this.definedata = definedata;
	}

	public static String num2str(int[] a) {
		String string = "";
		for (int i = 0; i < a.length; i++) {
			string = string + String.valueOf(a[i]) + ",";
		}
		if (a.length > 0) {
			string = string.substring(0, string.length() - 1);
		}
		return string;
	}

	public static int[] str2num(String string) {
		String[] strings = string.split(",");
		int w = strings.length;
		int[] a;
		if (!strings[0].equals("")) {
			a = new int[w];
			for (int i = 0; i < w; i++) {
				a[i] = Integer.parseInt(strings[i]);
			}
		} else {
			a = new int[0];
		}
		return a;

	}

	public static Definedata splitGroupedornot(Bazhi[] bazhis) {
		int k = Guanlifenzu.getGroupedbazhinum();
		boolean isexist = false;
		Bazhi[] bazhis2 = new Bazhi[100];
		int num = 0;
		int[] existedbazhi = new int[100];
		int existednum = 0;
		int yesorno = 10;
		for (int i = 0; i < bazhis.length; i++) {
			for (int j = 0; j < k; j++) {
				if (bazhis[i].getBianhao() == Guanlifenzu.getGroupedbazhis()[j]) {
					isexist = true;
					break;
				} else {

				}
			}
			if (isexist) {
				existedbazhi[existednum] = bazhis[i].getBianhao();
				existednum++;
				isexist=false;
			} else {
				//groupedbazhis[groupedbazhinum] = bazhis[i].getBianhao();
				Guanlifenzu.getGroupedbazhis()[Guanlifenzu.getGroupedbazhinum()]= bazhis[i].getBianhao();
				//groupedbazhinum++;
				Guanlifenzu.setGroupedbazhinum(Guanlifenzu.getGroupedbazhinum()+1);
				bazhis2[num] = bazhis[i];
				num++;
			}
		}
		Bazhi[] bazhis3 = new Bazhi[num];
		for (int i = 0; i < num; i++) {
			bazhis3[i] = bazhis2[i];
		}
		if (existednum > 0) {
			String string = Guanlifenzu.num2str(existedbazhi, existednum);
			yesorno = JOptionPane.showConfirmDialog(null, string + "已经被分组,是否继续？", "", JOptionPane.YES_NO_OPTION);
		}
		Definedata definedata=new Definedata();
		definedata.setYesorno(yesorno);
		definedata.setExistednum(existednum);
		definedata.setBazhis3(bazhis3);
		return definedata;

	}
}

class Definedata {
	private int yesorno;
	private int existednum;
	private Bazhi[] bazhis3;
	public int getYesorno() {
		return yesorno;
	}
	public void setYesorno(int yesorno) {
		this.yesorno = yesorno;
	}
	public int getExistednum() {
		return existednum;
	}
	public void setExistednum(int existednum) {
		this.existednum = existednum;
	}
	public Bazhi[] getBazhis3() {
		return bazhis3;
	}
	public void setBazhis3(Bazhi[] bazhis3) {
		this.bazhis3 = bazhis3;
	}

}
