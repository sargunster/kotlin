@file:kotlin.jvm.JvmName("TimingKt")
@file:kotlin.jvm.JvmVersion
package kotlin.system

/**
 * Executes the given block and returns elapsed time in milliseconds.
 */
@kotlin.internal.InlineOnly
public inline fun measureTimeMillis(block: () -> Unit) : Long {
    val start = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - start
}

/**
 * Executes the given block and returns elapsed time in nanoseconds.
 */
@kotlin.internal.InlineOnly
public inline fun measureNanoTime(block: () -> Unit) : Long {
    val start = System.nanoTime()
    block()
    return System.nanoTime() - start
}

/**
 * Executes the given block and returns elapsed time in nanoseconds.
 */
@Deprecated("Use measureNanoTime.", ReplaceWith("measureNanoTime(block)"), level = DeprecationLevel.ERROR)
public inline fun measureTimeNano(block: () -> Unit) : Long = measureNanoTime(block)
