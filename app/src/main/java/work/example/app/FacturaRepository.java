package work.example.app;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacturaRepository extends CrudRepository<Factura, Integer> {
    
     @Query("select new Factura(f.id ,f.dataFactura, f.totalFactura, f.referintaInterna, f.userRef) from Factura f")
    List<Factura> getFacturiQuesry();
}
