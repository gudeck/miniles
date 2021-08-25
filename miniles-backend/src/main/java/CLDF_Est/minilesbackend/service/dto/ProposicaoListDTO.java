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

    private Long id;
    private String sigla;
    private String nome;
    private String ementa;
    private Long numeroDeDocumentos;
}
