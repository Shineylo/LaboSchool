package technobel.bart.laboschool.service.impl;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.EquipmentDTO;
import technobel.bart.laboschool.repository.EquipmentRepository;
import technobel.bart.laboschool.service.EquipmentService;
import technobel.bart.laboschool.service.mapper.EquipmentMapper;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final EquipmentMapper mapper;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository, EquipmentMapper mapper) {
        this.equipmentRepository = equipmentRepository;
        this.mapper = mapper;
    }

    @Override
    public List<EquipmentDTO> getAll() {
        return equipmentRepository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }
}
