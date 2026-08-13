package model

case class Document(id: Long, projectId: Long, title: String, docType: String, status: DocumentStatus, version: Int, filePath: Option[String], createdAt: java.time.LocalDateTime)