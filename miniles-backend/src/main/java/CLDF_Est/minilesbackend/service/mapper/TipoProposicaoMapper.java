package CLDF_Est.minilesbackend.service.mapper;

import CLDF_Est.minilesbackend.domain.TipoProposicao;
import org.mapstruct.Mapper;
import CLDF_Est.minilesbackend.service.dto.TipoProposicaoDTO;

@Mapper(componentModel = "spring")
public interface TipoProposicaoMapper extends EntityMapper<TipoProposicaoDTO,TipoProposicao> {


}
