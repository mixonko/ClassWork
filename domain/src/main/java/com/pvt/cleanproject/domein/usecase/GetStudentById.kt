package com.pvt.cleanproject.domein.usecase

import com.pvt.cleanproject.domein.entity.Student

interface GetStudentById {
    fun get(id: String) : Student
}