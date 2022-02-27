package com.company.javaZaawansowanaZadania.KlasyInterfejsyZadania.Zadanie2;

public class Movie {

    private String title;
    private String director;
    private String releasedIn;
    private String genre;
    private String distributor;

    public Movie() {

    }

    public static class MovieCreator{
        private String title;
        private String director;
        private String releasedIn;
        private String genre;
        private String distributor;


        public MovieCreator setMovieTitle(String title){
            this.title = title;
            return this;
        }
        public MovieCreator setMovieDirector(String director){
            this.director = director;
            return this;
        }
        public MovieCreator setMovieReleaseDate(String releasedIn){
            this.releasedIn = releasedIn;
            return this;
        }
        public MovieCreator setMovieGenre(String genre){
            this.genre = genre;
            return this;
        }
        public MovieCreator setDistributor(String distributor){
            this.distributor = distributor;
            return this;
        }

        public Movie build(){
            Movie movie = new Movie();
            movie.title = this.title;
            movie.director=this.director;
            movie.releasedIn = this.releasedIn;
            movie.genre = this.genre;
            movie.distributor = this.distributor;
            return movie;
        }

        public Movie createMovie(){
            Movie movie = new Movie.MovieCreator()
                    .setMovieTitle("Matrix")
                    .setMovieDirector("Wachowski")
                    .setMovieReleaseDate("1999")
                    .setMovieGenre("Action")
                    .setDistributor("Warner Bros")
                    .build();
            return movie;
        }
    }
    @Override
    public String toString() {
        return "Movie " + title + ", directed by " + director + ", released in: " + releasedIn  +
                ", genre:" + genre  + ", distributed by: " + distributor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleasedIn() {
        return releasedIn;
    }

    public void setReleasedIn(String releasedIn) {
        this.releasedIn = releasedIn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}

