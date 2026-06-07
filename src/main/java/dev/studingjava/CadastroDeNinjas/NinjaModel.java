package dev.studingjava.CadastroDeNinjas;
import jakarta.persistence.*;

@Entity
@Table(name  = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String name;
    public String email;
    public int age;

    public NinjaModel(){

    }

    public NinjaModel(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }


}
