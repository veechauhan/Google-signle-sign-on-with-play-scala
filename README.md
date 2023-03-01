# Google-signle-sign-on-with-play-scala
## How to use it?
### Prerequisites
* [SBT](https://www.scala-sbt.org/download.html)
* [Java](https://www.oracle.com/in/java/technologies/downloads/)
* [scala](https://www.scala-lang.org/download/)
### Let's get started,
* Fork or clone this repository.
* Add your google credentials in view/index.scala.html file.
```
21 <meta name="google-signin-client_id" content="Add your google credentials">

```
```
    sbt clean           # Clean existing build artifacts

    sbt compile         # Build your application from your project’s source directory

    sbt run             # Run both backend and frontend builds in watch mode

    sbt test            # Run both backend and frontend unit tests
```
## Complete Directory Layout
```
    app                      → Application sources
   └ assets                → Compiled asset sources
      └ stylesheets        → Typically LESS CSS sources
      └ javascripts        → Typically CoffeeScript sources
   └ controllers           → Application controllers
   └ models                → Application business layer
   └ views                 → Templates
  build.sbt                → Application build script
  conf                     → Configurations files and other non-compiled resources (on classpath)
   └ application.conf      → Main configuration file
   └ routes                → Routes definition
  dist                     → Arbitrary files to be included in your projects distribution
  public                   → Public assets
   └ stylesheets           → CSS files
   └ javascripts           → Javascript files
   └ images                → Image files
  project                  → sbt configuration files
   └ build.properties      → Marker for sbt project
   └ plugins.sbt           → sbt plugins including the declaration for Play itself
  lib                      → Unmanaged libraries dependencies
  logs                     → Logs folder
   └ application.log       → Default log file
  target                   → Generated stuff
   └ resolution-cache      → Info about dependencies
   └ scala-2.13
      └ api                → Generated API docs
      └ classes            → Compiled class files
      └ routes             → Sources generated from routes
      └ twirl              → Sources generated from templates
   └ universal             → Application packaging
   └ web                   → Compiled web assets
  test                     → source folder for unit or functional tests

```
## Routes
* The following route configuration map index.html to entry route (root). This should be placed as the initial route.
```
GET     /                           controllers.HomeController.index()
GET     /signIn                     controllers.HomeController.userSignIn(authToken: String)
```
* The following route is being used to serve frontend associated build artifacts (css, js) and static assets (images, etc.). This should be placed as the final route.
```
GET     /assets/*file               controllers.Assets.versioned(path="/public", file: Asset)
```
