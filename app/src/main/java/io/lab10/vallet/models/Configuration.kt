package io.lab10.vallet.models

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class Configuration(@Id var id: Long = 0,
                var name: String = "",
                val value: String = "")