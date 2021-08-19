package service.dto;

import domain.Documento;
import domain.TipoProposicao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProposicaoDTO {

    private long id;            //numero do documento
    private String ementa;
    private TipoProposicao tipoProposicao;
    private List<Documento> documentos;
    private boolean regimeDeUrgencia;
}
