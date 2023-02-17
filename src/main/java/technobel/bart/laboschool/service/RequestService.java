package technobel.bart.laboschool.service;

import technobel.bart.laboschool.models.dto.RequestDTO;
import technobel.bart.laboschool.models.form.request.RequestNewForm;

import java.util.List;

public interface RequestService {
    List<RequestDTO> getAll();
    RequestDTO getOne(Long id);
    void insert(RequestNewForm form);
}
