package service;

import domain.Proposicao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ProposicaoRepository;
import service.dto.ProposicaoDTO;
import service.erro.ProposicaoNaoEncontrada;
import service.mapper.ProposicaoMapper;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProposicoesService {

    private final ProposicaoRepository proposicaoRepository;
    private final ProposicaoMapper proposicaoMapper;


    public List<ProposicaoDTO> obterTodos() {
        return proposicaoMapper.toDto(proposicaoRepository.findAll());
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
