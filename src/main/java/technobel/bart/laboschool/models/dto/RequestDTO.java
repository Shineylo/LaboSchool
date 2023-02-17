package technobel.bart.laboschool.models.dto;

import lombok.Builder;
import lombok.Data;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Equipment;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Data
@Builder
public class RequestDTO {
    private Long id;

    private LocalDateTime timeSlot;

    private LocalTime duration;

    private String reason;

    private String refuse;

    private Classroom classroom;

    private Set<Equipment> equipments;
}
