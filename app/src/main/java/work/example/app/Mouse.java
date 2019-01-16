package work.example.app;

import javax.persistence.*;

@Entity
public class Mouse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nume;
    private String producator;
    private String serie;
    private Integer dpi;
    private Integer numarButoane;
    private String ambidextru;
    private Double pret;
    private String link;
    private Integer rating;

    public Mouse() {
    }

    public Mouse(Integer id, String nume, String producator, String serie, Integer dpi, Integer numarButoane, String ambidextru, Double pret, String link, Integer rating) {
        this.id = id;
        this.nume = nume;
        this.producator = producator;
        this.serie = serie;
        this.dpi = dpi;
        this.numarButoane = numarButoane;
        this.ambidextru = ambidextru;
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

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Integer getNumarButoane() {
        return numarButoane;
    }

    public void setNumarButoane(Integer numarButoane) {
        this.numarButoane = numarButoane;
    }

    public String getAmbidextru() {
        return ambidextru;
    }

    public void setAmbidextru(String ambidextru) {
        this.ambidextru = ambidextru;
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
