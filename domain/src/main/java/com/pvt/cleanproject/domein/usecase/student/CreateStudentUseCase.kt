package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.student.CreateStudent

interface CreateStudentUseCase {

    fun create (student: CreateStudent) : Boolean
}