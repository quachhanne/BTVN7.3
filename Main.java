import java.util.ArrayList;
import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <News> newsList = new ArrayList<>();
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Mời lựa chọn: ");
            chon = sc.nextInt();
            System.out.println();
            switch (chon) {
                case 1:
                    System.out.println("1. Insert news");
                    News news = new News();
                    news.inputNews();
                    newsList.add(news);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("View list news");
                    for(News news2: newsList){
                        news2.display();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Calculate average rate");
                    for(News news2: newsList){
                        news2.calculate();
                        news2.display();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice, please choose again");
            }
        } while (chon != 0);
    }
}




