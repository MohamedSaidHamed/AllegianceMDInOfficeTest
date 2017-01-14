
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.SelectEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed
 */
@ManagedBean
@ViewScoped
public class data implements Serializable{
    
    private HashMap<Integer,String> hmap = new HashMap<>();
    private List<String> Dep = new ArrayList<>();
    private List<String> Eng = new ArrayList<>();
    private List<String> An = new ArrayList<>();
    private List<String> Su = new ArrayList<>();
    private List<String> In = new ArrayList<>();
    private List<String> Tem = new ArrayList<>();
    private String Temp = new String();
    
    
    

    public data() {
        hmap.put(0,"said"); 
        hmap.put(0,"abdo"); 
        hmap.put(1,"adel");
       
        
        Dep.add("Engineering");
        Dep.add("Anaylsis");
        Dep.add("Support");
        Dep.add("Installer");
        
        Eng.add("John");
        Eng.add("Julio");
        Eng.add("Adri");
        Eng.add("Su");
        Eng.add("Salma");
        
        An.add("A");
        An.add("B");
        An.add("C");
        An.add("D");
        An.add("E");
        
        Su.add("E");
        Su.add("F");
        Su.add("G");
        Su.add("H");
        Su.add("I");
        
        In.add("J");
        In.add("K");
        In.add("L");
        In.add("M");
        In.add("N");
        
        
//        String var = hmap.get(1); 
//        System.out.println("VAR "+var);
    }
    
    public void onRowSelect(SelectEvent event){
        String temps = (String) event.getObject();
        if(temps.equals("Engineering")){
            
            
            Tem=Eng;
            
        }
        if(temps.equals("Anaylsis")){
           
            
            Tem=An;
        }
        if(temps.equals("Support")){
            
            
            Tem=Su;
        }
        if(temps.equals("Installer")){
            
            
            Tem=In;
            
        }
    }

    public HashMap<Integer,String> getHmap() {
        return hmap;
    }

    public void setHmap(HashMap<Integer,String> hmap) {
        this.hmap = hmap;
    }

    public List<String> getDep() {
        return Dep;
    }

    public void setDep(List<String> Dep) {
        this.Dep = Dep;
    }

    public List<String> getEng() {
        return Eng;
    }

    public void setEng(List<String> Eng) {
        this.Eng = Eng;
    }

    public List<String> getAn() {
        return An;
    }

    public void setAn(List<String> An) {
        this.An = An;
    }

    public List<String> getSu() {
        return Su;
    }

    public void setSu(List<String> Su) {
        this.Su = Su;
    }

    public List<String> getIn() {
        return In;
    }

    public void setIn(List<String> In) {
        this.In = In;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String Temp) {
        this.Temp = Temp;
    }

    public List<String> getTem() {
        return Tem;
    }

    public void setTem(List<String> Tem) {
        this.Tem = Tem;
    }

   
    
    
}
