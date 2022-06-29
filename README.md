[![Build](https://github.com/rogervinas/gradle-release-plugin-sample/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/rogervinas/gradle-release-plugin-sample/actions/workflows/ci.yml)

# Gradle Release Plugin Sample

Playing around with https://github.com/researchgate/gradle-release

Assumptions:
* Main branch is protected
* CI cannot generate release, it has to be done manually

Steps:
* Create a branch and a pull request adding the new version in [Changelog](CHANGELOG.md)
    * Just move `Unreleased` changes to the new version entry and change the links at the end of the file accordingly
    * **No changes to other files should be added to this pull request**
* Execute `./gradlew release -Prelease.useAutomaticVersion=true` or `./gradlew release -Prelease.releaseVersion=X.Y.Z` that will automatically:
    * Set version to the new released version and push to current branch
    * Tag released version triggering a CI pipeline that will publish artifacts and will create [release with notes in GitHub](https://github.com/n26/gradle-plugins/releases)
    * Set version to the next development \*-SNAPSHOT version and push to current branch
    * More info at [net.researchgate.release plugin](https://plugins.gradle.org/plugin/net.researchgate.release)
* Push changes and merge the pull request once approved
