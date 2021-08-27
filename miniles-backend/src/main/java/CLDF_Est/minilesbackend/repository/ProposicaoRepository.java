package CLDF_Est.minilesbackend.repository;

import CLDF_Est.minilesbackend.domain.Proposicao;
import CLDF_Est.minilesbackend.service.dto.ProposicaoListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProposicaoRepository extends JpaRepository <Proposicao, Long> {

//    @Query("select new CLDF_Est.minilesbackend.service.dto.ProposicaoListDTO(p.id, p.tipoProposicao.sigla, p.tipoProposicao.nome, p.ementa,  count(pd.id)) from Proposicao p join p.documentos pd group by p.id, p.tipoProposicao.sigla, p.tipoProposicao.nome, p.ementa")
//    List<ProposicaoListDTO>
//    listagem();








}
