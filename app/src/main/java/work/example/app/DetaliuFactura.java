package work.example.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetaliuFactura {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nume;
    private Double pret;
    private Long idFacturaParinte;

    public DetaliuFactura() {
    }

    public DetaliuFactura(Integer id, String nume, Double pret, Long idFacturaParinte) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
        this.idFacturaParinte = idFacturaParinte;
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

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public Long getIdFacturaParinte() {
        return idFacturaParinte;
    }

    public void setIdFacturaParinte(Long idFacturaParinte) {
        this.idFacturaParinte = idFacturaParinte;
    }
}
