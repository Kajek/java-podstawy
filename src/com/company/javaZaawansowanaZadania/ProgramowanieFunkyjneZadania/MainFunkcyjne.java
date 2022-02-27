package com.company.javaZaawansowanaZadania.ProgramowanieFunkyjneZadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFunkcyjne {

    public static void main(String[] args) {
//        Wykorzystując mechanizmy programowania funkcyjnego na podstawie zadanej
//        struktury wyświetl:
//        listę wszystkich epizodów
//        listę wszystkich filmów
//        listę wszystkich nazw sezonów
//        listę wszystkich numerów sezonów
//        listę wszystkich nazw epizodów
//        listę wszystkich numerów epizodów
//        listę wszystkich nazw video
//        listę wszystkich adresów url dla każdego video
//        tylko epizody z parzystych sezonów
//        tylko video z parzystych sezonów
//        tylko video z parzystych epizodów i sezonów
//        tylko video typu Clip z parzystych epizodów i nieparzystych sezonów
//        tylko video typu Preview z nieparzystych epizodów i parzystych sezonów

        Video video1 = new Video("video1", "http/preview",VideoType.PREVIEW );
        Video video2 = new Video("video2", "http/clip",VideoType.CLIP );
        Video video3 = new Video("video3", "http/episode",VideoType.EPISODE );
        List<Video> videoList = new ArrayList<>();
        videoList.add(video1);
        videoList.add(video2);
        videoList.add(video3);

        Episode episode1 = new Episode("episode1", 1, videoList);
        List<Episode> episodeList = new ArrayList<>();
        episodeList.add(episode1);

        Season season = new Season("season1", 1, episodeList);
        List<Season> seasons = Arrays.asList(season);

        List<Episode> episodes = seasons.stream()
                .flatMap(s ->season.episodes.stream())
                .collect(Collectors.toList());

        System.out.println(episodeList);

        List<Video> videos = videoList.stream()
                .flatMap(s -> season.episodes.stream() )
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

    }
}
