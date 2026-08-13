package config

import slick.jdbc.PostgresProfile.api._
import com.typesafe.config.ConfigFactory
import org.flywaydb.core.Flyway

object DatabaseConfig {
    val config = ConfigFactory.load()
    val url = config.getString("db.url")
    val user = config.getString("db.user")
    
    val password = config.getString("db.password")
    val driver = config.getString("db.driver")

    val confFlyway = Flyway.configure().dataSource(url,user,password).load().migrate()
}