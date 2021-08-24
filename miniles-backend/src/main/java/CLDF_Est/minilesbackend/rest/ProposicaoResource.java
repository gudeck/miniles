package CLDF_Est.minilesbackend.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import CLDF_Est.minilesbackend.service.ProposicaoService;
import CLDF_Est.minilesbackend.service.dto.ProposicaoDTO;

import java.util.List;



@RestController
@RequestMapping(value ="/api/proposicao")
@RequiredArgsConstructor
public class ProposicaoResource {


    private final  ProposicaoService proposicaoService;

    @GetMapping
    public ResponseEntity<List<ProposicaoDTO>> exibirProposicoes(){

        return ResponseEntity.ok(proposicaoService.obterTodos());
    }
    @RequestMapping(value = "/id")
    @GetMapping
    public ResponseEntity<ProposicaoDTO> buscarProposicaoPorId(@PathVariable("id") long id){
        return new ResponseEntity<>(proposicaoService.obterPorId(id),HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<ProposicaoDTO> adicionarProposicao(@RequestBody ProposicaoDTO proposicao){

    return ResponseEntity.ok(proposicaoService.salvarProposicao(proposicao));
    }
    @PutMapping
    public ResponseEntity<ProposicaoDTO> atualizarProposicao(@RequestBody ProposicaoDTO proposicao){
        return  ResponseEntity.ok(proposicaoService.salvarProposicao(proposicao));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarProposicao(@PathVariable("id") long id){
            proposicaoService.deletarPorId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
