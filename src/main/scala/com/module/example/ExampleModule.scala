package com.module.example

object ExampleModule {
  import scala.scalajs.js.annotation._

  // Separate objects to allow for splitting.

  @JSExportAll
  object AppA {
    def addInts(a: Int, b: Int): Int = a + b

    def multiplyInts[A](a: Int, b: Int): Int = a * b

    @JSExportTopLevel(name = "subtractInts", moduleID = "ExampleModule")
    def subtractInts[A](a: Int, b: Int): Int = a - b
  }
}
