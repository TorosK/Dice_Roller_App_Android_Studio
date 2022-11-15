package com.example.diceroller

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 3)
    }

    @Test
    fun addition_isCorrect02() {
        assertEquals(5, 2 + 2)
    }

    @Test
    fun generates_number04() {
        val dice = Dice(4)
        val rollResult = dice.roll();
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

    @Test
    fun generates_number05() {
        val dice = Dice(5)
        val rollResult = dice.roll();
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

    @Test
    fun generates_number06() {
        val dice = Dice(6)
        val rollResult = dice.roll();
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

    @Test
    fun generates_number03() {
        val dice = Dice(3)
        val rollResult = dice.roll();
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..2)
    }
}