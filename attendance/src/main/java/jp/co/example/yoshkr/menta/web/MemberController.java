package jp.co.example.yoshkr.menta.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.yoshkr.menta.domain.Member;
import jp.co.example.yoshkr.menta.service.MemberService;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    MemberService attendService;

    @RequestMapping(method=RequestMethod.GET, value="{id}")
    public Optional<Member> getMember(@PathVariable("id") Long id) {
        return attendService.findMember(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Member createMember(@Validated @RequestBody Member member) {
        return attendService.save(member);
    }

    @RequestMapping(method=RequestMethod.PUT, value="{id}")
    public Member updateMember(@PathVariable("id") Long id, @RequestBody Member member) {
        member.setId(id);
        return attendService.save(member);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void deleteMember(@PathVariable("id") Long id) {
        attendService.delete(id);
    }
}