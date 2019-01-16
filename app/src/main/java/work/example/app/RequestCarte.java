package work.example.app;

public class RequestCarte {
    private String nume;
    private String autor;
    private Integer numarPagini;
    private Double pret;
    private String link;

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
}
