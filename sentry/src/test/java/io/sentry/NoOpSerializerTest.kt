package io.sentry

import kotlin.test.Test
import kotlin.test.assertEquals

class NoOpSerializerTest {
    private val sut: NoOpSerializer = NoOpSerializer.getInstance()

    @Test
    fun `serialize doesn't throw on null params`() = sut.serialize(null as SentryEvent?, null)

    @Test
    fun `deserializeEvent doesn't throw on null param`() {
        sut.deserialize(null, SentryEvent::class.java)
    }

    @Test
    fun `deserializeEvent returns null on NoOp`() {
        assertEquals(null, sut.deserialize(null, SentryEvent::class.java))
    }
}
