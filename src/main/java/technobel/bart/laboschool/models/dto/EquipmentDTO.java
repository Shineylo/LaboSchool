package technobel.bart.laboschool.models.dto;

import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Data;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Request;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Builder
public class EquipmentDTO {

    private Long id;

    private String name;

    private Set<Classroom> classrooms;

    private Set<Request> requests;
}
