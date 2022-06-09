plugins {
    id("org.ajoberstar.grgit") version "4.1.1"
    id("net.researchgate.release") version "2.8.1"
}

release {
    pushReleaseVersionBranch = "${grgit.branch.current().getName()}-release"
    with (propertyMissing("git") as net.researchgate.release.GitAdapter.GitConfig) {
        requireBranch = ""
    }
}

beforeReleaseBuild {
    doLast {
        println("Before release!")
    }
}
