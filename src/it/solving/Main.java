package it.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import it.solving.model.Album;

public class Main {

    public static void main(String[] args) {
        //List<String> frutta = Arrays.asList("Mele","Pere","Arance");

        //JAVA7
	    //for(String frutto: frutta){
	    //    System.out.println(frutto);
        //}
        //JAVA8 CON INNERCLASS
        //frutta.forEach(new Consumer<String>() {
        //@Override
        //    public void accept(String frutto) {
        //        System.out.println(frutto);
        //    }
        //});
        //frutta.forEach((String frutto) -> System.out.println(frutto));
        //frutta.forEach(System.out::println);
        List<String> canzoniPezzali = Arrays.asList("A","B","C","Z","FDDD");
        List<String> canzoniCremonini = Arrays.asList("D","E","F");
        List<String> canzoniNannini = Arrays.asList("G","H","I");
        List<String> canzoniRamazzotti = Arrays.asList("L","M","N");

        List<Album> albums = new ArrayList<Album>();
        albums.add(new Album("La dura legge del goal","pezzali",1996,canzoniPezzali));
        albums.add(new Album("Squerez","cremonini",2000,canzoniCremonini));
        albums.add(new Album("Brucia la citta","Nannnini",2002,canzoniNannini));
        albums.add(new Album("Sara l'aurora","ramazzotti",1999,canzoniRamazzotti));

        //Restituire la lista degli autori che hanno pubblicato qualcosa prima del 2000
        //JAVA7
        //for(Album album : albums){
        //    if(album.getAnno()<2000){
        //        System.out.println(album.getAutore());
        //    }
        //}

        //JAVA8
        //albums.stream().
        //        filter(album -> album.getAnno()<2000).
        //        map(Album::getAutore).
        //        forEach(System.out::println);

        List<String> autori = albums.stream().
                filter(album -> album.getAnno()<2000).
                map(Album::getAutore).collect(Collectors.toList());

        autori.forEach(autore -> System.out.println(autore));

        double avgSong = albums.stream().
                filter(album -> album.getAnno()<2000).
                mapToInt(album -> album.getCanzoni().size()).
                average().getAsDouble();

        System.out.print(avgSong);
    }
}
