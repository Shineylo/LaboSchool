package technobel.bart.laboschool.service.impl;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.models.dto.ClassroomDTO;
import technobel.bart.laboschool.repository.ClassroomRepository;
import technobel.bart.laboschool.service.ClassroomService;
import technobel.bart.laboschool.service.mapper.ClassroomMapper;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    private final ClassroomRepository classroomRepository;
    private final ClassroomMapper mapper;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository, ClassroomMapper mapper) {
        this.classroomRepository = classroomRepository;
        this.mapper = mapper;
    }

    @Override
    public List<ClassroomDTO> getAll() {
        return classroomRepository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }
}
