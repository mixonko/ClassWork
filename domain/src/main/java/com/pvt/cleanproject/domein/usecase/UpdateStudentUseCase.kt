package com.pvt.cleanproject.domein.usecase

import com.pvt.cleanproject.domein.entity.Student

interface UpdateStudentUseCase {
    fun update(student: Student) : Boolean
}