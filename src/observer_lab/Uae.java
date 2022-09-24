
package observer_lab;

public class Uae implements Observers {
    @Override
     public void update(Source o){
        System.out.println("Thai  "+((HeadQuater)o).getThaiData()+"-"
                                   +((HeadQuater)o).getUaeData()+"  UAE");
      
    }
}
