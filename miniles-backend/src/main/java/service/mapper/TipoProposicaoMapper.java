package service.mapper;

import domain.TipoProposicao;
import org.mapstruct.Mapper;
import service.dto.TipoProposicaoDTO;

@Mapper(componentModel = "spring")
public interface TipoProposicaoMapper extends EntityMapper<TipoProposicaoDTO,TipoProposicao> {
}
