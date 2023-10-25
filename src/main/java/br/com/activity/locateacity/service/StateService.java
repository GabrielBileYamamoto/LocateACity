package br.com.activity.locateacity.service;

import br.com.activity.locateacity.dto.StateDTO;
import br.com.activity.locateacity.exception.ResourceNotFoundException;
import br.com.activity.locateacity.mapper.CustomModelMapper;
import br.com.activity.locateacity.model.StateModel;
import br.com.activity.locateacity.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository repository;

    public StateDTO create(StateDTO dto){
        StateModel model = CustomModelMapper.parseObject(dto, StateModel.class);
        return CustomModelMapper.parseObject(repository.save(model), StateDTO.class);
    }

    public StateDTO findById(int id){
        StateModel model = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não Encontrado!"));
        return CustomModelMapper.parseObject(model, StateDTO.class);
    }

    public List<StateDTO> findAll(){
        List<StateModel> list = repository.findAll();
        return CustomModelMapper.parseObjectList(list, StateDTO.class);
    }

    public StateDTO update(StateDTO dto){
        StateModel model = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException("Não encontrado!"));
        model = CustomModelMapper.parseObject(dto, StateModel.class);
        return CustomModelMapper.parseObject(repository.save(model), StateDTO.class);
    }

    public void delete(int id){
        StateModel model = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não Encontrado!"));
        repository.delete(model);
    }

}
