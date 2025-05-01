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
    public ResponseEntity<NinjaModel> create(@RequestBody NinjaModel ninja){
        final NinjaModel newNinja = service.createNinja(ninja);
        return ResponseEntity.ok(newNinja);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<NinjaModel>> findAll(){
        List<NinjaModel> allNinjas = service.findAll();
        return ResponseEntity.ok(allNinjas);
    }
    @GetMapping("/findAll/{id}")
    public ResponseEntity<Optional<NinjaModel>> findById(@PathVariable("id") Long id){
        Optional<NinjaModel> ninja = service.findById(id);
        return ResponseEntity.ok(ninja);
    }

    @PutMapping("/updateID")
    public String update(){
        return "Atualizar ninja";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "apagar ninja";
    }
}
