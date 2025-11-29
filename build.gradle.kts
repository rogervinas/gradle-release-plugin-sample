plugins {
    id("net.researchgate.release") version "3.1.0"
}

tasks.register("build") {
    doFirst {
        println("Building $version")
    }
}

tasks.register("publish") {
    doFirst {
        println("Publishing $version")
    }
}

release {
    tagTemplate = "v\$version"
    with (propertyMissing("git") as net.researchgate.release.GitAdapter.GitConfig) {
        requireBranch = ""
    }
}
