package com.pvt.cleanproject.domein.usecase.student

import com.pvt.cleanproject.domein.entity.student.Student

interface GetStudentById {
    fun get(id: String) : Student
}