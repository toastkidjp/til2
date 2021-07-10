package jp.toastkid.til2.nanoid

import com.aventrix.jnanoid.jnanoid.NanoIdUtils

fun main() {
    repeat(100) { println(NanoIdUtils.randomNanoId()) }
}