package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService service;

    NinjaController(NinjaService service){
        this.service = service;
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "This is the first message of project java10x";
    }

    @PostMapping(value = "/create", produces = "application/json")
    public ResponseEntity<NinjaDTO> create(@RequestBody NinjaDTO ninja){
        final NinjaDTO newNinja = service.createNinja(ninja);
        return ResponseEntity.ok(newNinja);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<NinjaDTO>> findAll(){
        List<NinjaDTO> allNinjas = service.findAll();
        return ResponseEntity.ok(allNinjas);
    }
    @GetMapping("/findAll/{id}")
    public ResponseEntity<Optional<NinjaDTO>> findById(@PathVariable("id") Long id){
        Optional<NinjaDTO> ninja = service.findById(id);
        return ResponseEntity.ok(ninja);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<NinjaDTO>> update(@PathVariable Long id, @RequestBody NinjaDTO ninja){
        Optional<NinjaDTO> updatedNinja = service.update(id, ninja);
        return  ResponseEntity.ok(updatedNinja);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<NinjaDTO>> delete(@PathVariable("id") Long id){
        Optional<NinjaDTO> ninja = service.delete(id);
        return ResponseEntity.ok(ninja);
    }
}
