package com.antyzero.travisser.network.travis.retrofit

import com.antyzero.travisser.network.travis.Repository
import com.antyzero.travisser.network.travis.TravisApi

interface TravisApiRetrofit : TravisApi {

    
    override fun ownerRepositories(): Collection<Repository>
}