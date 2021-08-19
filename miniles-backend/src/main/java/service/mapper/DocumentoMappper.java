package service.mapper;

import domain.Documento;
import org.mapstruct.Mapper;
import service.dto.DocumentoDTO;

@Mapper(componentModel = "spring", uses = TipoProposicaoMapper.class)
public interface DocumentoMappper extends EntityMapper <DocumentoDTO, Documento> {
}
