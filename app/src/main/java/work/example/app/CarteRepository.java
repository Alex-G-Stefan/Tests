package work.example.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CarteRepository extends CrudRepository<Carte, Integer> {
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Carte c set c.rating = c.rating+1 where c.id =:cid")
    void increaseBookRating(@Param("cid") Integer cid);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Carte set nume=:cnume, autor=:cautor , numarPagini=:cnumarPagini, pret=:cpret, link=:clink where id =:cid")
    void modifyBook(@Param("cid") Integer cid, @Param("cnume") String cnume, @Param("cautor") String cautor,  @Param("cnumarPagini") Integer cnumarPagini, @Param("cpret") Double cpret, @Param("clink") String clink);
    
    @Query("select new Carte(c.id,c.nume,c.autor,c.numarPagini,c.pret,c.link,c.rating) from Carte c where c.nume like CONCAT('%',:cnume,'%')")
    List<Carte> searchCarteByName(@Param("cnume") String nume);
}
