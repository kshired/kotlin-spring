package com.example.kotlindemo.domain

import javax.persistence.*

@Entity
class Team(_name:String) {
    @Id
    @GeneratedValue
    @Column(name="TEAM_ID")
    var id: Long? = null
        private set
    var name: String = _name
        private set

    @OneToMany(mappedBy = "team")
    private var members: MutableList<Member> = mutableListOf()

    fun addMember(member: Member) {
        this.members.add(member)
    }
}