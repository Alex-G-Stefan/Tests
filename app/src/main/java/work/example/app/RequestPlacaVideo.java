package work.example.app;

public class RequestPlacaVideo {

    private String nume;
    private String producator;
    private String serie;
    private String memorie;
    private Integer frecventa;
    private String conector;
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

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
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
