package org.luovuutesi.moduleexample.kotlin

import org.luovuutesi.api.Module

class ExampleModule : Module {
    override val moduleId = "example-module-kotlin"

    override fun start() {
        println("Started Kotlin Example Module!")
    }

    override fun stop() {
        println("Stopped Kotlin Example Module!")
    }
}