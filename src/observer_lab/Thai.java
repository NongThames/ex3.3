package observer_lab;

public class Thai implements Observers {

    /**
     *
     * @param o
     */
    @Override
    public void update(Source o){
        System.out.println("Thai  "+((HeadQuater)o).getThaiData()+"-"
                                   +((HeadQuater)o).getUaeData()+"  UAE");
      
    }
}
