package dabaxunlian;

public class Datatest {
	private Datatest datatest;
	private static int i=0;
	public Datatest(){
		datatest=this;
	}
	private Tubiao tubiao;
	private Bazhi bazhi;
	private Dabarenyuan dabarenyuan;
	private boolean state=true;
	public void start() {
		tubiao=new Tubiao();
		bazhi=new Bazhi();
		dabarenyuan=new Dabarenyuan();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
					i++;
					//System.out.println();
					bazhi.setIsdazhong(!state);
					state=!state;
					bazhi.setIsweidazhong(!bazhi.isIsdazhong());
					tubiao=bazhi;
					//tubiao.setName("i am "+String.valueOf(i));
					//action.act(context, i,data);
					daba1.dataUpdate(tubiao);
				}
			}
		}).start();
	}
	private Daba1 daba1;
	public void setActionListener(Daba1 daba1){
		this.daba1=daba1;
	}

}
