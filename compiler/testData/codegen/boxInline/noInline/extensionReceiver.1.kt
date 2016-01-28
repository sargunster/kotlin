//NO_CHECK_LAMBDA_INLINING

fun box(): String {
    val res = { "OK" }.test()()
    if (res != "OKOKOK") return "fail 1: $res"

    return "OK"
}
