package GGgame.firstGame.login.controller;

import GGgame.firstGame.login.member.Member;
import GGgame.firstGame.login.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    public Member login(String loginId, String password){
        return memberRepository.findByLoginId(loginId)
                .filter(s->s.getPassword().equals(password))
                .orElse(null);
    }

}
