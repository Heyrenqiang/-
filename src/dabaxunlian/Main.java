package dabaxunlian;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//Daba1 mainfoem =new Daba1("��п��ƽ���");
		new Daba1("��п��ƽ���");
	}

}
