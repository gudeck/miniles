package service;


import domain.TipoProposicao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.TipoProposicaoRepository;
import service.dto.TipoProposicaoDTO;
import service.erro.TipoProposicaoNaoEncontrado;
import service.mapper.TipoProposicaoMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoProposicaoService {

    private final TipoProposicaoRepository tipoProposicaoRepository;
    private  final TipoProposicaoMapper tipoProposicaoMapper;


    public List<TipoProposicaoDTO> obterTodos () {
        return  tipoProposicaoMapper.toDto(tipoProposicaoRepository.findAll());
    }

    public TipoProposicaoDTO obterPorId (Long id) {
        TipoProposicao tipoProposicao = tipoProposicaoRepository.findById(id).orElseThrow(TipoProposicaoNaoEncontrado::new);
        return tipoProposicaoMapper.toDto(tipoProposicao);
    }

    public TipoProposicaoDTO salvarTipoProposicao (TipoProposicaoDTO tipoProposicaoDTO) {
        TipoProposicao tipoProposicao = tipoProposicaoMapper.toEntity(tipoProposicaoDTO);
        TipoProposicao tipoProposicaoSalvo = tipoProposicaoRepository.save(tipoProposicao);
        return  tipoProposicaoMapper.toDto(tipoProposicaoSalvo);
    }


    public void deletarPorId (Long id) {
        tipoProposicaoRepository.deleteById(id);
    }


}





