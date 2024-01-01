package io.dingyi222666.androcode.plugin.testplugin

import io.dingyi222666.androcode.annotation.PluginMain
import io.dingyi222666.androcode.api.context.Context
import io.dingyi222666.androcode.api.log
import io.dingyi222666.androcode.api.plugin.PluginConfig
import io.dingyi222666.androcode.api.plugin.ReWriteAndroLuaPlugin
import io.dingyi222666.androcode.api.plugin.buildPluginConfig

@PluginMain
class PluginTest1 : ReWriteAndroLuaPlugin {
    override suspend fun activate(ctx: Context) {
        ctx.log.current.info("load plugin test1")
    }

    override fun config() = buildPluginConfig {
        id = "com.plugin.test1"
        displayName = "test1"
        apiDependencyVersion = 1
        activationEvents {
            event("onLanguage:kotlin")
        }
    }
}

@PluginMain
class PluginTest2 : ReWriteAndroLuaPlugin {
    override suspend fun activate(ctx: Context) {
        ctx.log.current.info("load plugin test2")
    }

    override fun config() = buildPluginConfig {
        id = "com.plugin.test2"
        displayName = "test2"
        apiDependencyVersion = 1
        activationEvents {
            event("onLanguage:kotlin")
        }
    }
}