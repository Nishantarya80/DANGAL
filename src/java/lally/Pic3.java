package lally;
// Generated 30 Dec, 2016 2:48:40 PM by Hibernate Tools 4.3.1



/**
 * Pic3 generated by hbm2java
 */
public class Pic3  implements java.io.Serializable {


     private int id;
     private String img;

    public Pic3() {
    }

	
    public Pic3(int id) {
        this.id = id;
    }
    public Pic3(int id, String img) {
       this.id = id;
       this.img = img;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getImg() {
        return this.img;
    }
    
    public void setImg(String img) {
        this.img = img;
    }




}


