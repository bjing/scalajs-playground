# ScalaJS Playground
This is a place to experiment with ScalaJS.

## Config
Update SBT version in [build.properties](project/build.properties)

Update ScalaJS version in [build.properties](project/plugins.sbt)

Update dependency config in [build.sbt](build.sbt)

## Build, Run and Test
```sh
sbt compile
sbt run 
sbt test
````

## Generate Javascript
To perform fast Scala.js-specific optimizations and write the resulting 
JavaScript code to a directory:
```sh
sbt fastLinkJS
```
Output will be in `target/scala-2.13/scala-js-tutorial-fastopt/`

or
```sh
sbt fullLinkJS
```
This will produce a .js file that is fully optimized in another directory. 

Note that this can take a while and is therefore not recommended in the 
development cycle. 

The resulting directory in the target folder will have the suffix -opt.


### Use ScalaJS bundler
```sh
sbt fastOptJS::webpack
```
and output will be shown in the command output, for example:
```sh
[info]                                    Asset   Size                                    Chunks
[info]     scala-js-tutorial-fastopt-library.js   4571   [emitted]   [scala-js-tutorial-fastopt]
[info] scala-js-tutorial-fastopt-library.js.map   3846   [emitted]   [scala-js-tutorial-fastopt]
```
