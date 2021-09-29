enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.15" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// ECMAScript
//scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }
// CommonJS
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

// By default, ScalaJSBundlerPlugin assumes that your application only
// has a main class, activated through
// scalaJSUseMainModuleInitializer := true, and disregards top-level exports.
// If you have exports that need to be exposed as several entry points,
// the following config is required
webpackBundlingMode := BundlingMode.LibraryAndApplication()

