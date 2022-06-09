plugins {
    id("net.researchgate.release") version "2.8.1"
}

tasks.register("build") {
    doFirst {
        println("Building!")
    }
}

tasks.register("publish") {
    doFirst {
        println("Publishing!")
    }
}

release {
    with (propertyMissing("git") as net.researchgate.release.GitAdapter.GitConfig) {
        requireBranch = ""
    }
}
