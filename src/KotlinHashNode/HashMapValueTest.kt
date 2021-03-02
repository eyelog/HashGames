package KotlinHashNode

import Models.ValueKay

fun main() {

    val hm: Map<ValueKay, Int> = getData()
    val vk = ValueKay(1, "name")
    println(vk.hashCode())

    val value = hm[vk]

    println(value)
}

fun getData(): Map<ValueKay, Int> {
    val hm = hashMapOf<ValueKay, Int>()
    val vk = ValueKay(1, "name")
    println(vk.hashCode())

    hm[vk] = 10
    return hm
}
