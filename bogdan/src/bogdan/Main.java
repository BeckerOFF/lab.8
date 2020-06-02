package bogdan;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        final int amountNews=4;
        final int amountCommand=8;

        News[] news = new News[amountNews];
        news[0]=new News("Как стать долларовым миллионером за 30 лет, лежа на диване");
        news[1]=new News("Отложенная смерть или как похоронить перспективу своей ленью");
        news[2]=new News("Инопланетные кентавры");
        news[3]=new News("Почему IPv6 всё ещё не взлетел");

        String[] path = new String[amountCommand];
        path[0]="view/0";
        path[1]="edit/0";
        path[2]="view/1";
        path[3]="edit/1";
        path[4]="view/2";
        path[5]="edit/2";
        path[6]="view/3";
        path[7]="edit/3";

        ControllerNews controller = new ControllerNews(news);

        for (int i = 0; i < amountCommand; i++) {

            StringTokenizer string = new StringTokenizer(path[i], "/");

            String function = string.nextToken();
            int id = Integer.parseInt(string.nextToken());

            if (function == "view" || id == 0) {
                controller.view(id);
            }

            if (function == "edit" || id == 0){
                System.out.println("Введите новое название для 0 новости: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 1) {
                controller.view(id);
            }

             if (function == "edit" || id == 1){
                System.out.println("Введите новое название для 1 новости: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 2) {
                controller.view(id);
            }

            if (function == "edit" || id == 2){
                System.out.println("Введите новое название для 2 новости: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 3) {
                controller.view(id);
            }

            if (function == "edit" || id == 3){
                System.out.println("Введите новое название для 3 новости: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            else {
                System.out.println("Не найден путь");
            }
        }
    }
}
