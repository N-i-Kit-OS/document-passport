package model

import java.util.concurrent.atomic.AtomicLong

case class Project(id: Long, name: String, address: String, projectType: String, createdAt: java.time.LocalDateTime)

object Project{
    private val counter = new AtomicLong(0L)
    def generateId(): Long = counter.incrementAndGet()
}