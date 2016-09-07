package xyz.renhono.beam;

public class Data {
	 private String subject;

	    private String summary;

	    private String cover;

	    private String pic;

	    private String format;

	    private String changed;

	    public void setSubject(String subject){
	        this.subject = subject;
	    }
	    public String getSubject(){
	        return this.subject;
	    }
	    public void setSummary(String summary){
	        this.summary = summary;
	    }
	    public String getSummary(){
	        return this.summary;
	    }
	    public void setCover(String cover){
	        this.cover = cover;
	    }
	    public String getCover(){
	        return this.cover;
	    }
	    public void setPic(String pic){
	        this.pic = pic;
	    }
	    public String getPic(){
	        return this.pic;
	    }
	    public void setFormat(String format){
	        this.format = format;
	    }
	    public String getFormat(){
	        return this.format;
	    }
	    public void setChanged(String changed){
	        this.changed = changed;
	    }
	    public String getChanged(){
	        return this.changed;
	    }
		@Override
		public String toString() {
			return "Data [subject=" + subject + ", summary=" + summary + ", cover=" + cover + ", pic=" + pic
					+ ", format=" + format + ", changed=" + changed + "]";
		}
}
