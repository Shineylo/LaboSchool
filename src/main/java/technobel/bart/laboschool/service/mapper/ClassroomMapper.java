package technobel.bart.laboschool.service.mapper;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.ClassroomDTO;
import technobel.bart.laboschool.models.entity.Classroom;

import java.util.stream.Collectors;

@Service
public class ClassroomMapper {
    private final EquipmentMapper equipmentMapper;

    public ClassroomMapper(EquipmentMapper equipmentMapper) {
        this.equipmentMapper = equipmentMapper;
    }

    public ClassroomDTO toDto(Classroom entity) {
        if( entity == null )
            return null;

        return ClassroomDTO.builder()
                .id( entity.getId() )
                .capacity(entity.getCapacity())
                .name( entity.getName() )
                .teacherOnly(entity.isTeacherOnly())
                .equipments(
                        entity.getEquipments().stream()
                                .map(equipmentMapper::toDto)
                                .collect(Collectors.toSet())
                )
                .build();
    }
}
