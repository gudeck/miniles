package repository;

import domain.TipoProposicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPreposicaoRepository extends JpaRepository<TipoProposicao, Long> {
}
