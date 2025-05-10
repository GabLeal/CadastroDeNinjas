package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private final NinjaRepository repository;
    private final NinjaMapper ninjaMapper;

    NinjaService(NinjaRepository repository, NinjaMapper ninjaMapper){
        this.repository = repository;
        this.ninjaMapper = ninjaMapper;
    }

    NinjaDTO createNinja(NinjaDTO ninja){
        NinjaModel ninjaModel = ninjaMapper.map(ninja);
        ninjaModel = repository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    List<NinjaDTO> findAll(){
        return  repository.findAll()
                .stream()
                .map((ninjaMapper::map)).toList();
    }

    Optional<NinjaDTO> findById(Long id){
        return  repository.findById(id).map(ninjaMapper::map);
    }

    Optional<NinjaDTO> delete(Long id){
        Optional<NinjaDTO> ninja = repository.findById(id).map(ninjaMapper::map);
        if(ninja.isPresent()) repository.deleteById(id);
        return ninja;
    }

    Optional<NinjaDTO> update(Long id, NinjaDTO ninja){
        boolean hasNinja = repository.existsById(id);
        if(!hasNinja) return Optional.empty();

        NinjaModel ninjaModel = ninjaMapper.map(ninja);
        ninjaModel.setId(id);
        ninjaModel = repository.save(ninjaModel);
        return Optional.of(ninjaMapper.map(ninjaModel)) ;
    }
}
