package com.github.jakspok.scalffoldcleanarchitectureplugin.services

import com.intellij.openapi.project.Project
import com.github.jakspok.scalffoldcleanarchitectureplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
