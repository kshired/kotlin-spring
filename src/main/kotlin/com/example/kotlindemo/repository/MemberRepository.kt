package com.example.kotlindemo.repository

import com.example.kotlindemo.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member,Long>  {
    @Query("select m from Member m join fetch m.team")
    fun findAllMemberByFetch(): List<Member>
}