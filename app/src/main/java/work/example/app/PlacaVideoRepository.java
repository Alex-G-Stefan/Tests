package work.example.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlacaVideoRepository extends CrudRepository<PlacaVideo,Integer> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update PlacaVideo pv set pv.rating = pv.rating+1 where pv.id =:pvid")
    void increaseVideoRating(@Param("pvid") Integer pvid);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update PlacaVideo " +
            "set " +
            "nume=:cnume, " +
            "producator=:cproducator, " +
            "serie=:cserie, " +
            "memorie=:cmemorie," +
            "frecventa=:cfrecventa," +
            "slot=:cslot," +
            "pret=:cpret," +
            "link=:clink " +
            "where id =:cid")
    void modifyPlacaVideo(@Param("cid") Integer id,
                       @Param("cnume") String nume,
                       @Param("cproducator") String producator,
                       @Param("cserie") String serie,
                       @Param("cmemorie") String memorie,
                       @Param("cfrecventa") Integer frecventa,
                       @Param("cslot") String slot,
                       @Param("cpret") Double pret,
                       @Param("clink") String link
    );
    
    @Query("select new PlacaVideo(pv.id,pv.nume,pv.producator,pv.serie,pv.memorie,pv.frecventa,pv.slot,pv.pret,pv.link,pv.rating) from PlacaVideo pv where pv.nume like  CONCAT('%',:cnume,'%')")
    List<PlacaVideo> searchPlacaVideoByName(@Param("cnume") String nume);
}
