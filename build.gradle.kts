plugins {
	id("fabric-loom") version "1.5-SNAPSHOT"
	`maven-publish`
	java
	idea
}

val minecraftVersion = "1.20.4"
group = "io.github.jt122406"
version = "1.0.0"
base.archivesName.set("ForgeTagsOnFabric")

repositories {
	mavenCentral()
	maven("https://maven.fabricmc.net/")
	maven("https://maven.parchmentmc.org")
}

fabricApi.configureDataGeneration()

dependencies {
	minecraft("com.mojang:minecraft:${minecraftVersion}")
	modImplementation("net.fabricmc:fabric-loader:0.15.6")
	@Suppress("UnstableApiUsage")
	mappings(loom.layered {
		officialMojangMappings()
		parchment("org.parchmentmc.data:parchment-1.20.3:2023.12.31@zip")
	})
	modApi("net.fabricmc.fabric-api:fabric-api:0.95.1+$minecraftVersion")
}

tasks {
	processResources {
		inputs.property("version", version)

		filesMatching("fabric.mod.json") {
			expand("version" to version)
		}
	}
}