package dabaxunlian;

public class Commandsending implements CommandlistenerInterface{

	@Override
	public void groupinfoUpdate(Bazhiz[] bazhizs) {
		// TODO �Զ����ɵķ������
		System.out.println("������Ϣ����");
	}

	@Override
	public void systemInitialize() {
		// TODO �Զ����ɵķ������
		System.out.println("��ʼ��");
	}

	@Override
	public void systemStart() {
		// TODO �Զ����ɵķ������
		System.out.println("ϵͳ����");
	}

	@Override
	public void syatemStop() {
		// TODO �Զ����ɵķ������
		System.out.println("ϵͳֹͣ");
	}

	@Override
	public void bazhiAction(Bazhi bazhi) {
		// TODO �Զ����ɵķ������
		System.out.println("һ�����Ӷ���");
	}

	@Override
	public void bazhisAction(Bazhi[] bazhis) {
		// TODO �Զ����ɵķ������
		System.out.println("������Ӷ���");
	}
}
