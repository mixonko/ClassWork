package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.Student

interface GetStudentsUseCase {
    fun get() : List<Student>
}