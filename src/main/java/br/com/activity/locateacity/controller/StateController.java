package br.com.activity.locateacity.controller;

import br.com.activity.locateacity.dto.StateDTO;
import br.com.activity.locateacity.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/States")
public class StateController {

    @Autowired
    private StateService service;

    @PostMapping
    public StateDTO create(@RequestBody StateDTO dto){
        return service.create(dto);
    }

    @GetMapping("/{id}")
    public StateDTO findById(@PathVariable("id") int id){
        return service.findById(id);
    }

    @GetMapping
    public List<StateDTO> findAll(){
        return service.findAll();
    }

    @PutMapping
    public StateDTO update(@RequestBody StateDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
        service.delete(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }

}
