package Domain;
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
    @Column(name = "id")
    private long id;            //numero do documento
    @Column(name = "ementa")
    private String ementa;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipoProposição")
    private TipoProposicao tipoProposicao;
    @OneToMany
    @JoinColumn(name = "id_proposicoes")
    private List<Documento> comentario;



}
