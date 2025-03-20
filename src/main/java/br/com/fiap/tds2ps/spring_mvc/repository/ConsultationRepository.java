package br.com.fiap.tds2ps.spring_mvc.repository;

import br.com.fiap.tds2ps.spring_mvc.domain.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {}