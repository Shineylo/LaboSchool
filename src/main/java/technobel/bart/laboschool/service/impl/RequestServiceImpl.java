package technobel.bart.laboschool.service.impl;

import org.springframework.stereotype.Service;
import technobel.bart.laboschool.exception.NotFoundException;
import technobel.bart.laboschool.models.dto.RequestDTO;
import technobel.bart.laboschool.models.entity.Request;
import technobel.bart.laboschool.models.form.request.RequestNewForm;
import technobel.bart.laboschool.repository.RequestRepository;
import technobel.bart.laboschool.service.RequestService;
import technobel.bart.laboschool.service.mapper.RequestMapper;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;
    private final RequestMapper mapper;

    public RequestServiceImpl(RequestRepository requestRepository, RequestMapper mapper) {
        this.requestRepository = requestRepository;
        this.mapper = mapper;
    }

    @Override
    public List<RequestDTO> getAll() {
        return requestRepository.findAll().stream()
                .map( mapper::toDto )
                .toList();
    }

    @Override
    public RequestDTO getOne(Long id) {
        return requestRepository.findById(id)
                .map( mapper::toDto )
                .orElseThrow(() -> new NotFoundException("Sandwich not found"));
    }

    @Override
    public void insert(RequestNewForm form) {
        if( form == null )
            throw new IllegalArgumentException("form should not be null");

        Request entity = mapper.toEntity(form);
        requestRepository.save( entity );
    }
}
