package beans;

import model.Illness;
import model.Patient;
import model.Preparation;

import java.util.List;

/**
 * Created by User on 23.03.2017.
 */
public class IllnessPreparationBean {

    private Illness newIllness;
    private List<Illness> illnessList;
    private List<Preparation> preparationList;


    /* add-del methods????? */
    public void addIllness(Illness illness){
        this.illnessList.add(illness);
    }
    public void addPreparation(Preparation preparation){
        this.preparationList.add(preparation);
    }
    public void deletePreparation(Preparation preparation){
        this.preparationList.remove(preparation);
    }
    public void deleteIllness(Illness illness){
        this.illnessList.remove(illness);
    }

    /*get-set methods*/
    public List<Illness> getIllnessList() {
        return illnessList;
    }

    public void setIllnessList(List<Illness> illnessList) {
        this.illnessList = illnessList;
    }

    public Illness getNewIllness() {
        return newIllness;
    }

    public void setNewIllness(Illness newIllness) {
        this.newIllness = newIllness;
    }
}
