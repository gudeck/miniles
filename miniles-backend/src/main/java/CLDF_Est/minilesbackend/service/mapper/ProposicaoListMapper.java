package CLDF_Est.minilesbackend.service.mapper;

import CLDF_Est.minilesbackend.domain.Proposicao;
import CLDF_Est.minilesbackend.service.dto.ProposicaoDTO;
import CLDF_Est.minilesbackend.service.dto.ProposicaoListDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {TipoProposicaoMapper.class, DocumentoMappper.class} )
public interface ProposicaoListMapper extends EntityMapper<ProposicaoListDTO, Proposicao> {
}
