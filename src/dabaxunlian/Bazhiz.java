package dabaxunlian;

import dabaxunlian.Bazhi;

public class Bazhiz {
	private int pingbanhao;
	private int[] bazhisnum;
	private Bazhi[] bazhis;
	public int getPingbanhao() {
		return pingbanhao;
	}
	public void setPingbanhao(int pingbanhao) {
		this.pingbanhao = pingbanhao;
	}
	public Bazhiz(){
		
	}
	public Bazhiz(int pingbanhao, Bazhi[] bazhis) {
		this.pingbanhao = pingbanhao;
		this.bazhis = bazhis;
		bazhisnum=new int[bazhis.length];
		for(int i=0;i<bazhis.length;i++){
			bazhisnum[i]=bazhis[i].getBianhao();
		}
	}
	public int[] getBazhisnum() {
		return bazhisnum;
	}
	public void setBazhisnum(int[] bazhisnum) {
		this.bazhisnum = bazhisnum;
	}
	public Bazhi[] getBazhis() {
		return bazhis;
	}
	public void setBazhis(Bazhi[] bazhis) {
		this.bazhis = bazhis;
	}

}
