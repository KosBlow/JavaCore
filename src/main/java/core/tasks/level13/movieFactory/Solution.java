package core.tasks.level13.movieFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie;
        String key;
        while (true) {
            key = reader.readLine();
            movie = MovieFactory.getMovie(key);
            if ("soapOpera".equals(key) || "cartoon".equals(key) || "thriller".equals(key)) {

                System.out.println(movie.getClass().getSimpleName());
            } else break;


        }

    }
}