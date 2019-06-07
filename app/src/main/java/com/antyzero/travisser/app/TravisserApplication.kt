package com.antyzero.travisser.app

import android.app.Application
import com.antyzero.travisser.core.Travisser
import com.antyzero.travisser.core.ui.TravisserUi

class TravisserApplication : Application() {

    val travisserUi : TravisserUi = TravisserUi(Travisser())
}