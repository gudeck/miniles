package CLDF_Est.minilesbackend.service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoDTO {

    private Long id;
    private String nome;
    private String texto;
}
