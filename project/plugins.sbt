resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.13.0")