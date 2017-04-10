package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created by User on 01.05.2016.
 */
@ManagedBean
@SessionScoped
public class DoctorBean {

    @ManagedProperty(value = "#{sessionBean}")
    private SessionBean sessionBean;

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

}
