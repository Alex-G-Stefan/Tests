package work.example.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonitorRepository extends CrudRepository<Monitor, Integer> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Monitor m set m.rating = m.rating+1 where m.id =:mid")
    void increaseMonitorRating(@Param("mid") Integer mid);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Monitor " +
            "set " +
            "nume=:cnume, " +
            "producator=:cproducator, " +
            "serie=:cserie, " +
            "rezolutie=:crezolutie," +
            "diagonala=:cdiagonala," +
            "numarFPS=:cnumarFPS," +
            "pret=:cpret," +
            "link=:clink " +
            "where id =:cid")
    void modifyMonitor(@Param("cid") Integer cid,
                       @Param("cnume") String cnume,
                       @Param("cproducator") String producator,
                       @Param("cserie") String serie,
                       @Param("crezolutie") String rezolutie,
                       @Param("cdiagonala") Integer diagonala,
                       @Param("cnumarFPS") Integer numarFPS,
                       @Param("cpret") Double pret,
                       @Param("clink") String link
    );
    
    @Query("select new Monitor(m.id,m.nume,m.producator,m.serie,m.rezolutie,m.diagonala,m.numarFPS,m.pret,m.link,m.rating) from Monitor m where m.nume like  CONCAT('%',:cnume,'%')")
    List<Monitor> searchMonitorByName(@Param("cnume") String nume);
}
