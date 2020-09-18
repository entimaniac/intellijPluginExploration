package com.github.entimaniac.intellijpluginexploration.services

import com.intellij.openapi.project.Project
import com.github.entimaniac.intellijpluginexploration.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
