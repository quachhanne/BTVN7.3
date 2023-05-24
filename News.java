import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    public int getId(){
        return id;
    }

    public int setId (int id){
        return this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public String setTitle (String title){
        return this.title = title;
    }

    public String getPublishDate(){
        return publishDate;
    }

    public String setPublishDate (String publishDate){
        return this.publishDate = publishDate;
    }
    // Hiển thị thông tin
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Publish Date " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }


    int[] rateList = new int[3];
    public void calculate(){
        averageRate = (rateList[0] + rateList[1] + rateList[2]) /rateList.length;
    }

    // Nhập thông tin mới
    public static Scanner sc = new Scanner(System.in);
    public void inputNews(){
        System.out.print("Nhập title: ");
        title = sc.nextLine();
        System.out.print("Nhập publish date: ");
        publishDate = sc.nextLine();
        System.out.print("Nhạp author: ");
        author = sc.nextLine();
        System.out.print("Nhập content: ");
        content = sc.nextLine();
        System.out.print("Nhap cac danh gia: ");
        for(int i = 0; i < rateList.length; i++){
            System.out.print("Đánh giá " + (i+1) +": ");
            rateList[i] = sc.nextInt();
        }




    }

}
