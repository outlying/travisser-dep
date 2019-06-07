package com.antyzero.travisser.network.travis

interface TravisApi {

    fun ownerRepositories(): Collection<Repository>

    companion object {

        fun create(){

        }
    }
}
