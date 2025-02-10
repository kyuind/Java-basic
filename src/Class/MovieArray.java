package Class;

public class MovieArray {
    public static void main(String[] args) {
        Movie[] movies = new Movie[2];

        Movie toystory = new Movie();
        toystory.title = "Toy Story";
        toystory.review = "Good";
        movies[0] = toystory;

        Movie monsterCompany = new Movie();
        monsterCompany.title = "Monster Company";
        monsterCompany.review = "Not Good";
        movies[1] = monsterCompany;

        for(Movie m:movies){
            System.out.println("영화제목 : " + m.title
                    + " / 영화 리뷰 : " + m.review);
        }

    }
}
