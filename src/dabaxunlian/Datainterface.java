package dabaxunlian;

public interface Datainterface {
	public void dataInitial(Bazhi[] bazhis,Dabarenyuan[] dabarenyuans);//���ݳ�ʼ��������Ϊ��������ʹ����Ա����
	public void dataInitial(Tubiao[] tubiaos);//���ݳ�ʼ�����������һ����˼������Ϊͼ�����飬ͼ���ǰ��Ӻʹ����Ա�ĸ���
	
	
	public void dataUpdate(Bazhi[] bazhis,Dabarenyuan[] dabarenyuans);//���ݸ��£�����Ϊ��������ʹ����Ա����
	public void dataUpdate(Tubiao[] tubiaos);//���ݸ��º��������˼һ��������Ϊͼ�����飬ͼ���ǰ��Ӻʹ����Ա�ĸ���
}
