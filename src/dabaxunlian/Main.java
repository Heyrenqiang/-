package dabaxunlian;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	private static Daba1 mainform;

	public static Daba1 getMainform() {
		return mainform;
	}

	public static void setMainform(Daba1 mainform) {
		Main.mainform = mainform;
	}

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
		mainform =new Daba1("��п��ƽ���");
		Datatest datatest=new Datatest();
		Commandsending commandsending=new Commandsending();
		mainform.addlistener(commandsending);
		datatest.setActionListener(mainform);
	}

}
