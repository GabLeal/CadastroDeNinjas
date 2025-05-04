package dev.leal.cadastroDeNinjas.Missions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {

    private final MissionService service;

    MissionController(MissionService service){
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<MissionModel> create(@RequestBody MissionModel mission){
        MissionModel newMission = service.create(mission);
        return ResponseEntity.ok(newMission);
    }
    @GetMapping("/findAll")
    public String fingAll(){
        return "listar missoes";
    }

    @PutMapping("/updateID")
    public String update(){
        return "Atualizar missão";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "apagar missão";
    }
}
