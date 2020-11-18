package com.nnobs.graphql.user

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.nnobs.domain.user.UserService
import org.springframework.stereotype.Component

@Component
class UserQueryResolver(
        private val userService: UserService
) : GraphQLQueryResolver {
    fun users() = this.userService.getUsers()
    fun user(id: Long) = this.userService.getUser(id)
}
