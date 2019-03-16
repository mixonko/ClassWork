package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.student.Student

interface GetStudentsUseCase {
    fun get() : List<Student>
}