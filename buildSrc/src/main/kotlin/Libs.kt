object Libs {

   const val kotlinVersion = "1.4.32"
   const val org = "io.kotest.extensions"

   object Kotlin {
      const val compilerEmbeddable = "org.jetbrains.kotlin:kotlin-compiler-embeddable:$kotlinVersion"
   }

   object Tschuchortdev {
      const val kotlinCompileTesting = "com.github.tschuchortdev:kotlin-compile-testing:1.4.5"
   }

   object Kotest {
      private const val version = "5.9.1"
      const val api = "io.kotest:kotest-framework-api:$version"
      const val engine = "io.kotest:kotest-framework-engine:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
   }
}
