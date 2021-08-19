package service.mapper;

import domain.Documento;
import org.mapstruct.Mapper;
import service.dto.DocumentoDTO;

@Mapper(componentModel = "spring")
public interface DocumentoMappper extends EntityMapper <DocumentoDTO, Documento> {
}
