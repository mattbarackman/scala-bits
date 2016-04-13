package org.scala_bits

object Lesson1 {

  case class Person(name: String, age: Int)

  def safeGreeting(person: Person): Option[String] = {
    Option(person.name).map( name => "Hello " + name.toUpperCase + "!" )
  }

  def unsafeGreeting(person: Person): String = {
    "Hello " + person.name.toUpperCase + "!"
  }

}