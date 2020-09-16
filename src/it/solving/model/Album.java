package it.solving.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
    private String titolo;
    private String autore;
    private List<String> canzoni;
    private int anno;

    public Album(){}

    public Album(String titolo, String autore, int anno, List<String> canzoni){
        this.titolo=titolo;
        this.autore=autore;
        this.anno=anno;
        this.canzoni=new ArrayList<String>(canzoni);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public List<String> getCanzoni() {
        return canzoni;
    }

    public void setCanzoni(List<String> canzoni) {
        this.canzoni = canzoni;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
}
