package work.example.app;

import java.util.List;

public class RequestFactura {
    private Double totalFactura;
    private Integer userRef;
    private List<DetaliuFactura> detaliiFactura;

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Integer getUserRef() {
        return userRef;
    }

    public void setUserRef(Integer userRef) {
        this.userRef = userRef;
    }

    public List<DetaliuFactura> getDetaliiFactura() {
        return detaliiFactura;
    }

    public void setDetaliiFactura(List<DetaliuFactura> detaliiFactura) {
        this.detaliiFactura = detaliiFactura;
    }
}
