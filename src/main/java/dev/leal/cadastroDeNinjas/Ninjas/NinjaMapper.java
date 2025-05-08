package dev.leal.cadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

@Component
class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setName(ninjaDTO.getName());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setAge(ninjaDTO.getAge());
        ninjaModel.setImageUrl(ninjaDTO.getImageUrl());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMission(ninjaDTO.getMission());

        return  ninjaModel;
    }

    public NinjaDTO map(NinjaModel NinjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(NinjaModel.getId());
        ninjaDTO.setName(NinjaModel.getName());
        ninjaDTO.setEmail(NinjaModel.getEmail());
        ninjaDTO.setAge(NinjaModel.getAge());
        ninjaDTO.setImageUrl(NinjaModel.getImageUrl());
        ninjaDTO.setRank(NinjaModel.getRank( ));
        ninjaDTO.setMission(NinjaModel.getMission());

        return  ninjaDTO;
    }
}
