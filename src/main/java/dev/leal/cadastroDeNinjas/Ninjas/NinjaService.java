package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository repository;

    NinjaService(NinjaRepository repository){
        this.repository = repository;
    }

    NinjaModel createNinja(NinjaModel ninja){
        return repository.save(ninja);
    }

    List<NinjaModel> findAll(){
        return  repository.findAll();
    }

    Optional<NinjaModel> findById(Long id){
        return  repository.findById(id);
    }

    Optional<NinjaModel> delete(Long id){
        Optional<NinjaModel> ninja = repository.findById(id);
        if(ninja.isPresent()) repository.deleteById(id);
        return ninja;
    }
}
