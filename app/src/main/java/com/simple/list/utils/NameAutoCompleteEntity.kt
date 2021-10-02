package com.simple.list.utils

import androidx.compose.runtime.Stable

@Stable
interface NameAutoCompleteEntity<T> : AutoCompleteEntity {
    val value: T
}

@Stable
interface AutoCompleteEntity {
    fun filter(query: String): Boolean
}
