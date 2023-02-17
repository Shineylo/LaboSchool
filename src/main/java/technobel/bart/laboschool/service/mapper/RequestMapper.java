package technobel.bart.laboschool.service.mapper;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.RequestDTO;
import technobel.bart.laboschool.models.entity.Request;
import technobel.bart.laboschool.models.form.request.RequestNewForm;

@Service
public class RequestMapper {

    public RequestDTO toDto(Request request){
        if( request == null )
            return null;

        return RequestDTO.builder()
                .id(request.getId())
                .timeSlot(request.getTimeSlot())
                .duration(request.getDuration())
                .reason(request.getReason())
                .refuse(request.getRefuse())
                .classroom(request.getClassroom())
                .build();
    }

    public Request toEntity(RequestNewForm form){
        if( form == null )
            return null;

        Request request = new Request();

        request.setTimeSlot(form.getTimeSlot());
        request.setDuration(form.getDuration());
        request.setReason(form.getReason());

        return request;
    }
}
