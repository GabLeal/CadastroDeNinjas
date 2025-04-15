package dev.leal.cadastroDeNinjas.Missions;

import dev.leal.cadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_mission")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rank;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}
