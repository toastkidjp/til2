package jp.toastkid.til2.nanoid

import com.aventrix.jnanoid.jnanoid.NanoIdUtils
import java.security.SecureRandom

fun main() {
    repeat(10) { println(NanoIdUtils.randomNanoId()) }
    repeat(10) { println(NanoIdUtils.randomNanoId(SecureRandom(), charArrayOf('a', 'x', '2', '$', '@'), 12)) }
}