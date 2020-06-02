package bogdan;

public class ControllerNews {

    private News [] arrayNews;

    ControllerNews(News [] arrayNews){
        this.arrayNews=arrayNews;
    }

    public void view(int id){
        System.out.println("Новость с id = "+ id + arrayNews[id].newsInform());
    }

    public void edit(int id, String title){
        System.out.println("Новость с id = "+ id +arrayNews[id].changeNews(title));
    }

}
