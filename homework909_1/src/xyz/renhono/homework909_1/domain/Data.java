package xyz.renhono.homework909_1.domain;

public class Data
{
    private String id;

    private String title;

    private String name;

    private String link;

    private String content;

    private String image;

    private String image_s;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLink(String link){
        this.link = link;
    }
    public String getLink(){
        return this.link;
    }
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage_s(String image_s){
        this.image_s = image_s;
    }
    public String getImage_s(){
        return this.image_s;
    }
	@Override
	public String toString() {
		return "Data [id=" + id + ", title=" + title + ", name=" + name + ", link=" + link + ", content=" + content
				+ ", image=" + image + ", image_s=" + image_s + "]";
	}
}
