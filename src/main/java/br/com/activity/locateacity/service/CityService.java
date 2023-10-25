package br.com.activity.locateacity.service;

import br.com.activity.locateacity.dto.CityDTO;
import br.com.activity.locateacity.exception.ResourceNotFoundException;
import br.com.activity.locateacity.mapper.CustomModelMapper;
import br.com.activity.locateacity.model.CityModel;
import br.com.activity.locateacity.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public CityDTO create(CityDTO dto){
        CityModel model = CustomModelMapper.parseObject(dto, CityModel.class);
        return CustomModelMapper.parseObject(repository.save(model), CityDTO.class);
    }

    public CityDTO findById(int id){
        CityModel model = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não Encontrado!"));
        return CustomModelMapper.parseObject(model, CityDTO.class);
    }

    public List<CityDTO> findAll(){
        List<CityModel> list = repository.findAll();
        return CustomModelMapper.parseObjectList(list, CityDTO.class);
    }

    public CityDTO update(CityDTO dto){
        CityModel model = repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException("Não encontrado!"));
        model = CustomModelMapper.parseObject(dto, CityModel.class);
        return CustomModelMapper.parseObject(repository.save(model), CityDTO.class);
    }

    public void delete(int id){
        CityModel model = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não Encontrado!"));
        repository.delete(model);
    }

}
