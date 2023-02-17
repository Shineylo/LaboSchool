package technobel.bart.laboschool.models.dto;

import lombok.Builder;
import lombok.Data;
import technobel.bart.laboschool.models.entity.Equipment;
import technobel.bart.laboschool.models.entity.Request;

import java.util.Set;

@Data
@Builder
public class ClassroomDTO {
    private Long id;

    private int capacity;

    private String name;

    private boolean teacherOnly;

    private Set<Request> request;

    private Set<Equipment> equipements;
}
