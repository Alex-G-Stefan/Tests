package work.example.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String dataFactura;
    private Double totalFactura;
    private Long referintaInterna;
    private Integer userRef;

    public Factura() {
    }

    public Factura(Integer id, String dataFactura, Double totalFactura, Long referintaInterna, Integer userRef) {
        this.id = id;
        this.dataFactura = dataFactura;
        this.totalFactura = totalFactura;
        this.referintaInterna = referintaInterna;
        this.userRef = userRef;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataFactura() {
        return dataFactura;
    }

    public void setDataFactura(String dataFactura) {
        this.dataFactura = dataFactura;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Long getReferintaInterna() {
        return referintaInterna;
    }

    public void setReferintaInterna(Long referintaInterna) {
        this.referintaInterna = referintaInterna;
    }

    public Integer getUserRef() {
        return userRef;
    }

    public void setUserRef(Integer userRef) {
        this.userRef = userRef;
    }
}
