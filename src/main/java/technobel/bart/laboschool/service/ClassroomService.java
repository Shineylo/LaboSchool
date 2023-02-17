package technobel.bart.laboschool.service;

import technobel.bart.laboschool.models.dto.ClassroomDTO;

import java.util.List;

public interface ClassroomService {

    List<ClassroomDTO> getAll();
}
