package com.github.maxexplode.jpatools.services

import com.github.maxexplode.jpatools.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
