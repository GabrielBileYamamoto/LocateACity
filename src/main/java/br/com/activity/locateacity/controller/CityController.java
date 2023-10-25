package br.com.activity.locateacity.controller;

import br.com.activity.locateacity.dto.CityDTO;
import br.com.activity.locateacity.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cities")
public class CityController {

    @Autowired
    private CityService service;

    @PostMapping
    public CityDTO create(@RequestBody CityDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public CityDTO findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping
    public List<CityDTO> findAll(){
        return service.findAll();
    }

    @PutMapping
    public CityDTO update(@RequestBody CityDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
        service.delete(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

}
