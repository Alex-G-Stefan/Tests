package work.example.app;

import javax.persistence.*;

@Entity
public class PlacaVideo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nume;
    private String producator;
    private String serie;
    private String memorie;
    private Integer frecventa;
    private String slot;
    private Double pret;
    private String link;
    private Integer rating;

    public PlacaVideo() {
    }

    public PlacaVideo(Integer id, String nume, String producator, String serie, String memorie, Integer frecventa, String slot, Double pret, String link, Integer rating) {
        this.id = id;
        this.nume = nume;
        this.producator = producator;
        this.serie = serie;
        this.memorie = memorie;
        this.frecventa = frecventa;
        this.slot = slot;
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

    public String getMemorie() {
        return memorie;
    }

    public void setMemorie(String memorie) {
        this.memorie = memorie;
    }

    public Integer getFrecventa() {
        return frecventa;
    }

    public void setFrecventa(Integer frecventa) {
        this.frecventa = frecventa;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
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
