package dev.leal.cadastroDeNinjas.Ninjas;

import dev.leal.cadastroDeNinjas.Missions.MissionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private int age;
    private String imageUrl;
    private MissionModel mission;
    private String rank;
}
