object Libs {

   const val kotlinVersion = "1.4.32"
   const val org = "io.kotest.extensions"

   object Kotlin {
      const val compilerEmbeddable = "org.jetbrains.kotlin:kotlin-compiler-embeddable:$kotlinVersion"
   }

   object Tschuchortdev {
      const val kotlinCompileTesting = "com.github.tschuchortdev:kotlin-compile-testing:1.6.0"
   }

   object Kotest {
      private const val version = "4.4.3"
      const val api = "io.kotest:kotest-framework-api:$version"
      const val engine = "io.kotest:kotest-framework-engine:$version"
      const val junit5 = "io.kotest:kotest-runner-junit5-jvm:$version"
   }
}
