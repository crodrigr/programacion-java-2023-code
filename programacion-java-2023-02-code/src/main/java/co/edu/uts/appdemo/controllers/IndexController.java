package co.edu.uts.appdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uts.appdemo.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index","/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index";
    }

    @GetMapping("/perfil")
    public String  perfil(Model model) {
        model.addAttribute("titulo", "Perfil usuario");
        List<Usuario> usuarios=getAllUsuario();
        model.addAttribute("usuarios", usuarios);
        return "perfil";
    }

    private List<Usuario> getAllUsuario(){

        List<Usuario> usuarios=new ArrayList<>();
        usuarios.add(new Usuario("Camilo","Rodriguez","crodrigr@gmail.com"));
        usuarios.add(new Usuario("Juan","Perez","jperez@gmail.com"));
        usuarios.add(new Usuario("Diana","Tarazona","dtarazona@gmail.com"));
        usuarios.add(new Usuario("Diego","Rangel","drangel@gmail.com"));
        usuarios.add(new Usuario("Sebastian","Camargo","scamargo@gmail.com"));
        usuarios.add(new Usuario("Carlos","Martinez","cmartinez@gmail.com"));
        usuarios.add(new Usuario("Celina","Torres","ctorres@gmail.com"));
        
        return usuarios;

        
    }

    



    

    
    
}
