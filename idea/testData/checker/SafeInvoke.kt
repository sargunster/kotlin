class Rule(val apply: () -> Unit)

fun foo() {
    val rule: Rule? = Rule { }
    rule?.<error descr="[UNSAFE_IMPLICIT_INVOKE_CALL] Reference has a nullable type (() -> kotlin.Unit)?, use explicit ?.invoke() to make function-like call instead">apply</error>()
    val apply = rule?.apply
    <error descr="[UNSAFE_IMPLICIT_INVOKE_CALL] Reference has a nullable type (() -> kotlin.Unit)?, use explicit ?.invoke() to make function-like call instead">apply</error>()
}