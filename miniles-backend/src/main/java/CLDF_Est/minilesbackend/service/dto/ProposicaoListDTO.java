package CLDF_Est.minilesbackend.service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProposicaoListDTO {

//    private Long id;
//    private String sigla;
    private TipoProposicaoDTO tipoProposicao;
    private Long id;
    private String ementa;
    private Integer numeroDeDocumentos;
    private Boolean regimeDeUrgencia = false;
}
