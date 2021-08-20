package domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Proposicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String ementa;
    private Boolean regimeDeUrgencia = false;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipo_proposicao")
    private TipoProposicao tipoProposicao;
    private List<Documento> documentos;


}
