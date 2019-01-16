package work.example.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Carte {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "nume")private String nume;
    @Column(name = "autor")private String autor;
    @Column(name = "numarPagini")private Integer numarPagini;
    @Column(name = "pret")private Double pret;
    private String link;
    @Column(name = "rating", columnDefinition="int default '0' ")private Integer rating;

    public Carte() {
    }

    public Carte(Integer id, String nume, String autor, Integer numarPagini, Double pret, String link, Integer rating) {
        this.id = id;
        this.nume = nume;
        this.autor = autor;
        this.numarPagini = numarPagini;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumarPagini() {
        return numarPagini;
    }

    public void setNumarPagini(Integer numarPagini) {
        this.numarPagini = numarPagini;
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
