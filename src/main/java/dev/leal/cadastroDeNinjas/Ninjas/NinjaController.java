package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @GetMapping("/welcome")
    public String welcome(){
        return "This is the first message of project java10x";
    }

    @PostMapping("/create")
    public String create(){
        return "Ninja criado";
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
