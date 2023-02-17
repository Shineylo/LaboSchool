package technobel.bart.laboschool.models.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClassroomDTO {
    private Long id;

    private int capacity;

    private String name;

    private boolean teacherOnly;

}
