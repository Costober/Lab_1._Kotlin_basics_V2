fun Button(onClick: String, content: () -> String): String = "Btn($onClick) [${content()}]"

fun clickBtn(): String {
    // TODO: Викличте Button, конфігуруючи onClick і передаючи лямбду контенту

}