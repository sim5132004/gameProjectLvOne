package GGgame.firstGame.login.controller;

import GGgame.firstGame.login.member.Member;
import GGgame.firstGame.login.member.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members/add")
    public String addForm(Member member){
        return "members/addMemberForm";
    }
    @PostMapping("/members/add")
    public String save(@Validated Member member, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "members/addMemberForm";
        }
        memberRepository.save(member);
        return "redirect:/";
    }

    @PostConstruct
    public void init(){
        memberRepository.save(new Member("test","1111","테스터1"));
        memberRepository.save(new Member("test2","1111","테스터2"));

    }
}
