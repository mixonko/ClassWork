package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.Student

interface GetStudentById {
    fun get(id: String) : Student
}