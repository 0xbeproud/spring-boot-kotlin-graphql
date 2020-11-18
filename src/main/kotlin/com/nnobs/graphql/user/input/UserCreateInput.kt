package com.nnobs.graphql.user.input

data class UserCreateInput(
        val name: String,
        val email: String,
        val nickName: String
)