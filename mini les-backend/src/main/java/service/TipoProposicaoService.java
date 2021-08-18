package service;

import domain.TipoProposicao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.TipoPreposicaoRepository;
import service.dto.TipoProposicaoDTO;
import service.erro.TipoProposicaoNaoEncontrado;
import service.mapper.TipoProposicaoMapper;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TipoProposicaoService {

    private final TipoPreposicaoRepository tipoPreposicaoRepository;
    private  final TipoProposicaoMapper tipoProposicaoMapper;


    public List<TipoProposicaoDTO> ObterTodos () {
     return  tipoProposicaoMapper.toDto(tipoPreposicaoRepository.findAll());
    }

    public TipoProposicaoDTO obterPorId (Long id) {
        TipoProposicao tipoProposicao = tipoPreposicaoRepository.findById(id).orElseThrow(TipoProposicaoNaoEncontrado::new);
        return tipoProposicaoMapper.toDto(tipoProposicao);
    }

    public TipoProposicaoDTO salarTipoProposicao (TipoProposicaoDTO tipoProposicaoDTO) {
        TipoProposicao tipoProposicao = tipoProposicaoMapper.toEntity(tipoProposicaoDTO);
        TipoProposicao tipoProposicaoSalvo = tipoPreposicaoRepository.save(tipoProposicao);
        return  tipoProposicaoMapper.toDto(tipoProposicaoSalvo);
    }


    public void deletarPorId (Long id) {
        tipoPreposicaoRepository.deleteById(id);
    }


}
