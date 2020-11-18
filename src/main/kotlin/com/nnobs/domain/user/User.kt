package com.nnobs.domain.user

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "user")
class User : Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L

    var name: String = ""
    var email: String = ""
    var nickName: String = ""

    companion object {
        fun create(name: String, email: String, nickName: String) = User().apply {
            this.name = name
            this.email = email
            this.nickName = nickName
        }
    }
}