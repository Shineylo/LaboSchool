package technobel.bart.laboschool.service.mapper;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.ClassroomDTO;
import technobel.bart.laboschool.models.dto.EquipmentDTO;
import technobel.bart.laboschool.models.entity.Classroom;
import technobel.bart.laboschool.models.entity.Equipment;

@Service
public class EquipmentMapper {
    public EquipmentDTO toDto(Equipment entity) {
        if( entity == null )
            return null;

        return EquipmentDTO.builder()
                .id( entity.getId() )
                .name( entity.getName() )
                .build();
    }
}
