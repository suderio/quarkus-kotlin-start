package net.technearts.quarkus.kotlin.start

import io.quarkus.test.junit.NativeImageTest
import net.technearts.quarkus.kotlin.start.GreetingResourceTest

@NativeImageTest
class NativeGreetingResourceIT : GreetingResourceTest() { // Execute the same tests but in native mode.
}

@NativeImageTest
class NativePersonResourceIT : PersonResourceTest() { // Execute the same tests but in native mode.
}