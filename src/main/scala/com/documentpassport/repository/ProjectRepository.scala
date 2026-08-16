package com.documentpassport.repository

import slick.jdbc.JdbcBackend.Database
import slick.jdbc.PostgresProfile.api._
import scala.concurrent.{Future}

class ProjectRepository(db: Database){
    def findAll: Future[Seq[Project]] = {
        db.run(Projects.query.result)
    }

    def findById(id: Long): Future[Option[Project]] = {
        db.run(Projects.query.filter(_.id === id).result.headOption)
    }

    def add(project: Project): Future[Long] = {
        db.run((Projects.query returning Projects.query.map(_.id)) += project)
    }
}