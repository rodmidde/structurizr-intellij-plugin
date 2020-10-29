package com.github.rodmidde.structurizrintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.rodmidde.structurizrintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
