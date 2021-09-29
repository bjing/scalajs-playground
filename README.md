# ScalaJS Project Template
This is a good place to start for a new ScalaJS project.

## Config
Update SBT version in [build.properties](project/build.properties)

Update ScalaJS version in [build.properties](project/plugins.sbt)

Update dependency config in [build.sbt](build.sbt)

## Build
```sh
sbt compile
````

## Run
```sh
sbt run 
```

## Test
```sh
sbt test
```

## Generate Javascript
```sh
sbt fastLinkJS
```
Output will be in `target/scala-2.13/scala-js-tutorial-fastopt/main.js`
