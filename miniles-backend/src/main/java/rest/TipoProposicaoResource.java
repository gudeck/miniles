package rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.dto.TipoProposicaoDTO;



@RequestMapping(value = "/api/tipoproposicao")
@RestController
@RequiredArgsConstructor
public class TipoProposicaoResource {



    @GetMapping
    public ResponseEntity<TipoProposicaoDTO> exibirTipos(){
        return ResponseEntity.ok(tipoProposicaoService.findAll());
    }
    @GetMapping
    public ResponseEntity<TipoProposicaoDTO> buscarTipo( @PathVariable("id") long id){
        return new ResponseEntity<>(tipoProposicaoService.findById(id),HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<TipoProposicaoDTO> adicionarTipo(@RequestBody TipoProposicaoDTO tipoProposicao){

        return ResponseEntity.ok(tipoProposicaoService.save(tipoProposicao));
    }
    @PutMapping
    public ResponseEntity<TipoProposicaoDTO> atualizarTipo(@RequestBody TipoProposicaoDTO tipoProposicao){

        return ResponseEntity.ok(tipoProposcaoService.save(tipoProposicao));
    }

    @DeleteMapping
    public ResponseEntity<void> deletarTipo(@PathVariable("id") long id){
            tipoProposicaoService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }

}
