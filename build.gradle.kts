import com.hypherionmc.modpublisher.properties.CurseEnvironment
import com.hypherionmc.modpublisher.properties.ModLoader
import com.hypherionmc.modpublisher.properties.ReleaseType

plugins {
	id("fabric-loom") version "1.5-SNAPSHOT"
	id("com.hypherionmc.modutils.modpublisher") version "2.+"
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

	jar.get().exclude("io/github/jt122406/datagen/**")
}

publisher {
	apiKeys {
		curseforge(getPublishingCredentials().first)
		modrinth(getPublishingCredentials().second)
		github(project.properties["github_token"].toString())
	}
	curseID.set("965876")
	modrinthID.set("null")
	githubRepo.set("https://github.com/JT122406/ForgeTagsOnFabric")
	setReleaseType(ReleaseType.BETA)
	version.set(project.version.toString())
	displayName.set("${base.archivesName.get()}-${version.get()}")
	changelog.set("test changelog")
	artifact.set(tasks.remapJar)
	setGameVersions(minecraftVersion)
	setLoaders(ModLoader.FABRIC, ModLoader.QUILT)
	setCurseEnvironment(CurseEnvironment.SERVER)
}

private fun getPublishingCredentials(): Pair<String?, String?> {
	val curseForgeToken = (project.findProperty("curseforge_token") ?: System.getenv("CURSEFORGE_TOKEN") ?: "") as String?
	val modrinthToken = (project.findProperty("modrinth_token") ?: System.getenv("MODRINTH_TOKEN") ?: "") as String?
	return Pair(curseForgeToken, modrinthToken)
}