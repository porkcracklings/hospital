package beans;

import org.primefaces.mobile.component.page.Page;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 * Created by User on 02.05.2016.
 */
@ManagedBean
@SessionScoped
public class PagesBean {

    private String page;
    private String page1;
    public boolean responseRendered = false;

    public void render(){
        responseRendered = !responseRendered;
    }

    public String getPage1() {
        return page1;
    }

    public void setPage1(String page1) {
        this.page1 = page1;
    }


    @PostConstruct
    public void init() {
        page = "welcome";
    }

    public void actionListener(String page){
        this.page = page;
    }
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
