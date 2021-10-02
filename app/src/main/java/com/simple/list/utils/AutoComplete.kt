package com.simple.list.utils

typealias CustomFiler<T> = (T, String) -> Boolean

fun <T> List<T>.isAutoCompleteEntities(filter: CustomFiler<T>): List<NameAutoCompleteEntity<T>> {
    return map {
        object : NameAutoCompleteEntity<T> {
            override val value: T
                get() = it

            override fun filter(query: String): Boolean {
                return filter(value, query)
            }
        }
    }
}