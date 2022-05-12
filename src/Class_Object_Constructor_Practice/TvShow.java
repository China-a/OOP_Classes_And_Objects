package Class_Object_Constructor_Practice;

public class TvShow {
    private String tvShowName;
    private Integer numOfEpisodes;
    private String genreType;

    public TvShow ( String tvShowName, String genreType) {
        this.tvShowName = tvShowName;
        this.genreType = genreType;
    }
public TvShow (Integer numOfEpisodes) {
    this.numOfEpisodes = numOfEpisodes;
}
    public String getTvShowName() {
        return tvShowName;
    }

    public Integer getNumOfEpisodes() {
        return numOfEpisodes;
    }

    public String getGenreType() {
        return genreType;
    }

public String toString() {
        return "The name of the show is " + getTvShowName() + " with " + getNumOfEpisodes() + " number of episodes. The genre is " + getGenreType();
}
}
