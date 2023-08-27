package co.edu.uts.appdemo.controllers;

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
        Usuario usuario=new Usuario();
        usuario.setNombre("Camilo");
        usuario.setApellido("Perez");
        usuario.setEmail("crodrigr@gmail.com");
        model.addAttribute("usuario", usuario);
        return "perfil";
    }





    
    
}
