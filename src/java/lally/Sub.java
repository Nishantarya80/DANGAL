package lally;
// Generated 30 Dec, 2016 2:48:40 PM by Hibernate Tools 4.3.1



/**
 * Sub generated by hbm2java
 */
public class Sub  implements java.io.Serializable {


     private int link;
     private Integer id;
     private String name;
     private String url;

    public Sub() {
    }

	
    public Sub(int link) {
        this.link = link;
    }
    public Sub(int link, Integer id, String name, String url) {
       this.link = link;
       this.id = id;
       this.name = name;
       this.url = url;
    }
   
    public int getLink() {
        return this.link;
    }
    
    public void setLink(int link) {
        this.link = link;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }




}


