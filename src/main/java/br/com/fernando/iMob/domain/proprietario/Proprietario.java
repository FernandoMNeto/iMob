package br.com.fernando.iMob.domain.proprietario;

import br.com.fernando.iMob.domain.imovel.Imovel;

import java.util.List;

public class Proprietario {
    private String urlFoto;
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private List<Imovel> imoveis;
}
