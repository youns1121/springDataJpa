package springboot.jpa.springdatajpa_ysmin.repository;

import org.springframework.stereotype.Repository;
import springboot.jpa.springdatajpa_ysmin.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public Member save(Member member){
        em.persist(member);

        return member;
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
