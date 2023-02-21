package technobel.bart.laboschool.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Setter @Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    private String lastname;
    private String firstname;
    private String password;
    private String login;
    private String email;
    private String phone;
    private String Adresse;
    private Role role;

    @OneToMany(orphanRemoval = true, mappedBy = "users")
    @JoinColumn(name = "user_id")
    private Set<Request> requests = new LinkedHashSet<>();

    @OneToMany(cascade = CascadeType.MERGE, orphanRemoval = true, mappedBy = "validator")
    @JoinColumn(name = "user_id")
    private Set<Request> validate = new LinkedHashSet<>();

}
