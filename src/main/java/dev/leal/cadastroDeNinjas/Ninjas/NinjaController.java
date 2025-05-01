package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public String fingAll(){
        return "listar ninjas";
    }
    @GetMapping("/findAllID")
    public String fingById(){
        return "listar ninjas por id";
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
