object Ci {

   // this is the version used for building snapshots
   // .GITHUB_RUN_NUMBER-snapshot will be appended
   private const val snapshotBase = "1.0.0"

   private val githubRunNumber = System.getenv("GITHUB_RUN_NUMBER")

   private val snapshotVersion = when (githubRunNumber) {
      null -> "$snapshotBase-LOCAL"
      else -> "$snapshotBase.${githubRunNumber}-SNAPSHOT"
   }

   object Tschuchortdev {
      const val kotlinCompileTesting = "com.github.tschuchortdev:kotlin-compile-testing:1.4.2"
   }

   private val releaseVersion = System.getenv("RELEASE_VERSION")

   val isRelease = releaseVersion != null
   val version = releaseVersion ?: snapshotVersion
}
