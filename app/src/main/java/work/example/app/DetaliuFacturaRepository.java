package work.example.app;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DetaliuFacturaRepository extends CrudRepository<DetaliuFactura, Integer> {
    
     @Query("select new DetaliuFactura(df.id ,df.nume, df.pret, df.idFacturaParinte) from DetaliuFactura df")
     List<DetaliuFactura> getDetaliiFacturaQuery();
}
