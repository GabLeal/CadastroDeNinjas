package dev.leal.cadastroDeNinjas.Missions;

import org.springframework.stereotype.Service;

@Service
public class MissionService {

    private final MissionRepository repository;

    MissionService(MissionRepository repository){
        this.repository = repository;
    }

    public MissionModel create(MissionModel missionModel){
        return repository.save(missionModel);
    }
}
