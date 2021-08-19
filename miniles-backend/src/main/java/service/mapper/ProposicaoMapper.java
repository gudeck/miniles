package service.mapper;

import domain.Proposicao;
import org.mapstruct.Mapper;
import service.dto.ProposicaoDTO;

@Mapper(componentModel = "spring", uses = {TipoProposicaoMapper.class, DocumentoMappper.class} )
public interface ProposicaoMapper extends EntityMapper<ProposicaoDTO, Proposicao> {
}
