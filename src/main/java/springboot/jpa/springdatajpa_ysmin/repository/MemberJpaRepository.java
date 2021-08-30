package springboot.jpa.springdatajpa_ysmin.repository;

import org.springframework.stereotype.Repository;
import springboot.jpa.springdatajpa_ysmin.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public Member save(Member member){
        em.persist(member);

        return member;
    }

    public List<Member> findALL(){
        return em.createQuery("select m from Member m", Member.class)
                .getResultList(); // 리스트로 반환
    }

    public Optional<Member> findById(Long id){
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    public long count() {
        return em.createQuery("select count(m) from Member m", Long.class)
                .getSingleResult(); // 단건으로 반환
    }

    public void delete(Member member){
        em.remove(member);
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
