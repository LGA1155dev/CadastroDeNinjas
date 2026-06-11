package dev.studingjava.CadastroDeNinjas.ninjas;
import dev.studingjava.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name  = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    private int age;

    // Varios Ninjas podem ter uma missão
    @ManyToOne
    @JoinColumn(name =  "missoes_id")  // Foreing key ou chave estrangeira
    private MissoesModel missoes;

    public NinjaModel(){

    }

    public NinjaModel(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }


}
