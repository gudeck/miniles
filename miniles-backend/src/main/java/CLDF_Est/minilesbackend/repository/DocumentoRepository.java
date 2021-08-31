package CLDF_Est.minilesbackend.repository;

import CLDF_Est.minilesbackend.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository <Documento, Long> {
}
