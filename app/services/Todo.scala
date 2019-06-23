package services

import javax.inject.Inject

import anorm.SqlParser._
import anorm._
import play.api.db.DBApi

import scala.language.postfixOps

case class Todo(id: Option[Long], name: String)

@javax.inject.Singleton
class TodoService @Inject() (dbApi: DBApi) {

  private val db = dbApi.database("default")

  val simple = {
    get[Option[Long]]("todo.id") ~
    get[String]("todo.name") map {
      case id ~ name => Todo(id, name)
    }
  }

  def list(): Seq[Todo] = {

    db.withConnection { implicit connection =>

      SQL(
        """
          SELECT * FROM todo
        """
      ).as(simple *)

    }

  }

  def findById(id: Long): Option[Todo] = {
    db.withConnection { implicit connection =>
      SQL(
        """
          SELECT * FROM todo WHERE id = {id}
        """
      ).on(
        'id -> id
      ).as(simple.singleOpt)
    }
  }

  def insert(todo: Todo): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          INSERT INTO todo (name) VALUES ({name})
        """
      ).on(
        'name -> todo.name
      ).executeUpdate()
    }
  }

  def update(id: Long, todo: Todo): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          UPDATE todo SET name = {name} WHERE id = {id}
        """
      ).on(
        'name -> todo.name,
        'id -> id
      ).executeUpdate()
    }
  }

  def delete(id: Long): Unit = {
    db.withConnection { implicit connection =>
      SQL(
        """
          DELETE FROM todo WHERE id = {id}
        """
      ).on(
        'id -> id
      ).executeUpdate()
    }
  }

}