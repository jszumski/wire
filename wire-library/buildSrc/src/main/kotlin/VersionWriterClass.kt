/*
 * Copyright (C) 2021 Block, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

abstract class VersionWriterTask : DefaultTask() {
  @Input
  val version = project.version

  @OutputDirectory
  val outputDir = project.layout.buildDirectory.file("src/generated/version/")

  @TaskAction
  fun writeVersionFile() {
    val outputFile = outputDir.get().asFile.resolve("com/squareup/wire/Version.kt")
    outputFile.parentFile.mkdirs()
    outputFile.writeText("""
      |package com.squareup.wire
      |
      |val VERSION = "$version"
      |""".trimMargin())
  }
}