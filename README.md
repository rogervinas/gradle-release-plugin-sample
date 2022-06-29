[![Build](https://github.com/rogervinas/gradle-release-plugin-sample/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/rogervinas/gradle-release-plugin-sample/actions/workflows/ci.yml)

# Gradle Release Plugin Sample

Playing around with https://github.com/researchgate/gradle-release

Changelog:
* [Development](changelog/development.md)
* [Releases](../../releases)

Assumptions:
* Main branch is protected
* CI cannot generate release, it has to be done manually

Steps to create a new release:
* Create a branch and a pull request adding the changelog for next release:
  * Assuming next release is X.Y.Z and we kept description of unreleased changes in `changelog/development.md`
  * Just move contents of `changelog/development.md` to `changelog/vX.Y.Z.md`
  * No changes to other files should be added to this pull request
* Execute `./gradlew release -Prelease.useAutomaticVersion=true` or `./gradlew release -Prelease.releaseVersion=X.Y.Z` that will automatically:
  * Set version to the new released version and push to current branch
  * Tag released version triggering a CI pipeline that will publish artifacts and will create [release with notes in GitHub](../../releases)
  * Set version to the next development \*-SNAPSHOT version and push to current branch
* Push changes and merge the pull request once approved

More info:
* [Gradle Release plugin](https://github.com/researchgate/gradle-release)
* [GitHub Actions > expressions](https://docs.github.com/en/actions/learn-github-actions/expressions)
* [GitHub Actions > contexts](https://docs.github.com/en/actions/learn-github-actions/contexts)
