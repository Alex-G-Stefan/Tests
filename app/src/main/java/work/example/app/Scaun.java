package work.example.app;

import javax.persistence.*;

@Entity
public class Scaun {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column()private String nume;
    private String producator;
    private String serie;
    private Integer greutateMaxima;
    private Integer niveleInaltime;
    private Double pret;
    private String link;
    private Integer rating;

    public Scaun() {
    }

    public Scaun(Integer id, String nume, String producator, String serie, Integer greutateMaxima, Integer niveleInaltime, Double pret, String link, Integer rating) {
        this.id = id;
        this.nume = nume;
        this.producator = producator;
        this.serie = serie;
        this.greutateMaxima = greutateMaxima;
        this.niveleInaltime = niveleInaltime;
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

    public Integer getGreutateMaxima() {
        return greutateMaxima;
    }

    public void setGreutateMaxima(Integer greutateMaxima) {
        this.greutateMaxima = greutateMaxima;
    }

    public Integer getNiveleInaltime() {
        return niveleInaltime;
    }

    public void setNiveleInaltime(Integer niveleInaltime) {
        this.niveleInaltime = niveleInaltime;
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
