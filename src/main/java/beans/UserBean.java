package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;

/**
 * Created by User on 27.03.2017.
 */
@ManagedBean
@SessionScoped
public class UserBean implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String uid = null;
    /** Creates a new instance of UserBean */
    public UserBean() {
    }

    public String getUid()
    {
        return uid;
    }

    public void setUid(String uid)
    {
        this.uid = uid;
    }

    public String login () {
        return "../webapp/index.xhtml";
    }

    public void logout (AjaxBehaviorEvent event) {
        this.uid = null;
    }
}
