package com.github.c1240539157.intellijgpfplugin.services

import com.github.c1240539157.intellijgpfplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
