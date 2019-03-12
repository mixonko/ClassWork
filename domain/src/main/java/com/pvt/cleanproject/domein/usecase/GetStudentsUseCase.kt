package com.pvt.cleanproject.domein.usecase

import com.pvt.cleanproject.domein.entity.Student

interface GetStudentsUseCase {
    fun get() : List<Student>
}