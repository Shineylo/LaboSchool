package technobel.bart.laboschool.models.form.request;

import lombok.Data;
import technobel.bart.laboschool.models.entity.Role;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class RequestNewForm {

    private LocalDate date;

    private int time;

    private int duration;

    private String reason;

    private Role role;

    private List<Long> equipmentsId;

}
