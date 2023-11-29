package com.example.perionpractice.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

     @PostMapping("/add")
     public String regMember(@ModelAttribute MemberAddFormDto memberAddFormDto){
         memberService.join(MemberAddFormDto.MemberAddFormDtoToMember(memberAddFormDto));
         return "member/addSuccess";
     }
}
