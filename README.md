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

## File bug scanning - PMD
https://docs.gradle.org/current/userguide/pmd_plugin.html

Rule-sets refs:
- https://pmd.github.io/pmd-6.44.0/pmd_userdocs_making_rulesets.html
- https://github.com/pmd/pmd/tree/master/pmd-java/src/main/resources/rulesets/java

Blog example using external config files _PREFERRED_: 
- https://github.com/darrendanvers/pmd-gradle-example

To run
```
./gradlew check
```

## OWASP Dependency-Check 
https://plugins.gradle.org/plugin/org.owasp.dependencycheck

Refs:
- https://jeremylong.github.io/DependencyCheck/dependency-check-gradle/configuration.html

To run
```
./gradlew dependencyCheckAnalyze
```