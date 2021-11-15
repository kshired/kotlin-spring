package com.example.kotlindemo.controller

import com.example.kotlindemo.dto.ResponseDto
import com.example.kotlindemo.dto.ResponseWrapperDto
import com.example.kotlindemo.dto.TeamDto
import com.example.kotlindemo.service.TeamService
import com.example.kotlindemo.util.ResponseStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/teams")
class TeamController(private val teamService: TeamService) {

    @PostMapping
    fun createTeam(@RequestBody teamDto: TeamDto): ResponseWrapperDto{
        val teamId = teamService.createTeam(teamDto)
        return ResponseDto(ResponseStatus.SUCCESS, mapOf("id" to teamId))
    }
}