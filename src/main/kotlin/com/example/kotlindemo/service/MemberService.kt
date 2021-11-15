package com.example.kotlindemo.service

import com.example.kotlindemo.domain.Member
import com.example.kotlindemo.dto.AddTeamDto
import com.example.kotlindemo.dto.MemberDto
import com.example.kotlindemo.repository.MemberRepository
import com.example.kotlindemo.repository.TeamRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(private val memberRepository: MemberRepository, private val teamRepository: TeamRepository) {
    fun createMember(memberDto: MemberDto): Long? {
        val member = Member(email = memberDto.email, name = memberDto.name)
        memberRepository.save(member)
        return member.id
    }

    fun findAllMembers(): List<Member> {
        return memberRepository.findAllMemberByFetch()
    }

    @Transactional
    fun addTeam(addTeamDto: AddTeamDto): Boolean {
        val findMember = memberRepository.findByIdOrNull(addTeamDto.memberId)
        val findTeam = teamRepository.findByIdOrNull(addTeamDto.teamId)
        findMember!!.addTeam(findTeam!!)
        return true
    }


}