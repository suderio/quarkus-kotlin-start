package net.technearts.quarkus.kotlin.start

import io.quarkus.runtime.ShutdownEvent
import io.quarkus.runtime.StartupEvent
import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes


@ApplicationScoped
class AppLifecycleBean {
    fun onStart(@Observes ev: StartupEvent?) {
        LOGGER.info("The application is starting...")
    }

    fun onStop(@Observes ev: ShutdownEvent?) {
        LOGGER.info("The application is stopping...")
    }

    companion object {
        private val LOGGER = Logger.getLogger("ListenerBean")
    }
}