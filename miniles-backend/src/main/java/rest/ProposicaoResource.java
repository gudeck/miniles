package rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.dto.ProposicaoDTO;


@RequestMapping(value = "/api/proposicao")
@RestController
@RequiredArgsConstructor
public class ProposicaoResource {


    @GetMapping
    public ResponseEntity<ProposicaoDTO> exibirPreposicoes(){

        return ResponseEntity.ok(proposicoesService.findAll());
    }
    @GetMapping
    public ResponseEntity<ProposicaoDTO> buscarProposicaoPorId(@PathVariable("id") long id){
        return new ResponseEntity<>(proposicaoService.findById(id),HttpStatus.OK);

    }
    @PostMapping
    public ResponseEntity<ProposicaoDTO> adicionarProposicao(@RequestBody ProposicaoDTO proposicao){

    return ResponseEntity.ok(proposicaoService.save(proposicao));
    }
    @PutMapping
    public ResponseEntity<ProposicaoDTO> atualizarProposicao(@RequestBody ProposicaoDTO proposicao){
        return  ResponseEntity.ok(proposicaoService.save(proposicao));
    }
    @DeleteMapping
    public ResponseEntity<void> deletarProposicao(@PathVariable("id") long id){
            proposicaoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
