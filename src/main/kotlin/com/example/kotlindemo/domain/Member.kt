package com.example.kotlindemo.domain

import javax.persistence.*

@Entity
class Member(name:String, email:String) {
    @Id
    @GeneratedValue
    @Column(name="MEMBER_ID")
    var id: Long? = null
        private set
    var name: String = name
        private set
    var email: String = email
        private set

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="TEAM_ID")
    var team: Team? = null
        private set

    fun addTeam(team: Team){
        this.team = team
        team.addMember(this)
    }

}