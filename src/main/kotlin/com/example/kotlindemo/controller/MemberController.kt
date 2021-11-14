package com.example.kotlindemo.controller

import com.example.kotlindemo.dto.AddTeamDto
import com.example.kotlindemo.dto.MemberDto
import com.example.kotlindemo.service.MemberService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/members")
class MemberController(private val memberService: MemberService) {

    @PostMapping
    fun createMember(@RequestBody memberDto: MemberDto): String{
        memberService.createMember(memberDto)
        return "ok"
    }

    @PostMapping("/team")
    fun addTeam(@RequestBody addTeamDto: AddTeamDto): String{
        memberService.addTeam(addTeamDto)
        return "ok"
    }
}