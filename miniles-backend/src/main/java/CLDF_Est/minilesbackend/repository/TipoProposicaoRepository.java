package CLDF_Est.minilesbackend.repository;

import CLDF_Est.minilesbackend.domain.TipoProposicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProposicaoRepository extends JpaRepository<TipoProposicao, Long> {
}
