package technobel.bart.laboschool.service.mapper;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.RequestDTO;
import technobel.bart.laboschool.models.entity.Request;
import technobel.bart.laboschool.models.form.request.RequestNewForm;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.stream.Collectors;

@Service
public class RequestMapper {
    private final EquipmentMapper equipmentMapper;

    public RequestMapper(EquipmentMapper equipmentMapper) {
        this.equipmentMapper = equipmentMapper;
    }

    public RequestDTO toDto(Request entity){
        if( entity == null )
            return null;

        return RequestDTO.builder()
                .id(entity.getId())
                .timeSlot(entity.getTimeSlot())
                .duration(entity.getDuration())
                .reason(entity.getReason())
                .refuse(entity.getRefuse())
                .classroom(entity.getClassroom())
                .equipments(
                        entity.getEquipments().stream()
                                .map(equipmentMapper::toDto)
                                .collect(Collectors.toSet())
                )
                .build();
    }

    public Request toEntity(RequestNewForm form){
        if( form == null )
            return null;

        Request request = new Request();


        request.setTimeSlot(form.getDate().atTime(LocalTime.of(form.getTime(), 00)));
        request.setDuration(LocalTime.of(form.getDuration(),00));
        request.setReason(form.getReason());

        return request;
    }
}
