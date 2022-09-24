package observer_lab;

import java.util.ArrayList;

public class HeadQuater implements Source {
    private final ArrayList<Observers> list ;
    private int thaiData;
    private int uaeData;
    
    public HeadQuater() {
        this.list = new ArrayList<Observers>();
    }
     
    public void setData(int thaiData, int uaeData) {
        this.thaiData = thaiData;
        this.uaeData = uaeData;
        notifyObserver();
    }
    
    public int getThaiData(){
        return thaiData;
    }

    public int getUaeData() {
        return uaeData;
    }
    
    @Override
    public void register(Observers observer){
        list.add(observer);
    }
    
    public void notifyObserver(){
        for(int j = 0;j < list.size();j++){
            list.get(j).update(this);
        }
    }
}
