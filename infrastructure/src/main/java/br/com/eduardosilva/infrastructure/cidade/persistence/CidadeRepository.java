package br.com.eduardosilva.infrastructure.cidade.persistence;

import br.com.eduardosilva.domain.cidade.CidadePreview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CidadeRepository extends JpaRepository<CidadeJpaEntity,Long> {

    @Query("""
            select
                new br.com.eduardosilva.domain.cidade.CidadePreview(
                    c.id,
                    c.nome,
                    c.uf
                ) 
            from CidadeJpaEntity c
            where
               :nome is null or UPPER(c.nome) like :nome 
            and
               :uf is null or UPPER(c.uf) like :uf 
            """)
    Page<CidadePreview> findAll(String nome, String uf, Pageable page);
}
