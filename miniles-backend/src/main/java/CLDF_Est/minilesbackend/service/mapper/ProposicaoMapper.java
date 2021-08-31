package CLDF_Est.minilesbackend.service.mapper;

import CLDF_Est.minilesbackend.domain.Proposicao;
import org.mapstruct.Mapper;
import CLDF_Est.minilesbackend.service.dto.ProposicaoDTO;

@Mapper(componentModel = "spring", uses = {TipoProposicaoMapper.class, DocumentoMappper.class} )
public interface ProposicaoMapper extends EntityMapper<ProposicaoDTO, Proposicao> {
}
