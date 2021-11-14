package com.example.kotlindemo.service

import com.example.kotlindemo.domain.Member
import com.example.kotlindemo.domain.Team
import com.example.kotlindemo.dto.MemberDto
import com.example.kotlindemo.dto.TeamDto
import com.example.kotlindemo.repository.MemberRepository
import com.example.kotlindemo.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(private val teamRepository: TeamRepository) {

    fun createTeam(teamDto: TeamDto):Long?{
        val team = Team(name = teamDto.name)
        teamRepository.save(team)
        return team.id
    }
}