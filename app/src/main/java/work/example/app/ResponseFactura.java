package work.example.app;

import java.util.List;

public class ResponseFactura {
    private Integer id;
    private String dataFactura;
    private Double totalFactura;
    private User userRef;
    private List<DetaliuFactura> detaliiFactura;

    public ResponseFactura() {
    }

    public ResponseFactura(Integer id, String dataFactura, Double totalFactura, User userRef, List<DetaliuFactura> detaliiFactura) {
        this.id = id;
        this.dataFactura = dataFactura;
        this.totalFactura = totalFactura;
        this.userRef = userRef;
        this.detaliiFactura = detaliiFactura;
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

    public User getUserRef() {
        return userRef;
    }

    public void setUserRef(User userRef) {
        this.userRef = userRef;
    }

    public List<DetaliuFactura> getDetaliiFactura() {
        return detaliiFactura;
    }

    public void setDetaliiFactura(List<DetaliuFactura> detaliiFactura) {
        this.detaliiFactura = detaliiFactura;
    }
}
