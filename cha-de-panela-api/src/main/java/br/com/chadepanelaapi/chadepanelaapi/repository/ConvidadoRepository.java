package br.com.chadepanelaapi.chadepanelaapi.repository;

import br.com.chadepanelaapi.chadepanelaapi.entity.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
}
