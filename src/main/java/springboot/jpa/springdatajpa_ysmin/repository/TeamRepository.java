package springboot.jpa.springdatajpa_ysmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.jpa.springdatajpa_ysmin.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
