package dev.leal.cadastroDeNinjas.Missions;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mission")
public class MissionController {

    @PostMapping("/create")
    public String create(){
        return "criar missao";
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
