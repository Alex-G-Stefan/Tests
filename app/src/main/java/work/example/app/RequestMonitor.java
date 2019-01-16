package work.example.app;

public class RequestMonitor {
    private String nume;
    private String producator;
    private String serie;
    private String rezolutie;
    private Integer diagonala;
    private Integer numarFPS;
    private Double pret;
    private String link;

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
}
