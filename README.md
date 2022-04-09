# 

## Test Coverage - JaCoCo  
https://docs.gradle.org/current/userguide/jacoco_plugin.html
```
./gradlew test
./gradlew jacocoTestReport 
./gradlew jacocoTestCoverageVerification
```

## Bytecode bug scanning - SpotBugs
https://github.com/spotbugs/spotbugs-gradle-plugin

This plugin _also_ have plugins (plugin in plugin)
```shell
spotbugsPlugins 'com.h3xstream.findsecbugs:findsecbugs-plugin:1.11.0'
```

To run
```
./gradlew check
```