package dabaxunlian;

public class Bazhi extends Tubiao{
	private int bianhao;
	public int getBianhao() {
		return bianhao;
	}
	public void setBianhao(int bianhao) {
		this.bianhao = bianhao;
	}
	public Bazhi(){
		
	}
	public Bazhi(int bianhao, int chengji, int zuhao, int suodingyf, boolean isdongzuo, boolean isxuanzhong,
			boolean isweidazhong, boolean isdazhong, String qiya, String dianliang) {
		super();
		this.bianhao = bianhao;
		this.chengji = chengji;
		this.zuhao = zuhao;
		this.suodingyf = suodingyf;
		this.isdongzuo = isdongzuo;
		this.isxuanzhong = isxuanzhong;
		this.isweidazhong = isweidazhong;
		this.isdazhong = isdazhong;
		this.qiya = qiya;
		this.dianliang = dianliang;
	}
	private int chengji;
	private int zuhao;
	private int suodingyf;
	private boolean isdongzuo;
	private boolean isxuanzhong;
	private boolean isweidazhong;
	private boolean isdazhong;
	private String qiya;
	private String dianliang;
	public int getChengji() {
		return chengji;
	}
	public void setChengji(int chengji) {
		this.chengji = chengji;
	}
	public int getZuhao() {
		return zuhao;
	}
	public void setZuhao(int zuhao) {
		this.zuhao = zuhao;
	}
	public int getSuodingyf() {
		return suodingyf;
	}
	public void setSuodingyf(int suodingyf) {
		this.suodingyf = suodingyf;
	}
	public boolean isIsdongzuo() {
		return isdongzuo;
	}
	public void setIsdongzuo(boolean isdongzuo) {
		this.isdongzuo = isdongzuo;
	}
	public boolean isIsxuanzhong() {
		return isxuanzhong;
	}
	public void setIsxuanzhong(boolean isxuanzhong) {
		this.isxuanzhong = isxuanzhong;
	}
	public boolean isIsweidazhong() {
		return isweidazhong;
	}
	public void setIsweidazhong(boolean isweidazhong) {
		this.isweidazhong = isweidazhong;
	}
	public boolean isIsdazhong() {
		return isdazhong;
	}
	public void setIsdazhong(boolean isdazhong) {
		this.isdazhong = isdazhong;
	}
	public String getQiya() {
		return qiya;
	}
	public void setQiya(String qiya) {
		this.qiya = qiya;
	}
	public String getDianliang() {
		return dianliang;
	}
	public void setDianliang(String dianliang) {
		this.dianliang = dianliang;
	}
}
