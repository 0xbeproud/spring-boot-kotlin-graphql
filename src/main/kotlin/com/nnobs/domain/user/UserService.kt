package com.nnobs.domain.user

import com.nnobs.graphql.user.input.UserCreateInput
import org.springframework.stereotype.Service

@Service
class UserService(
        private val userRepository: UserRepository
) {
    fun getUsers(): MutableList<User> = this.userRepository.findAll()
    fun getUser(id: Long) = this.userRepository.findById(id)

    fun createUser(input: UserCreateInput): User {
        val user = User.create(input.name, input.email, input.nickName)
        return this.userRepository.save(user)
    }
}