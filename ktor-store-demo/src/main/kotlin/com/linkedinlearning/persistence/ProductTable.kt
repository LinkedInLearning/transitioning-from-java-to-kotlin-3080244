package com.linkedinlearning.persistence

import org.jetbrains.exposed.sql.Table

object ProductTable : Table() {

    val upc = integer("upc").autoIncrement()
    val name = text("name")
    val description = text("description")

    override val primaryKey: PrimaryKey = PrimaryKey(upc)
}