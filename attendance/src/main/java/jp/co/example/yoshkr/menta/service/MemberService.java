package jp.co.example.yoshkr.menta.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.example.yoshkr.menta.domain.Member;
import jp.co.example.yoshkr.menta.repository.MemberRepository;

@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public Optional<Member> findMember(Long id){
        return memberRepository.findById(id);
    }
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }
    public Member save(Member member) {
        return memberRepository.save(member);
    }
    public void delete(Long id) {
        memberRepository.deleteById(id);
    }
}
