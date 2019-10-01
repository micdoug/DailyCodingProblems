package com.themissingdeveloper.coding.problems.p01

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


internal class SolutionKtTest {
    @Test
    fun returnTrueWhenExistsPairThatSumsToTarget() {
        val values = listOf(10, 15, 3, 7)
        assertTrue { existsPairThatSumsToTarget(values, 17) }
    }

    @Test
    fun returnFalseWhenDoesNotExistPairThatSumsToTarget() {
        val values = listOf(10, 15, 3, 7)
        assertFalse { existsPairThatSumsToTarget(values, 16) }
    }

    @Test
    fun returnFalseWhenEmptyListOfValues() {
        val values = emptyList<Int>()
        assertFalse { existsPairThatSumsToTarget(values, 1) }
    }

    @Test
    fun returnTrueWhenSumIsComposedOfTwoEqualValues() {
        val values = listOf(1, 2, 2, 4, 5)
        assertTrue { existsPairThatSumsToTarget(values, 4) }
    }
}
