package com.nnobs.graphql.user

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.nnobs.domain.user.User
import com.nnobs.domain.user.UserService
import com.nnobs.graphql.user.input.UserCreateInput
import org.springframework.stereotype.Component

@Component
class UserMutationResolver(
        private val userService: UserService
): GraphQLMutationResolver {
    fun createUser(input: UserCreateInput): User =
        this.userService.createUser(input)

}