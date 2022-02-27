package com.company.javaZaawansowanaZadania.TypyGeneryczneZadania.Zadanie4;

import java.util.Arrays;

abstract class MediaContent {

    protected String title;

    public MediaContent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MediaContent{" +
                "title='" + title + '\'' +
                '}';
    }
}
//
//    public static void main(String arg[]) {
//
//        MediaLibrary<PCgame> pCgameMediaLibrary = new MediaLibrary<>(new PCgame[] {new PCgame("Diablo2", "Blizzard")});
//        MediaLibrary<Movie> movieMediaLibrary = new MediaLibrary<>(new Movie[]{new Movie("Matrix", "Wachowski")});
//        MediaLibrary<TvShow> tvShowMediaLibrary = new MediaLibrary<>(new TvShow[]{new TvShow("Ozark", 30)});
//
//        System.out.println(Arrays.toString(pCgameMediaLibrary.getElements()));
//        System.out.println(Arrays.toString(movieMediaLibrary.getElements()));
//        System.out.println(Arrays.toString(tvShowMediaLibrary.getElements()));
//
//    }