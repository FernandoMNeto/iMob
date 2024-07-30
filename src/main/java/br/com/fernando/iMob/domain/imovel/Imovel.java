package br.com.fernando.iMob.domain.imovel;

import br.com.fernando.iMob.domain.endereco.Endereco;
import br.com.fernando.iMob.domain.proprietario.Proprietario;
import br.com.fernando.iMob.domain.proximidade.Proximidade;
import br.com.fernando.iMob.domain.tipoimovel.TipoImovel;

import java.util.List;

public class Imovel {
    private String nome;
    private String descricao;
    private Integer nrBanheiros;
    private Integer nrQuartos;
    private Integer nrSuites;
    private Integer nrVagasGaragem;
    private List<String> urlFotos;
    private Endereco endereco;
    private Proprietario proprietario;
    private List<Proximidade> proximidade;
    private TipoImovel tipoImovel;
}