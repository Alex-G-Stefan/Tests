package work.example.app;

import javax.persistence.*;

@Entity
public class Monitor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nume;
    private String producator;
    private String serie;
    private String rezolutie;
    private Integer diagonala;
    private Integer numarFPS;
    private Double pret;
    private String link;
    private Integer rating;

    public Monitor() {
    }

    public Monitor(Integer id, String nume, String producator, String serie, String rezolutie, Integer diagonala, Integer numarFPS, Double pret, String link, Integer rating) {
        this.id = id;
        this.nume = nume;
        this.producator = producator;
        this.serie = serie;
        this.rezolutie = rezolutie;
        this.diagonala = diagonala;
        this.numarFPS = numarFPS;
        this.pret = pret;
        this.link = link;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public Integer getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(Integer diagonala) {
        this.diagonala = diagonala;
    }

    public Integer getNumarFPS() {
        return numarFPS;
    }

    public void setNumarFPS(Integer numarFPS) {
        this.numarFPS = numarFPS;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }
    
     public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
