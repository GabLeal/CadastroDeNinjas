package dev.leal.cadastroDeNinjas.Ninjas;

import dev.leal.cadastroDeNinjas.Missions.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninja")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private int age;
    @Column(name = "image_url")
    private String imageUrl;
    private String rank;
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;

}
