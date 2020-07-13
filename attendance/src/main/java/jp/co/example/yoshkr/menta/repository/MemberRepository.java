package jp.co.example.yoshkr.menta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.example.yoshkr.menta.domain.Member;
@Repository
public interface MemberRepository  extends JpaRepository<Member, Long>{

}
