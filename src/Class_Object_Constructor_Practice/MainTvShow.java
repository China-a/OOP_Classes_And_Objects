package Class_Object_Constructor_Practice;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> Show = new ArrayList<>();

    while(true) {
        System.out.println("Name of the show");
        String tvShowName = scanner.nextLine();

        if(tvShowName.equals("")) {
          break;
      }
        System.out.println("How many episodes?");
        Integer numOfEpisodes = Integer.valueOf(scanner.nextLine());

        System.out.println("What is the genre");
        String genreType = scanner.nextLine();

        Show.add(new TvShow(tvShowName, genreType));
        Show.add(new TvShow(numOfEpisodes));
    }
    for(Object TvShow: Show) {
        System.out.println(TvShow.toString());
    }



    }

}
