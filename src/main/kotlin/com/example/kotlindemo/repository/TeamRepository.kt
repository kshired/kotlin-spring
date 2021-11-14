package com.example.kotlindemo.repository

import com.example.kotlindemo.domain.Team
import org.springframework.data.jpa.repository.JpaRepository

interface TeamRepository : JpaRepository<Team, Long> {
}