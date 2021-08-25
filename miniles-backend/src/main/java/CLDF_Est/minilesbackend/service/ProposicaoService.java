package CLDF_Est.minilesbackend.service;


import CLDF_Est.minilesbackend.domain.Proposicao;
import CLDF_Est.minilesbackend.service.dto.ProposicaoListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import CLDF_Est.minilesbackend.repository.ProposicaoRepository;
import CLDF_Est.minilesbackend.service.dto.ProposicaoDTO;
import CLDF_Est.minilesbackend.service.erro.ProposicaoNaoEncontrada;
import CLDF_Est.minilesbackend.service.mapper.ProposicaoMapper;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProposicaoService {

    private final ProposicaoRepository proposicaoRepository;
    private final ProposicaoMapper proposicaoMapper;


    public List<ProposicaoListDTO> obterTodos() {
        return proposicaoRepository.listagem();
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

