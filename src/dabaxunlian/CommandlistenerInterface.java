package dabaxunlian;

public interface CommandlistenerInterface {
	public void groupinfoUpdate(Bazhiz[] bazhizs);//������Ϣ������Ϊ������������飬ÿһ������������������������Ϣ
	public void systemInitialize();//ϵͳ��ʼ��
	public void systemStart();//ϵͳ��ʼ����
	public void syatemStop();//ϵͳֹͣ����
	public void bazhiAction(Bazhi bazhi);//���Ӷ���������,����Ϊһ������
	public void bazhisAction(Bazhi[] bazhis);//һ����Ӷ������������Ϊ������
}
