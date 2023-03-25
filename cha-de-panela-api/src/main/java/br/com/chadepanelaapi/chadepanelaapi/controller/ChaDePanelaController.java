package br.com.chadepanelaapi.chadepanelaapi.controller;

import br.com.chadepanelaapi.chadepanelaapi.entity.Convidado;
import br.com.chadepanelaapi.chadepanelaapi.entity.Presente;
import br.com.chadepanelaapi.chadepanelaapi.repository.ConvidadoRepository;
import br.com.chadepanelaapi.chadepanelaapi.repository.PresenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChaDePanelaController {

    @Autowired
    private PresenteRepository presenteRepo;

    @Autowired
    private ConvidadoRepository convidadoRepo;


    @GetMapping(value = "/presentes")
    public List<Presente> listarPresentes(){
        return presenteRepo.findAll();
    }

    @PostMapping(value = "/convidado/novo")
    public void cadastrarNovoConvidado(@RequestBody Convidado convidado){
        this.convidadoRepo.save(convidado);
        this.presenteRepo.save(convidado.getPresente());
    }


}
