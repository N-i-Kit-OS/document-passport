package com.documentpassport

import  com.documentpassport.repository.{ProjectRepository, Project}
import scala.concurrent.ExecutionContext.Implicits.global
import config.DatabaseConfig
import scala.util.{Failure, Success}



object Main extends App {
    val db = DatabaseConfig.db
    val proj = Project(None, "name", "address", "projectType", java.time.LocalDateTime.now())

    val repo = new ProjectRepository(db)
    val res = for {
            inRes <- repo.add(proj)
            projects <- repo.findAll
        } yield projects

    res.andThen{case _ => db.close()}.onComplete{
        case Success(projects) => projects.foreach(println)
        case Failure(exception) => exception.printStackTrace()
    }
}