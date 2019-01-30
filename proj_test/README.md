# Building
The build is broken up into two jars, dependencies and the project jar itself. You must build both to successfully run the program.
https://github.com/sbt/sbt-assembly/#splitting-your-project-and-deps-jars


## Building Dependency Jar
`sbt assemblyPackageDependency`
This will create _ip-event-etl-assembly-1.0.1-deps.jar_

## Building Project Jar
`sbt assembly`
This will create _ip-event-etl-assembly-1.0.1.jar_

# Deploy
Deploy the built jars with Terraform. Navigate to terraform/<environment>/ and run `terraform apply` to deploy.

Notes:  
* http://spark.apache.org/docs/latest/structured-streaming-programming-guide.html#input-sources

# TODO
1. If one replacement is found but other's don't match, nullify the ones that don't match
2. Add ability to nullify a column specifically
3. Add ability to join on one column and replace a different one with the matched value