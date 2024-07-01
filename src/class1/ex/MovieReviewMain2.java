package class1.ex;

public class MovieReviewMain2 {
	
	public static void main(String[] args) {
		// 영화 리뷰 정보 선언
		MovieReview movie1 = new MovieReview();
		movie1.title = "인셉션";
		movie1.review = "인생은 무한 루프";
		
		MovieReview movie2 = new MovieReview();
		movie2.title = "어바웃 타임";
		movie2.review = "인생 시간 영화!";
		
		// 영화 리뷰 정보 출력
		MovieReview[] movies = {movie1, movie2};
		
		for(MovieReview m : movies) {
			System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
		}
	}

}
