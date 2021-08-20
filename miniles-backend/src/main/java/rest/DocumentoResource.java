package rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.dto.DocumentoDTO;

@RestController
@RequestMapping(value = "/api/documento")
public class DocumentoResource {

    @GetMapping
    public ResponseEntity<DocumentoDTO> exibirDocumentos(){

        return ResponseEntity.ok(documentoService.findAll());
    }
    @GetMapping
    public ResponseEntity<DocumentoDTO> buscarDocumentoPorId(@PathVariable("id") long id){

        return new ResponseEntity<>(documentoService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<DocumentoDTO> adicionarDocumento(@RequestBody DocumentoDTO documento){
        return ResponseEntity.ok(documentoService.save(documento));
    }
    @PutMapping
    public ResponseEntity<DocumentoDTO> atualizarDocumento(@RequestBody DocumentoDTO documento){

        return ResponseEntity.ok(docuemtoService.save(documento));
    }
    @DeleteMapping
    public ResponseEntity<void> deletarDocumento(@PathVariable("id") long id){
        documentoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
