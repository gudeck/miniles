package CLDF_Est.minilesbackend.service;


import CLDF_Est.minilesbackend.domain.Proposicao;
import CLDF_Est.minilesbackend.service.dto.ProposicaoListDTO;
import CLDF_Est.minilesbackend.service.mapper.ProposicaoListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import CLDF_Est.minilesbackend.repository.ProposicaoRepository;
import CLDF_Est.minilesbackend.service.dto.ProposicaoDTO;
import CLDF_Est.minilesbackend.service.erro.ProposicaoNaoEncontrada;
import CLDF_Est.minilesbackend.service.mapper.ProposicaoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProposicaoService {

    private final ProposicaoRepository proposicaoRepository;
    private final ProposicaoMapper proposicaoMapper;
    private final ProposicaoListMapper proposicaoListMapper;

    public List<ProposicaoListDTO> obterTodos() {
    List<ProposicaoListDTO> element = proposicaoRepository.findAll().stream()
            .map(proposicao -> {
                ProposicaoListDTO listDTO = proposicaoListMapper.toDto(proposicao);
                listDTO.setNumeroDeDocumentos(proposicao.getDocumentos().size());
                return listDTO;
            }).collect(Collectors.toList());


        return element ;
    }


    public ProposicaoDTO obterPorId(Long id) {
        Proposicao proposicao = proposicaoRepository.findById(id).orElseThrow(ProposicaoNaoEncontrada::new);
        return proposicaoMapper.toDto(proposicao);
    }

    public ProposicaoDTO salvarProposicao(ProposicaoDTO proposicaoDTO) {
        Proposicao proposicao = proposicaoMapper.toEntity(proposicaoDTO);
        Proposicao proposicaoSalva = proposicaoRepository.save(proposicao);
        return proposicaoMapper.toDto(proposicaoSalva);
    }

    public void deletarPorId(Long id) {
        proposicaoRepository.deleteById(id);
    }

}

