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
@Table(name = "proposicao")
public class Proposicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ementa;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipo_proposicao")
    private TipoProposicao tipoProposicao;
    @OneToMany
    @JoinColumn(name = "id_proposicao")
    private List<Documento> documentos;

    private boolean regimeDeUrgencia = false;

}
