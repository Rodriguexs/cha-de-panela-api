package br.com.chadepanelaapi.chadepanelaapi.controller;

import br.com.chadepanelaapi.chadepanelaapi.entity.Convidado;
import br.com.chadepanelaapi.chadepanelaapi.entity.Presente;
import br.com.chadepanelaapi.chadepanelaapi.repository.ConvidadoRepository;
import br.com.chadepanelaapi.chadepanelaapi.repository.PresenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChaDePanelaController {

    @Autowired
    private PresenteRepository presenteRepo;

    @Autowired
    private ConvidadoRepository convidadoRepo;


    @CrossOrigin
    @GetMapping(value = "/presentes")
    public List<Presente> listarPresentes(){
        return presenteRepo.findAll();
    }

    @CrossOrigin
    @PostMapping(value = "/convidado/novo")
    public void cadastrarNovoConvidado(@RequestBody Convidado convidado){
        this.convidadoRepo.save(convidado);
        this.presenteRepo.save(convidado.getPresente());
    }


}
