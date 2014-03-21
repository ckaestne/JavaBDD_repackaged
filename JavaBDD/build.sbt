name := "JavaBDD_repackaged"

version := "0.1"

sources in (Compile, doc) ~= (_ filter (_.getName endsWith "...."))

organization := "de.fosd.typechef"


homepage := Some(url("https://github.com/ckaestne/TypeChef"))

publishTo := {
                val nexus = "https://oss.sonatype.org/"
                if (isSnapshot.value)
                    Some("snapshots" at nexus + "content/repositories/snapshots")
                else
                    Some("releases" at nexus + "service/local/staging/deploy/maven2")
        }

publishMavenStyle := true

publishArtifact in Test := false

pomExtra := (
            <parent>
                <groupId>org.sonatype.oss</groupId>
                <artifactId>oss-parent</artifactId>
                <version>7</version>
            </parent> ++
                <scm>
                    <connection>scm:git:git@github.com:ckaestne/TypeChef.git</connection>
                    <url>git@github.com:ckaestne/TypeChef.git</url>
                </scm> ++
                <developers>
                    <developer>
                        <id>ckaestne</id> <name>Christian Kaestner</name> <url>http://www.cs.cmu.edu/~ckaestne/</url>
                    </developer>
                </developers>)

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

