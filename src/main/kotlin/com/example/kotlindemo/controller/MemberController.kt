package com.example.kotlindemo.controller

import com.example.kotlindemo.dto.AddTeamDto
import com.example.kotlindemo.dto.MemberDto
import com.example.kotlindemo.dto.ResponseDto
import com.example.kotlindemo.dto.ResponseWrapperDto
import com.example.kotlindemo.service.MemberService
import com.example.kotlindemo.util.ResponseStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/members")
class MemberController(private val memberService: MemberService) {

    @PostMapping
    fun createMember(@RequestBody memberDto: MemberDto): ResponseWrapperDto {
        val memberId = memberService.createMember(memberDto)
        return ResponseDto(ResponseStatus.SUCCESS, mapOf("id" to memberId))
    }

    @PostMapping("/team")
    fun addTeam(@RequestBody addTeamDto: AddTeamDto): ResponseWrapperDto{
        memberService.addTeam(addTeamDto)
        return ResponseDto(ResponseStatus.SUCCESS, null)
    }

    @GetMapping
    fun getAllMembers(): ResponseWrapperDto{
        val members = memberService.findAllMembers()
        val membersMap = mapOf("members" to members)
        return ResponseDto(ResponseStatus.SUCCESS, membersMap)
    }
}