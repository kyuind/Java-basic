package Class;

public class MovieMain {
    public static void main(String[] args) {
        Movie toystory = new Movie();
        toystory.title = "Toy Story";
        toystory.review = "Good";

        Movie monsterCompany = new Movie();
        monsterCompany.title = "Monster Company";
        monsterCompany.review = "Not Good";

        System.out.println("영화제목 : " + toystory.title
                + " / 영화 리뷰 : " + toystory.review);

        System.out.println("영화제목 : " + monsterCompany.title
                + " / 영화 리뷰 : " + monsterCompany.review);
    }
}
