package bogdan;

import java.util.Date;
import java.util.GregorianCalendar;


public class News {

    private String title;
    private Date dateCreation;
    private Date dateChange;

    News (String title){
        this.title=title;
        dateCreation=GregorianCalendar.getInstance().getTime();
        dateChange=dateCreation;
    }

    public String getNews(){
        return title;
    }
    public Date getDateCreation(){
        return dateCreation;
    }

    public Date getDateChange(){
        return dateChange;
    }

    public String changeNews(String title){
        dateChange=GregorianCalendar.getInstance().getTime();
        title = title.replaceAll("\\s+", " ");
        return " --> Название: "+title+" --> Дата создания: "+dateCreation+" --> Дата изменения: "+dateChange;
    }

    public String newsInform(){
        return " --> Название: "+title+" --> Дата создания: "+dateCreation+" --> Дата изменения: "+dateChange;
    }


}
