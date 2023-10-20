package com.x8bit.bitwarden.ui.platform.base.util

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class StringExtensionTest {

    @Test
    fun `emails without an @ character should be invalid`() {
        val invalidEmails = listOf(
            "",
            " ",
            "test.com",
        )
        invalidEmails.forEach {
            assertFalse(it.isValidEmail())
        }
    }

    @Test
    fun `emails with an @ character should be valid`() {
        val validEmails = listOf(
            "@",
            "test@test.com",
            " test@test ",
        )
        validEmails.forEach {
            assertTrue(it.isValidEmail())
        }
    }
}
