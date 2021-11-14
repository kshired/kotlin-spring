package com.example.kotlindemo.repository

import com.example.kotlindemo.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member,Long>  {
}