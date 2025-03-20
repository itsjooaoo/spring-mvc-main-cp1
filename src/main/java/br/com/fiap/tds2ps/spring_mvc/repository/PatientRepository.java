package br.com.fiap.tds2ps.spring_mvc.repository;

import br.com.fiap.tds2ps.spring_mvc.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByCpf(String cpf);
}