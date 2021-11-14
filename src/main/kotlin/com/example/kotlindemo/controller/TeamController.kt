package com.example.kotlindemo.controller

import com.example.kotlindemo.dto.MemberDto
import com.example.kotlindemo.dto.TeamDto
import com.example.kotlindemo.service.MemberService
import com.example.kotlindemo.service.TeamService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController(private val teamService: TeamService) {

    @PostMapping
    fun createTeam(@RequestBody teamDto: TeamDto): String{
        teamService.createTeam(teamDto)
        return "ok"
    }
}