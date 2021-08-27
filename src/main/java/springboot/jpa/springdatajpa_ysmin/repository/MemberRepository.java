package springboot.jpa.springdatajpa_ysmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.jpa.springdatajpa_ysmin.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
