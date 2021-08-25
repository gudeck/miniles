package CLDF_Est.minilesbackend.rest;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import CLDF_Est.minilesbackend.service.DocumentoService;
import CLDF_Est.minilesbackend.service.dto.DocumentoDTO;

import java.util.List;

@RestController
@RequestMapping(value = "/api/documento")
@RequiredArgsConstructor
public class DocumentoResource {

    private final DocumentoService documentoService;

    @GetMapping
    public ResponseEntity<List<DocumentoDTO>> exibirDocumentos(){

        return ResponseEntity.ok(documentoService.obterTodos());
    }

    @GetMapping("/{id}")
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
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDocumento(@PathVariable("id") long id){
        documentoService.deletar(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
