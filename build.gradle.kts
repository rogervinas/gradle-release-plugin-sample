plugins {
    id("net.researchgate.release") version "2.8.1"
}

tasks.register("build") {
    doFirst {
        println("Building $version \uD83D\uDE0E")
    }
}

tasks.register("publish") {
    doFirst {
        println("Publishing $version \uD83D\uDE0E")
    }
}

release {
    with (propertyMissing("git") as net.researchgate.release.GitAdapter.GitConfig) {
        requireBranch = ""
    }
}
