package work.example.app;

public class RequestScaun {

    private String nume;
    private String producator;
    private String serie;
    private Integer greutateMaxima;
    private Integer niveleInaltime;
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
}
