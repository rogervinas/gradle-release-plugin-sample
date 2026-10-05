plugins {
    id("net.researchgate.release") version "3.2.0"
}

tasks.named("build") {
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
    with (git) {
        requireBranch = ""
    }
}
