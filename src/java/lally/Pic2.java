package lally;
// Generated 30 Dec, 2016 2:48:40 PM by Hibernate Tools 4.3.1



/**
 * Pic2 generated by hbm2java
 */
public class Pic2  implements java.io.Serializable {


     private int id;
     private String pic;

    public Pic2() {
    }

	
    public Pic2(int id) {
        this.id = id;
    }
    public Pic2(int id, String pic) {
       this.id = id;
       this.pic = pic;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }




}


