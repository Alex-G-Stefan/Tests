package work.example.app;

public class RequestMouse {
    private String nume;
    private String producator;
    private String serie;
    private Integer dpi;
    private Integer numarButoane;
    private String ambidextru;
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
}
