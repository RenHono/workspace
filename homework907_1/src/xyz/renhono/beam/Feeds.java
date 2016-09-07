package xyz.renhono.beam;

public class Feeds
{
    private int id;

    private int oid;

    private String category;

    private Data data;

    @Override
	public String toString() {
		return "Feeds [id=" + id + ", oid=" + oid + ", category=" + category + ", data=" + data + "]";
	}
	public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setOid(int oid){
        this.oid = oid;
    }
    public int getOid(){
        return this.oid;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }
    public void setData(Data data){
        this.data = data;
    }
    public Data getData(){
        return this.data;
    }
}