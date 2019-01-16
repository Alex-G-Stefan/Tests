package work.example.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScaunRepository extends CrudRepository<Scaun,Integer> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Scaun s set s.rating = s.rating+1 where s.id =:sid")
    void increaseChairRating(@Param("sid") Integer sid);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Scaun " +
            "set " +
            "nume=:cnume, " +
            "producator=:cproducator, " +
            "serie=:cserie, " +
            "greutateMaxima=:cgreutateMaxima," +
            "niveleInaltime=:cniveleInaltime," +
            "pret=:cpret," +
            "link=:clink " +
            "where id =:cid")
    void modifyScaun(@Param("cid") Integer id,
                          @Param("cnume") String nume,
                          @Param("cproducator") String producator,
                          @Param("cserie") String serie,
                          @Param("cgreutateMaxima") Integer greutateMaxima,
                          @Param("cniveleInaltime") Integer niveleInaltime,
                          @Param("cpret") Double pret,
                          @Param("clink") String link
    );
    
    @Query("select new Scaun(s.id,s.nume,s.producator,s.serie,s.greutateMaxima,s.niveleInaltime,s.pret,s.link,s.rating) from Scaun s where s.nume like  CONCAT('%',:cnume,'%')")
    List<Scaun> searchScaunByName(@Param("cnume") String nume);
}
