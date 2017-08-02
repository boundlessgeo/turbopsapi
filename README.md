# turbopsapi
The API supporting the [TurboPS app](https://github.com/boundlessgeo/TurboPS).

## Getting started
`turbopsapi` is a [Spring Boot](https://projects.spring.io/spring-boot/) application. The contents of this repo is self contained enough to ensure that all necessary dependencies are automatically downloaded. The project is managed by [Gradle](https://gradle.org/) that takes care of the dependency management, building, running and generally keeping it all together.

Although the project was developed in Eclipse ([Spring Tool Suite](https://spring.io/tools) to be exact), there is no reason why it cannot be run with other IDEs (like IntelliJ, NetBeans, Atom etc). All Eclipse-specific configuration files are listed in the `.gitignore` file. The project generator ([Spring Initializr](https://start.spring.io/)) tried its best to ensure IDE-specific configuration files from popular IDEs are also ignored. Please try to maintain this practice so that there are minimal bumps as new developers take over.

Since the execution of this project is managed by Gradle and if you would like to run it from the IDE itself, please ensure that the IDE supports Gradle. With the right plugin, it is possible to make the execution completely push button.

The [wiki](https://github.com/boundlessgeo/turbopsapi/wiki) goes into more details about the project.
