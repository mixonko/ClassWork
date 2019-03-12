package com.pvt.cleanproject.domein.usecase

import com.pvt.cleanproject.domein.entity.CreateStudent

interface CreateStudentUseCase {

    fun create (student: CreateStudent) : Boolean
}