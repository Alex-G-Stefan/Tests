package work.example.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nume;
    private String adresa;
    private String email;
    private String parola;
    private String role;

    public User() {
    }

    public User(Integer id, String nume, String adresa, String email, String parola, String role) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.email = email;
        this.parola = parola;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
     public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
