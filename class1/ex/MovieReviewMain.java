package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] MovieReviews = {new MovieReview("서울의봄", "슬픈 역사 ㅠㅠ"),
                new MovieReview("파묘", "용두사미")};

        for (MovieReview movieReview : MovieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }

    }
}
