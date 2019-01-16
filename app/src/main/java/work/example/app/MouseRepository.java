package work.example.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MouseRepository extends CrudRepository<Mouse,Integer> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Mouse ms set ms.rating = ms.rating+1 where ms.id =:msid")
    void increaseMouseRating(@Param("msid") Integer msid);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Mouse " +
            "set " +
            "nume=:cnume, " +
            "producator=:cproducator, " +
            "serie=:cserie, " +
            "dpi=:cdpi," +
            "numarButoane=:cnumarButoane," +
            "ambidextru=:cambidextru," +
            "pret=:cpret," +
            "link=:clink " +
            "where id =:cid")
    void modifyMouse(@Param("cid") Integer id,
                       @Param("cnume") String nume,
                       @Param("cproducator") String producator,
                       @Param("cserie") String serie,
                       @Param("cdpi") Integer dpi,
                       @Param("cnumarButoane") Integer numarButoane,
                       @Param("cambidextru") String ambidextru,
                       @Param("cpret") Double pret,
                       @Param("clink") String link
    );
    
    @Query("select new Mouse(m.id,m.nume,m.producator,m.serie,m.dpi,m.numarButoane,m.ambidextru,m.pret,m.link,m.rating) from Mouse m where m.nume like  CONCAT('%',:cnume,'%')")
    List<Mouse> searchMouseByName(@Param("cnume") String nume);
}
