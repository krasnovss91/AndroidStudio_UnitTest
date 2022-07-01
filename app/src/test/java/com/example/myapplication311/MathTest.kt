package com.example.myapplication311

import junit.framework.Assert.assertEquals
import org.junit.After

import org.junit.Before
import org.junit.Test
import java.lang.Exception


class MathTest {
    private var mMath: Math? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mMath = Math()
    }

    @Test
    @Throws(Exception::class)
    fun testSum() {
        assertEquals(7, mMath!!.sum(3, 4))
    }

    @Test
    @Throws(Exception::class)
    fun testSubstract() {
        assertEquals(3, mMath!!.substract(5, 2))
    }

    @Test
    @Throws(Exception::class)
    fun testMul() {
        assertEquals(8, mMath!!.mul(2, 4))
    }

    @Test
    @Throws(Exception::class)
    fun testDiv() {
        assertEquals(3, mMath!!.div(15, 5))
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        mMath = null
    }
}