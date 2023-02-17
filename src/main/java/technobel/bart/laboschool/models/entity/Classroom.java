package technobel.bart.laboschool.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Setter @Getter
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private int capacity;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean teacherOnly;

    @OneToMany(mappedBy = "classroom")
    private Set<Request> request;

}
