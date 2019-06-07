package com.antyzero.travisser.core.repository

import com.antyzero.travisser.core.repository.model.GitRepository

interface Repository {

    fun ownerRepositories(ownerName: String): Collection<GitRepository>
}