package rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DocumentoService;
import service.dto.DocumentoDTO;

import java.util.List;

@RestController
@RequestMapping(value = "/api/documento")
public class DocumentoResource {

    DocumentoService documentoService;

    @GetMapping
    public ResponseEntity<List<DocumentoDTO>> exibirDocumentos(){

        return ResponseEntity.ok(documentoService.obterTodos());
    }
    @GetMapping
    public ResponseEntity<DocumentoDTO> buscarDocumentoPorId(@PathVariable("id") long id){

        return new ResponseEntity<>(documentoService.obterTodosPorId(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<DocumentoDTO> adicionarDocumento(@RequestBody DocumentoDTO documento){
        return ResponseEntity.ok(documentoService.salvarDocumento(documento));
    }
    @PutMapping
    public ResponseEntity<DocumentoDTO> atualizarDocumento(@RequestBody DocumentoDTO documento){

        return ResponseEntity.ok(documentoService.salvarDocumento(documento));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarDocumento(@PathVariable("id") long id){
        documentoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
