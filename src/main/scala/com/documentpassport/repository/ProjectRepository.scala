package com.documentpassport.repository

import slick.jdbc.PostgresProfile.api._
import slick.ast.ColumnOption
import slick.lifted.Rep
import slick.ast.TypedType
import slick.lifted.ProvenShape

case class Project(
    id: Option[Long], 
    name: String, 
    address: String, 
    projectType: String, 
    createdAt: java.time.LocalDateTime
)

class Projects(tag: Tag) extends Table[Project](tag, "projects") {
    val id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    val name = column[String]("name")
    val address = column[String]("address")
    val projectType = column[String]("project_type")
    val createdAt = column[java.time.LocalDateTime]("created_at")
    def * = (id.?, name, address, projectType, createdAt) <> ((Project.apply _).tupled, Project.unapply)
}

object Projects {
    val query = TableQuery[Projects]
}