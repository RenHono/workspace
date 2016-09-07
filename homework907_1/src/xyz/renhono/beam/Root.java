package xyz.renhono.beam;

public class Root {

    private String status;

    private Paramz paramz;

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setParamz(Paramz paramz){
        this.paramz = paramz;
    }
    public Paramz getParamz(){
        return this.paramz;
    }
	@Override
	public String toString() {
		return "Root [status=" + status + ", paramz=" + paramz + "]";
	}
}
