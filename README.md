(# Aims Project

## Java Runtime

- **Target runtime:** Java 21 (LTS)

### Quick setup (Windows PowerShell)

1. Install JDK 21 (Eclipse Temurin / Adoptium or vendor of your choice).

2. Set `JAVA_HOME` and update `PATH` in PowerShell (temporary for current session):

```
$env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-21'  # adjust path
$env:PATH = "$env:JAVA_HOME\\bin;" + $env:PATH
java -version
```

For a persistent system-wide setting, use System Properties > Environment Variables.

### If you use Maven

Add or update the `maven-compiler-plugin` configuration to target Java 21 (in `pom.xml`):

```xml
<properties>
	<maven.compiler.source>21</maven.compiler.source>
	<maven.compiler.target>21</maven.compiler.target>
</properties>

<build>
	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.11.0</version>
			<configuration>
				<source>21</source>
				<target>21</target>
			</configuration>
		</plugin>
	</plugins>
</build>
```

Alternatively use a `<java.version>21</java.version>` property and bind plugins to it.

### If you use Gradle (Groovy DSL)

Set toolchain to Java 21 in `build.gradle`:

```gradle
java {
		toolchain {
				languageVersion = JavaLanguageVersion.of(21)
		}
}
```

Or for older Gradle versions:

```gradle
sourceCompatibility = '21'
targetCompatibility = '21'
```

### Command-line compile (simple projects)

Compile and run with `javac` / `java` after setting `JAVA_HOME`:

```
javac -d out src/com/hust/kstn/*.java
java -cp out com.hust.kstn.Aims
```

### Notes & next steps

- The automated Copilot upgrade tool is not available on this account; follow the snippets above to manually update build settings.
- If you want, I can:
	- create a `pom.xml` or `build.gradle` scaffold and apply the Java 21 settings,
	- or help install/configure JDK 21 on your machine and run a local build.
	- or create a Git branch and apply changes if you have a build tool to update.
  

