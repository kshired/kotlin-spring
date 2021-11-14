package com.example.kotlindemo.domain

import javax.persistence.*

@Entity
class Team(name:String) {
    @Id
    @GeneratedValue
    @Column(name="TEAM_ID")
    var id: Long? = null
        private set
    var name: String = name
        private set

    @OneToMany(mappedBy = "team")
    private var members: MutableList<Member> = mutableListOf()

    fun addMember(member: Member) {
        this.members.add(member)
    }
}