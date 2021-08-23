package rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProposicaoService;
import service.dto.ProposicaoDTO;

import java.util.List;


@RequestMapping(value = "/api/proposicao")
@RestController
@RequiredArgsConstructor
public class ProposicaoResource {


    ProposicaoService proposicaoService;

    @GetMapping
    public ResponseEntity<List<ProposicaoDTO>> exibirPreposicoes(){

        return ResponseEntity.ok(proposicaoService.obterTodos());
    }
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
