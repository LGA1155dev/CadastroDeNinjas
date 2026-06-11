package dev.studingjava.CadastroDeNinjas.missoes;
import dev.studingjava.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name =  "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dificuldade;

    // Uma missão pode ter vários Ninjas
    @OneToMany
    private List<NinjaModel> ninjas;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjaModel;

}
