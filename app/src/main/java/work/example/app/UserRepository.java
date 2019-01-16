package work.example.app;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository  extends CrudRepository<User,Integer> {

    @Query("select new User(u.id ,u.nume, u.adresa, u.email, u.parola, u.role) from User u")
    List<User> getUsersQuery();

    @Query("select new User(u.id ,u.nume, u.adresa, u.email, u.parola, u.role) from User u where u.id=:cid")
    List<User> getOneUserByID(@Param("cid") Integer id);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update User " +
            "set " +
            "nume=:cnume, " +
            "adresa=:cadresa, " +
            "email=:cemail, " +
            "parola=:cparola " +
            "where id =:cid")
    void modifyUser(@Param("cid") Integer cid,
                       @Param("cnume") String cnume,
                       @Param("cadresa") String adresa,
                       @Param("cemail") String email,
                       @Param("cparola") String cparola
                    );
}
