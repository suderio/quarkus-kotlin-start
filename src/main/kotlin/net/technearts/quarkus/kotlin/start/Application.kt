package net.technearts.quarkus.kotlin.start

import io.quarkus.runtime.ShutdownEvent
import io.quarkus.runtime.StartupEvent
import org.eclipse.microprofile.config.inject.ConfigProperty
import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes


@ApplicationScoped
class AppLifecycleBean {
    @ConfigProperty(name = "app.name")
    lateinit var appName: String
    fun onStart(@Observes ev: StartupEvent?) {
        LOGGER.info("A aplicação $appName está iniciando...")
    }

    fun onStop(@Observes ev: ShutdownEvent?) {
        LOGGER.info("A aplicação $appName está parando...")
    }

    companion object {
        private val LOGGER = Logger.getLogger("ListenerBean")
    }
}