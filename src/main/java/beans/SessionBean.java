package beans;

import model.Personal;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by User on 03.05.2016.
 */
@ManagedBean
@SessionScoped
public class SessionBean {

    private Personal currentPersonal;

    @PostConstruct
    public void init(){
        currentPersonal = new Personal();
    }

    public Personal getCurrentPersonal() {
        return currentPersonal;
    }

    public void setCurrentPersonal(Personal currentPersonal) {
        this.currentPersonal = currentPersonal;
    }

}
