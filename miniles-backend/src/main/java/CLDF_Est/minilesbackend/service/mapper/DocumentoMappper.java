package CLDF_Est.minilesbackend.service.mapper;

import CLDF_Est.minilesbackend.domain.Documento;
import org.mapstruct.Mapper;
import CLDF_Est.minilesbackend.service.dto.DocumentoDTO;

@Mapper(componentModel = "spring")
public interface DocumentoMappper extends EntityMapper <DocumentoDTO, Documento> {
}
