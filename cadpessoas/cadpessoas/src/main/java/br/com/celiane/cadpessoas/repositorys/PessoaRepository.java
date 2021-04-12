package br.com.celiane.cadpessoas.repositorys;

import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, long> {

}
