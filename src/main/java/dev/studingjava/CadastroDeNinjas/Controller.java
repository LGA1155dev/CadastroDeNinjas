package dev.studingjava.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

                @GetMapping("/minha-rota")
                public String helloWorld(){
                    return "Hello world";
                }
}
