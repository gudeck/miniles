package service;

import domain.Documento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.DocumentoRepository;
import service.dto.DocumentoDTO;
import service.erro.DocumentoNaoEncontrado;
import service.mapper.DocumentoMappper;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DocumentoService {

    private final DocumentoRepository documentoRepository;
    private final DocumentoMappper documentoMappper;


    public List<DocumentoDTO> obterTodos() {
        return documentoMappper.toDto(documentoRepository.findAll());
    }

    public DocumentoDTO obterPorId(Long id) {
        Documento documento = documentoRepository.findById(id).orElseThrow(DocumentoNaoEncontrado::new);
        return documentoMappper.toDto(documento);
    }

    public DocumentoDTO salvarDocumento(DocumentoDTO documentoDTO) {
        Documento documento = documentoMappper.toEntity(documentoDTO);
        Documento documentoSalvo = documentoRepository.save(documento);
        return documentoMappper.toDto(documentoSalvo);
    }

    public void deletar(Long id) {
        documentoRepository.deleteById(id);
    }


}
