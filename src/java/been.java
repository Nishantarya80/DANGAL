/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import lally.Menu;
import org.hibernate.Query;

import org.hibernate.Session;
import org.primefaces.context.RequestContext;


/**
 *
 * @author Home
 */
@ManagedBean
@RequestScoped
public class been {
private List<String> images;
private List<String> images2;
private List<String> menu,sta,abo,img,atr;
Integer flag;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

Query q;
Session ses;

    public List<String> getAtr() {
        


        return atr;
    }

    public void setAtr(List<String> atr) {
        this.atr = atr;
    }
  
    public List<String> getAbo() {
        ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT E.text,E.id2,E.piclink,E.vidlink FROM Am E");
        abo=(List<String>)q.list();
        ses.close();
        return abo;
    }

    public void setAbo(List<String> abo) {
        this.abo = abo;
    }

    public List<String> getImg() {
        ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT E.img FROM Pic3 E");
        img=(List<String>)q.list();
        ses.close();
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }

    
    
    public List<String> getMenu() {
        ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT E.menu,E.issubmenu,E.link,E.icon FROM Menu E");
        menu=(List<String>)q.list();
        ses.close();
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }
    public List<String> getSta() {
         ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT q.name,q.url,q.link,q.id  FROM Sub q");
        sta=(List<String>)q.list();
        ses.close();
        return sta;
    }

    public void setSta(List<String> sta) {
        this.sta = sta;
    }


    public List<String> getImages2() {
        ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT E.pic FROM Pic2 E");
        images2=(List<String>)q.list();
        ses.close();
        return images2;
    }

    public void setImages2(List<String> images2) {
        this.images2 = images2;
    }

    public List<String> getImages() {
        ses=HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        q=ses.createQuery("SELECT E.pic FROM Pic E");
        images=(List<String>)q.list();
        ses.close();
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
    
  
    /**
     * Creates a new instance of been
     */
    
    
    
//    @PostConstruct
//     public void init() {
//        images = new ArrayList<>();
//        for (int i = 1; i <= 8; i++) {
//            images.add( i+".jpg");
//        }
//        images2 = new ArrayList<>();
//        for (int j=1;j<=19;j++){
//            if(j!=9 && j!=10)
//            images2.add(j+".jpg");
//        }
//        
//    }
 
   
    public been() {
    }
    
}
