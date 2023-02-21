package technobel.bart.laboschool.models.dto;

import lombok.Builder;
import lombok.Data;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Equipment;
import technobel.bart.laboschool.models.entity.User;

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

    private Set<EquipmentDTO> equipments;

    private User user;

    private User validator;
}
