package rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TipoProposicaoService;
import service.dto.TipoProposicaoDTO;

import java.util.List;


@RequestMapping(value = "/api/tipoproposicao")
@RestController
@RequiredArgsConstructor
public class TipoProposicaoResource {

    TipoProposicaoService tipoProposicaoService;


    @GetMapping
    public ResponseEntity<List<TipoProposicaoDTO>> exibirTipos(){
        return ResponseEntity.ok(tipoProposicaoService.obterTodos());
    }
    @GetMapping
    public ResponseEntity<TipoProposicaoDTO> buscarTipo( @PathVariable("id") long id){
        return new ResponseEntity<>(tipoProposicaoService.obterPorId(id),HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<TipoProposicaoDTO> adicionarTipo(@RequestBody TipoProposicaoDTO tipoProposicao){

        return ResponseEntity.ok(tipoProposicaoService.salvarTipoProposicao(tipoProposicao));
    }
    @PutMapping
    public ResponseEntity<TipoProposicaoDTO> atualizarTipo(@RequestBody TipoProposicaoDTO tipoProposicao){

        return ResponseEntity.ok(tipoProposicaoService.salvarTipoProposicao(tipoProposicao));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarTipo(@PathVariable("id") long id){
            tipoProposicaoService.deletarPorId(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }

}
