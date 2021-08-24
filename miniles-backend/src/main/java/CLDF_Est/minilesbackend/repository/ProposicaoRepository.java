package CLDF_Est.minilesbackend.repository;

import CLDF_Est.minilesbackend.domain.Proposicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposicaoRepository extends JpaRepository <Proposicao, Long> {
}
