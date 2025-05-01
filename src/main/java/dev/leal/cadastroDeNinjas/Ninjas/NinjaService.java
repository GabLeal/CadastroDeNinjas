package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    private final NinjaRepository repository;

    NinjaService(NinjaRepository repository){
        this.repository = repository;
    }

    NinjaModel createNinja(NinjaModel ninja){
        return repository.save(ninja);
    }

}
